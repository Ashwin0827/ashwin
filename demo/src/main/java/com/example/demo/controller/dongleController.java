package com.example.demo.controller;
import com.example.demo.model.Register;
import com.example.demo.model.dongle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
@Slf4j
@Controller
@RequestMapping("/dongle")
public class dongleController {
    /*public String show_register(Model model){
        List<Register> mylist= Arrays.asList(
                new register("varnika",999,"varnika@gmail.com","****")
        );
        model.addAttribute("account",mylist);

        return "register";

    }*/
    @ModelAttribute
    @GetMapping
    public String show_register(Model model){
        model.addAttribute("dongle",new dongle());
        return "dongle";
    }
/*
@GetMapping("/register")
public String showRegister(){
    return "register";
}
*/

    @PostMapping
    public String processRegister(@Valid dongle dongle, Errors errors) {
        if (errors.hasErrors()) {
            return "dongle";
        }

        // Save the taco design...
        // We'll do this in chapter 3
        /* log.info("Processing design: " + register);*/

        return "dongle";
}
