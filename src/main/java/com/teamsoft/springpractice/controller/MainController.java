package com.teamsoft.springpractice.controller;

import com.teamsoft.springpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")  //http://localhost:8080?list=3,2,1
    public String hello(@RequestParam(required = true) List<String> list) {
        return sortService.doSort(list).toString();
    }

}
