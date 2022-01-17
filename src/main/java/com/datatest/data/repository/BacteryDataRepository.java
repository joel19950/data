package com.datatest.data.repository;

import com.datatest.data.bean.BatteryData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BacteryDataRepository extends JpaRepository<BatteryData, Long>{
    
}
