package net.therap.controller;

import net.therap.command.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Contended;

/**
 * @author safat
 * @since 4/1/17
 */
@Controller
public class DoneController {

    private static final String VIEW_PAGE = "done";

    @RequestMapping(value = "/done", method = RequestMethod.GET)
    public String show(@ModelAttribute("project") Project project,
                       ModelMap model) {

        model.put("project", project);

        return VIEW_PAGE;
    }
}
