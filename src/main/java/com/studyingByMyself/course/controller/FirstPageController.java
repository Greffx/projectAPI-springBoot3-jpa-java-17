package com.studyingByMyself.course.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstPageController {

    @GetMapping
    public String firstPageHelloWorld() {
        return "Hello First page!";
    }
}
