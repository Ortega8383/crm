package com.trade.crm.repository;

import com.trade.crm.entity.PotentialVendor;
import com.trade.crm.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PotentialVendorRepository extends JpaRepository<PotentialVendor, Integer> {
}
