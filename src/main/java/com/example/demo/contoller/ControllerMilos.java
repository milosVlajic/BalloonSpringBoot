package com.example.demo.contoller;

import com.example.demo.service.ServiceMilos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMilos {
    @Autowired
    ServiceMilos serviceMilos;

    @PostMapping("/inputstring")
    public String getBalon(@RequestParam("input") String input, Model model){
        String howManyBaloon = "I found " + serviceMilos.maxNumberOfBalloons(input) + " balloons in your string.";
        model.addAttribute("output", howManyBaloon);
        return "index";
    }

    @GetMapping("/")
    public String start(){
        return "index";
    }

}
