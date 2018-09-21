package edu.pucmm.practica_nueve.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    public String index(Model model, HttpSession httpSession){
        return "form";
    }
}
