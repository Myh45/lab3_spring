package com.example.demo.controllers;

import com.example.demo.models.Model;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/v1/coordinates")
public class AppController {
    @Autowired
    private Repository repository;
    @GetMapping
    public @ResponseBody
    Iterable<Model> findAll() {
        return repository.findAll();
    }
}
