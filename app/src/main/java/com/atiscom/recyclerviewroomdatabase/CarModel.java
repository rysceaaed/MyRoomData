package com.atiscom.recyclerviewroomdatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Mico on 11/13/2017.
 */
@Entity(tableName = "cars")
public class CarModel {


    public CarModel(String carName, String carAge) {
        this.carName = carName;
        this.carAge = carAge;
    }

    @PrimaryKey(autoGenerate = true)
    private int cid;

    @ColumnInfo(name = "car_name")
    private String carName;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @ColumnInfo(name = "car_age")
    private String carAge;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarAge() {
        return carAge;
    }

    public void setCarAge(String carAge) {
        this.carAge = carAge;
    }
}
