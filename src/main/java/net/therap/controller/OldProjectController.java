package net.therap.controller;

import net.therap.command.Login;
import net.therap.command.Project;
import net.therap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author safat
 * @since 12/22/16
 */
public class OldProjectController extends SimpleFormController {

    private static final String VIEW_PAGE = "project";

    @Autowired
    private UserService userService;

    @Override
    protected ModelAndView showForm(HttpServletRequest request, HttpServletResponse response,
                                    BindException errors) throws Exception {

        Map model = new HashMap<>();
        model.put("users", userService.getLogins());
        model.put("title", "Old Project Create Page");
        model.put("project", new Project());

        return new ModelAndView(VIEW_PAGE, model);
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        return new Login();
    }
}
