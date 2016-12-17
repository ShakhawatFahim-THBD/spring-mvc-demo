package net.therap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    private static final String VIEW_PAGE = "index";

    @RequestMapping("/test")
    public String loadHomePage(Model model) {

        model.addAttribute("message", "#4 Hello World updated!");

        return VIEW_PAGE;
    }
}
