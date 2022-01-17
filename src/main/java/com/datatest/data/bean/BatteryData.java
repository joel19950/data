package com.datatest.data.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="BatteryData")
public class BatteryData {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    
    @Column(name="Voltage")
    private long Voltage;
    @Column(name="OutputVoltage")
    private long OutputVoltage;


   
    //pour voltage
    public long getVoltage() {
        return Voltage;
    }

    public void setVoltage(long voltage) {
        this.Voltage = voltage;
    }


    
    //pour le outputvoltage
    public long getOutputVoltage() {
        return OutputVoltage;
    }
    public void setOutputVoltage(long outputVoltage) {
        this.OutputVoltage = outputVoltage;
    }



    //pour l'id
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
