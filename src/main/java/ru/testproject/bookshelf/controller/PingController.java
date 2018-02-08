package ru.testproject.bookshelf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PingController {
    /**
     * Проверка доступности приложения
     */
    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }
}
