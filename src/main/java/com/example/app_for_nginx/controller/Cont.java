package com.example.app_for_nginx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolationException;

@RestController
@RequestMapping("/")
public class Cont implements ErrorController {
    @Value("${server.port}")
    private String port;

    @GetMapping
    public String showPage() {
        return "this is a page from SpringBootApp, port:" + port;
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public String handleRegexException() {
        return "- нельзя использовать только цифры <br>" +
                "- можно A-Z 0-9 и точку<br>" +
                "- длина не менее 5 символов не более 50<br>" +
                "- нельзя точку в начале или конце, две точки подряд<br>";
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleEverything() {
        return "Oh no, seems a mistake has happened!";
    }

    @RequestMapping(value = "/error")
    public String error() {
        return "Oh no, seems a mistake has happened!";
    }
}
