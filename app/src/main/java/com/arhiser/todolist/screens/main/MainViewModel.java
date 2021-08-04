package com.arhiser.todolist.screens.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.appnotes.data.App;

import com.example.appnotes.Model.Note;



import java.util.List;

public class MainViewModel extends ViewModel {


    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<Note>> getNoteLiveData() {
        return noteLiveData;
    }
}