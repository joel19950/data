package com.datatest.data.bean;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Data")
public class Data {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;  
    @Column(name="time")
    private Time time;
    //creation de la relation etre les table
    @OneToOne(cascade = CascadeType.ALL)
	private BatteryData batteryData;
    
   /* @OneToOne(cascade = CascadeType.ALL)
    private Module_l module_l;*/
    
  /*  public Module_l getModule_l() {
        return module_l;
    }
    
    public void setModule_l(Module_l module_l) {
        this.module_l = module_l;
    }*/

    public BatteryData getBatteryData() {
        return batteryData;
    }

    public void setBatteryData(BatteryData batteryData) {
        this.batteryData = batteryData;
    }

    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
   
    
}
