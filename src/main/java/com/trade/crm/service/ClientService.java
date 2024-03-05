package com.trade.crm.service;

import com.trade.crm.dto.ClientDTO;
import com.trade.crm.dto.VendorDTO;

import java.util.List;

public interface ClientService {
    void save(ClientDTO clientDTO);
    List<ClientDTO> listAllClients();
}
