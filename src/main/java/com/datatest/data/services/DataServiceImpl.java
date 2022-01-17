package com.datatest.data.services;

import java.util.List;

import com.datatest.data.bean.Data;
import com.datatest.data.repository.DataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl  implements DataService{
    @Autowired
    DataRepository dataRepository;

    @Override
    public void createData(Data data) {
		System.out.println("user addr:");
		dataRepository.save(data);
	}

    @Override
    public List<Data> getData() {
        
        return (List<Data>) dataRepository.findAll();
    }



}
