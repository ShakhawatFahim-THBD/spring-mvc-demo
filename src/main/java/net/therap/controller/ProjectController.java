package net.therap.controller;

import net.therap.command.Login;
import net.therap.command.Project;
import net.therap.command.ProjectType;
import net.therap.editor.LoginEditor;
import net.therap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.validation.Valid;

@Controller
public class ProjectController {

    private static final String VIEW_PAGE = "project";
    private static final String VIEW_PAGE1 = "project1";
    private static final String VIEW_PAGE2 = "project2";
    private static final String VIEW_PAGE3 = "project3";
    private static final String DONE_PAGE = "done";
    public static final String COMMAND = "project";

    @Autowired
    private UserService userService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(null, true));
        binder.registerCustomEditor(Login.class, new LoginEditor());
        binder.registerCustomEditor(Long.class, new CustomNumberEditor(Long.class, true));
    }

    @RequestMapping(value = "/project1", method = RequestMethod.GET)
    public String showProject1(ModelMap model) {

        setupReferenceData(model, new Project());

        return VIEW_PAGE1;
    }

    @RequestMapping(value = "/project1", params = "_action_save", method = RequestMethod.POST)
    public String saveProject1(ModelMap model,
                               @Valid @ModelAttribute Project project,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            setupReferenceData(model, project);
            return VIEW_PAGE1;
        }

        redirectAttributes.addFlashAttribute("project", project);

        return "redirect:done";
    }


    @RequestMapping(value = "/project", params = "_action_save", method = RequestMethod.POST)
    public String save(ModelMap model,
                       @Valid @ModelAttribute Project project,
                       BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            setupReferenceData(model, project);
            return VIEW_PAGE;
        }

        return DONE_PAGE;
    }

    private void setupReferenceData(ModelMap model, Project project) {
        model.put("title", "New Project Create Page");
        model.put("logins", userService.getLogins());
        model.put("projectTypes", ProjectType.values());
        model.put("project", project);
    }

    @PreDestroy
    public void preDestory() {
        System.out.println("Destroying " + this.getClass());
    }

    @PostConstruct
    public void postContruct() {
        System.out.println("Constructed " + this.getClass());
    }
}
