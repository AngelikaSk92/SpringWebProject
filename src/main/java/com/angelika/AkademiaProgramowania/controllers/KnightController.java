package com.angelika.AkademiaProgramowania.controllers;

import com.angelika.AkademiaProgramowania.domain.Knight;
import com.angelika.AkademiaProgramowania.services.KnightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KnightController {

    @Autowired
    KnightService knightService;

    @RequestMapping("/knights")
    public String getKnights(Model model){
        List<Knight> knights= knightService.getKnights();
        model.addAttribute("knigts", knights);
        return "knights";
    }

    @RequestMapping("/newknight")
    public String creareKnight(Model model){
        model.addAttribute("emptyKnight", new Knight());
        return "knightform";
    }

    @RequestMapping(value = "/knights", method = RequestMethod.POST)
    public String createKnight(Knight knight){
        knightService.saveKnight(knight);
        return "redirect:/knights";
    }

    @RequestMapping("/knight")
    public String getKnight(@RequestParam("id") Integer id,  Model model){
        Knight knight =knightService.getKnight(id);
        model.addAttribute("knight", knight);
        return "knightDetails";
    }

}
