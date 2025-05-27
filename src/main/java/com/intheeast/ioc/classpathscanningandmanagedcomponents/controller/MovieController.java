package com.intheeast.ioc.classpathscanningandmanagedcomponents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class MovieController {
    public void display() {
        System.out.println("MovieController: Display movies.");
    }
}
