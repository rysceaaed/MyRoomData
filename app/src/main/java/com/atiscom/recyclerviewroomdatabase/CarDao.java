package com.atiscom.recyclerviewroomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Mico on 11/13/2017.
 */
@Dao
public interface CarDao {

    @Query("SELECT * FROM cars")
    List<CarModel> getAll();


    @Insert
    void insertAll(CarModel... users);

    @Delete
    void delete(CarModel user);



}
