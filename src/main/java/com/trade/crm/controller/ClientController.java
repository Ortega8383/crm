package com.trade.crm.controller;

import com.trade.crm.dto.ClientDTO;
import com.trade.crm.dto.VendorDTO;
import com.trade.crm.service.ClientService;
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
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/create")
    public String createClient(Model model) {

        model.addAttribute("client", new ClientDTO());

        return "client/client-create";
    }
    @PostMapping("/insert")
    public String insertClient(@ModelAttribute("client") @Valid ClientDTO clientDTO, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "client/client-create";
        }

        clientService.save(clientDTO);
        model.addAttribute("client", new ClientDTO());
        return "client/client-success";
    }

    @GetMapping("/list")
    public String listClients(Model model) {
        model.addAttribute("clientList", clientService.listAllClients());
        return "client/client-list";
    }
}
