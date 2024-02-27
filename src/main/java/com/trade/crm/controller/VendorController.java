package com.trade.crm.controller;

import com.trade.crm.dto.VendorDTO;
import com.trade.crm.entity.Vendor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendor")
public class VendorController {
    @GetMapping("/create")
    public String createVendor(Model model) {

        model.addAttribute("vendor", new VendorDTO());

        return "vendor/vendor-create";
    }
    @PostMapping("/insert")
    public String insertVendor() {

    }
}
