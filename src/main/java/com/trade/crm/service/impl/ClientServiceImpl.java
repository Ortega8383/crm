package com.trade.crm.service.impl;

import com.trade.crm.dto.ClientDTO;
import com.trade.crm.dto.VendorDTO;
import com.trade.crm.entity.Client;
import com.trade.crm.entity.Vendor;
import com.trade.crm.repository.ClientRepository;
import com.trade.crm.repository.VendorRepository;
import com.trade.crm.service.ClientService;
import com.trade.crm.service.VendorService;
import com.trade.crm.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final MapperUtil mapperUtil;

    public ClientServiceImpl(ClientRepository clientRepository, MapperUtil mapperUtil) {
        this.clientRepository = clientRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public void save(ClientDTO clientDTO) {
        clientRepository.save(mapperUtil.convert(clientDTO, new Client()));
    }

    @Override
    public List<ClientDTO> listAllClients() {
        List<Client> clientList = clientRepository.findAll();
        return clientList.stream().map(client -> mapperUtil.convert(client, new ClientDTO()))
                .collect(Collectors.toList());
    }
}
