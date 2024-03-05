package com.trade.crm.repository;

import com.trade.crm.entity.Client;
import com.trade.crm.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
