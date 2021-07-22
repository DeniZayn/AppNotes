package com.example.appnotes.data;

import android.app.Application;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public class App extends Application {

    private AppDatabase database;
    private NoteDao noteDao;
    private static App instance;

    public static App getInstance() {
        return instance;

    }
    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        database = Room.databaseBuilder(getApplicationContext(),
        AppDatabase.class, "app name")
                .allowMainThreadQueries()
                .build();

        noteDao = database.noteDao();
    }
    public AppDatabase getDatabase() {
        return database;
    }
    public void setDatabase (AppDatabase database) {
        this.database = database;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

}
