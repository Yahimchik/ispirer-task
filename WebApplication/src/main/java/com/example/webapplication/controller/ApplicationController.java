package com.example.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Controller
 * @see GetMapping
 */

@Controller
public class ApplicationController {

    /**
     * Annotation is a specialized version of @RequestMapping
     * annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET).
     *
     * @return mainpage.html
     */

    @GetMapping("/")
    public String getMainPage() {
        return "mainpage";
    }
}
