package com.example.restaurant.RestaurentTest_5_feb.model;

public class RestaurentModel {
    private String restName;
    private String restAdd;
    private long contNum;
    private String speciality;
    private int totalStaff;
    private int restId;

    public RestaurentModel() {
    }

    public RestaurentModel(String restName, String restAdd, long contNum, String speciality, int totalStaff, int restId) {
        this.restName = restName;
        this.restAdd = restAdd;
        this.contNum = contNum;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
        this.restId = restId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestAdd() {
        return restAdd;
    }

    public void setRestAdd(String restAdd) {
        this.restAdd = restAdd;
    }

    public long getContNum() {
        return contNum;
    }

    public void setContNum(long contNum) {
        this.contNum = contNum;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }
}
