package com.trade.crm.service.impl;

import com.trade.crm.dto.VendorDTO;
import com.trade.crm.entity.Vendor;
import com.trade.crm.repository.VendorRepository;
import com.trade.crm.service.VendorService;
import com.trade.crm.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendorServiceImpl implements VendorService {

    private final VendorRepository vendorRepository;
    private final MapperUtil mapperUtil;

    public VendorServiceImpl(VendorRepository vendorRepository, MapperUtil mapperUtil) {
        this.vendorRepository = vendorRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public void save(VendorDTO vendorDTO) {

        vendorRepository.save(mapperUtil.convert(vendorDTO, new Vendor()));

    }

    @Override
    public List<VendorDTO> listAllVendors() {

        List<Vendor> vendorList = vendorRepository.findAll();

        return vendorList.stream().map(vendor -> mapperUtil.convert(vendor, new VendorDTO()))
                .collect(Collectors.toList());
    }
}
