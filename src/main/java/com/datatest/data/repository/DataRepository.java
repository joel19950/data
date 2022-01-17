package com.datatest.data.repository;

import com.datatest.data.bean.Data;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DataRepository  extends JpaRepository<Data, Long>{
    
}
