package com.kalaari.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kalaari.exception.KalaariException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Validated
@RestController
@RequestMapping(value = "api/v1/kalaari")
public class GraphController {

    @GetMapping(value = "/do_something")
    @ResponseBody
    public void doSomething(@RequestParam(value = "x", required = false) String x) throws KalaariException {
    }
}