package com.atiscom.recyclerviewroomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Mico on 11/13/2017.
 */

@Database(entities = {CarModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CarDao carDao();
}
