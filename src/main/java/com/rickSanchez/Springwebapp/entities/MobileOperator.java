package com.rickSanchez.Springwebapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobileOperator_tb")
public class MobileOperator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nameOperator")
    private String nameOperator;
    @Column(name = "nameRegion")
    private String nameRegion;
    @Column(name = "rangePhoneMin")
    private int rangePhoneMin;
    @Column(name = "rangePhoneMax")
    private int rangePhoneMax;


    public MobileOperator() {
    }

    public MobileOperator(String nameOperator, String nameRegion, int rangePhoneMin, int rangePhoneMax) {
        this.nameOperator = nameOperator;
        this.nameRegion = nameRegion;
        this.rangePhoneMin = rangePhoneMin;
        this.rangePhoneMax = rangePhoneMax;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nameOperator;
    }

    public void setName(String nameOperator) {
        this.nameOperator = nameOperator;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public String getNameOperator() {
        return nameOperator;
    }

    public void setNameOperator(String nameOperator) {
        this.nameOperator = nameOperator;
    }

    public int getRangePhoneMin() {
        return rangePhoneMin;
    }

    public void setRangePhoneMin(int rangePhoneMin) {
        this.rangePhoneMin = rangePhoneMin;
    }

    public int getRangePhoneMax() {
        return rangePhoneMax;
    }

    public void setRangePhoneMax(int rangePhoneMax) {
        this.rangePhoneMax = rangePhoneMax;
    }

    @Override
    public String toString() {
        return "MobileOperator{" + "id=" + id + ", nameOperator='" + nameOperator + '\'' + ", nameRegion='" + nameRegion + '\'' + ", rangePhoneMin=" + rangePhoneMin + ", rangePhoneMax=" + rangePhoneMax + '}';
    }
}
