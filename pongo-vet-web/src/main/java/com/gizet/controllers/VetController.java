package com.gizet.controllers;

import com.gizet.services.interfaces.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "vets/vetIndex"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/vetIndex";
    }
}
