package com.trade.crm.service;

import com.trade.crm.dto.VendorDTO;

import java.util.List;

public interface VendorService {
    void save(VendorDTO vendorDTO);
    List<VendorDTO> listAllVendors();
}
