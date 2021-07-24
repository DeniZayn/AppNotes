package com.arhiser.todolist.screens.main;

import android.provider.ContactsContract;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

//import com.arhiser.todolist.App;
//import com.arhiser.todolist.model.Note;
import com.arhiser.todolist.model.Note;
//import com.example.appnotes.Model.Note;
import com.example.appnotes.data.App;

import java.util.List;

public class MainViewModel extends ViewModel {
    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<Note>> getNoteLiveData() {
        return noteLiveData;
    }
}