package com.trade.crm.controller;

import com.trade.crm.dto.VendorDTO;
import com.trade.crm.entity.Vendor;
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
@RequestMapping("/vendor")
public class VendorController {

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("/create")
    public String createVendor(Model model) {

        model.addAttribute("vendor", new VendorDTO());

        return "vendor/vendor-create";
    }
    @PostMapping("/insert")
    public String insertVendor(@ModelAttribute("vendor") @Valid VendorDTO vendorDTO, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "vendor/vendor-create";
        }

        vendorService.save(vendorDTO);
        model.addAttribute("vendor", new VendorDTO());
        return "vendor/vendor-success";
    }

    @GetMapping("/list")
    public String listVendors(Model model) {
        model.addAttribute("vendorList", vendorService.listAllVendors());
        return "vendor/vendor-list";
    }
}
