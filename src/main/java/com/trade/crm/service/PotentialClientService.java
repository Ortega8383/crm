package com.trade.crm.service;

import com.trade.crm.dto.PotentialClientDTO;
import com.trade.crm.dto.PotentialVendorDTO;

import java.util.List;

public interface PotentialClientService {
    void save(PotentialClientDTO potentialClientDTO);
    List<PotentialClientDTO> listAllPotentialClients();
}
