package com.trade.crm.service.impl;

import com.trade.crm.dto.PotentialVendorDTO;
import com.trade.crm.dto.VendorDTO;
import com.trade.crm.entity.PotentialVendor;
import com.trade.crm.entity.Vendor;
import com.trade.crm.repository.PotentialVendorRepository;
import com.trade.crm.repository.VendorRepository;
import com.trade.crm.service.PotentialVendorService;
import com.trade.crm.service.VendorService;
import com.trade.crm.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PotentialVendorServiceImpl implements PotentialVendorService {

    private final PotentialVendorRepository potentialVendorRepository;
    private final MapperUtil mapperUtil;

    public PotentialVendorServiceImpl(PotentialVendorRepository potentialVendorRepository, MapperUtil mapperUtil) {
        this.potentialVendorRepository = potentialVendorRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public void save(PotentialVendorDTO potentialVendorDTO) {
        potentialVendorRepository.save(mapperUtil.convert(potentialVendorDTO, new PotentialVendor()));

    }

    @Override
    public List<PotentialVendorDTO> listAllPotentialVendors() {

        List<PotentialVendor> potentialVendorList = potentialVendorRepository.findAll();

        return potentialVendorList.stream().map(potentialVendor -> mapperUtil.convert(potentialVendor, new PotentialVendorDTO()))
                .collect(Collectors.toList());
    }
}
