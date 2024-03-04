package com.trade.crm.service;

import com.trade.crm.dto.PotentialVendorDTO;
import com.trade.crm.dto.VendorDTO;

import java.util.List;

public interface PotentialVendorService {
    void save(PotentialVendorDTO potentialVendorDTO);
    List<PotentialVendorDTO> listAllPotentialVendors();
}
