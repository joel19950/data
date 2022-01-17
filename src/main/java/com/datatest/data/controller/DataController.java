package com.datatest.data.controller;

import java.util.List;

import com.datatest.data.bean.Data;
import com.datatest.data.repository.DataRepository;
import com.datatest.data.services.DataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/data"})
public class DataController {

    @Autowired
	DataService dataService;


    private DataRepository dataRepository;
    public DataController(DataRepository dataRepository){
        this.dataRepository=dataRepository;
    }

// post data in database
    @PostMapping(value="/create", headers="Accept=application/json")
    public Data register(@RequestBody Data data){
    return dataRepository.save(data);
      }
    @PostMapping(value="/us", headers="Accept=application/json")
    public void createUser(@RequestBody Data data){
         System.out.println("Creating User ");
          dataService.createData(data);
                                                 }

//get all data
    @GetMapping(value="/get", headers="Accept=application/json")
	 public List<Data> getAllUser() {	 
	  List<Data> tasks=dataService.getData();
	  return tasks;
	 }




}
