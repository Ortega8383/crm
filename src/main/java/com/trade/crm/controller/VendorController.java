package com.trade.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendor")
public class VendorController {
    @GetMapping("/create")
    public String createVendor() {
        return "vendor/vendor-create";
    }
}