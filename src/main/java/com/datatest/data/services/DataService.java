package com.datatest.data.services;

import java.util.List;

import com.datatest.data.bean.Data;

public interface DataService {
    public void createData(Data data); 
    public List<Data> getData(); 

}
