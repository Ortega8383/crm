package com.trade.crm.controller;

import com.trade.crm.dto.PotentialClientDTO;
import com.trade.crm.dto.PotentialVendorDTO;
import com.trade.crm.service.PotentialClientService;
import com.trade.crm.service.PotentialVendorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/potentialClient")
public class PotentialClientController {

    private final PotentialClientService potentialClientService;

    public PotentialClientController(PotentialClientService potentialClientService) {
        this.potentialClientService = potentialClientService;
    }

    @GetMapping("/create")
    public String createPotentialClient(Model model) {

        model.addAttribute("potentialClient", new PotentialClientDTO());

        return "potentialClient/potentialClient-create";
    }
    @PostMapping("/insert")
    public String insertPotentialClient(@ModelAttribute("potentialClient") @Valid PotentialClientDTO potentialClientDTO, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "potentialClient/potentialClient-create";
        }

        potentialClientService.save(potentialClientDTO);
        model.addAttribute("potentialClient", new PotentialClientDTO());
        return "potentialClient/potentialClient-success";
    }

    @GetMapping("/list")
    public String listPotentialClients(Model model) {
        model.addAttribute("potentialClientList", potentialClientService.listAllPotentialClients());
        return "potentialClient/potentialClient-list";
    }
}
