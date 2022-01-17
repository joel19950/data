package com.datatest.data.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Module_l {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    @Column(name="ModuleSN")
    private long ModuleSN;
    @Column(name="Current")
    private long Current;
    @Column(name="SoH")
    private Double SoH;
    @Column(name="SoC")
    private Double SoC;
    @Column(name="Temperature_Senior")
    private int Temperature_Senior;
    @Column(name="Temperature_uc")
    private int Temperature_uc;
    
    
    //get And setter for id
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    //get And setter for  Temperature_uc
    public int getTemperature_uc() {
        return Temperature_uc;
    }

    public void setTemperature_uc(int temperature_uc) {
        this.Temperature_uc = temperature_uc;
    }

    //get And setter for Temperature_Senior
    public int getTemperature_Senior() {
        return Temperature_Senior;
    }
    public void setTemperature_Senior(int temperature_Senior) {
        this.Temperature_Senior = temperature_Senior;
    }

    
    //get And setter for soc
    public Double getSoC() {
        return SoC;
    }


    public void setSoC(Double soC) {
        this.SoC = soC;
    }

    //get And setter for moduleSN
    public long getModuleSN() {
        return ModuleSN;
    }
    public void setModuleSN(long moduleSN) {
        this.ModuleSN = moduleSN;
    }

    //get And setter for moduleSN
    public long getCurrent() {
        return Current;
    }

    public void setCurrent(long current) {
        this.Current = current;
    }


    //get And setter for SoH
    public Double getSoH() {
        return SoH;
    }



    public void setSoH(Double soH) {
        this.SoH = soH;
    }
     

}
