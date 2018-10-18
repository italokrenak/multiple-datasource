package com.example.datasource.resources;

import com.example.datasource.bar.domain.Bar;
import com.example.datasource.bar.repository.BarRepository;

import com.example.datasource.foo.domain.Foo;
import com.example.datasource.foo.repository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class FooBarController {

    @Autowired
    private FooRepository fooRepository;

    @Autowired
    private BarRepository barRepository;

    /*@RequestMapping("/foobar/{id}")
    public String fooBar(@PathVariable("id") Long id) {
        Foo foo = fooRepository.findAll().get(0);
        Bar bar = barRepository.findAll().get(0);

        return foo.getFoo() + " " + bar.getBar();
    }*/

    @GetMapping("/foobar")
    public String fooBar() {
        Foo foo = fooRepository.findAll().get(0);
        Bar bar = barRepository.findAll().get(0);

        return foo.getFoo() + " " + bar.getBar();
    }
}
