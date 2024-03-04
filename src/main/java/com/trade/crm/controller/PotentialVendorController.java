package com.trade.crm.controller;

import com.trade.crm.dto.PotentialVendorDTO;
import com.trade.crm.dto.VendorDTO;
import com.trade.crm.service.PotentialVendorService;
import com.trade.crm.service.VendorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/potentialVendor")
public class PotentialVendorController {

    private final PotentialVendorService potentialVendorService;

    public PotentialVendorController(PotentialVendorService potentialVendorService) {
        this.potentialVendorService = potentialVendorService;
    }

    @GetMapping("/create")
    public String createPotentialVendor(Model model) {

        model.addAttribute("potentialVendor", new PotentialVendorDTO());

        return "potentialVendor/potentialVendor-create";
    }
    @PostMapping("/insert")
    public String insertPotentialVendor(@ModelAttribute("potentialVendor") @Valid PotentialVendorDTO potentialVendorDTO, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "potentialVendor/potentialVendor-create";
        }

        potentialVendorService.save(potentialVendorDTO);
        model.addAttribute("potentialVendor", new PotentialVendorDTO());
        return "potentialVendor/potentialVendor-success";
    }

    @GetMapping("/list")
    public String listPotentialVendors(Model model) {
        model.addAttribute("potentialVendorList", potentialVendorService.listAllPotentialVendors());
        return "potentialVendor/potentialVendor-list";
    }
}
