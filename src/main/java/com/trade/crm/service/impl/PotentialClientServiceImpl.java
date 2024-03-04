package com.trade.crm.service.impl;

import com.trade.crm.dto.PotentialClientDTO;
import com.trade.crm.dto.PotentialVendorDTO;
import com.trade.crm.entity.PotentialClient;
import com.trade.crm.entity.PotentialVendor;
import com.trade.crm.repository.PotentialClientRepository;
import com.trade.crm.repository.PotentialVendorRepository;
import com.trade.crm.service.PotentialClientService;
import com.trade.crm.service.PotentialVendorService;
import com.trade.crm.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PotentialClientServiceImpl implements PotentialClientService {

    private final PotentialClientRepository potentialClientRepository;
    private final MapperUtil mapperUtil;

    public PotentialClientServiceImpl(PotentialClientRepository potentialClientRepository, MapperUtil mapperUtil) {
        this.potentialClientRepository = potentialClientRepository;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public void save(PotentialClientDTO potentialClientDTO) {
        potentialClientRepository.save(mapperUtil.convert(potentialClientDTO, new PotentialClient()));
    }

    @Override
    public List<PotentialClientDTO> listAllPotentialClients() {
        List<PotentialClient> potentialClientList = potentialClientRepository.findAll();
        return potentialClientList.stream().map(potentialClient -> mapperUtil.convert(potentialClient, new PotentialClientDTO())).collect(Collectors.toList());
    }
}
