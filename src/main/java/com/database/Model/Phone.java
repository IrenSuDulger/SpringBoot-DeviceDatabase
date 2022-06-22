package com.database.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Phone {
    //mark id as primary key
    @Id
//defining id as column name
    @Column
    private int id;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private String os;
    @Column
    private String osVersion;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getOs() { return os; }
    public void setOs(String os)
    {
        this.os = os;
    }
    public String getOsVersion()
    {
        return osVersion;
    }
    public void setOsVersion(String osVersion)
    {
        this.osVersion = osVersion;
    }

}
