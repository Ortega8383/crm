package com.trade.crm.repository;

import com.trade.crm.entity.PotentialClient;
import com.trade.crm.entity.PotentialVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PotentialClientRepository extends JpaRepository<PotentialClient, Integer> {
}
