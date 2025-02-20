package cz.tul.stin2025.cv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCommandController {
    @GetMapping("/api")
    public String test(){
        return "Hello World";
    }
}
