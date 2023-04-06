package com.staskokh.todolist.screens.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.staskokh.todolist.ListApp;
import com.staskokh.todolist.model.list;

import java.util.List;

public class MainViewModel extends ViewModel {
    private LiveData<List<list>> listLiveData = ListApp.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<list>> getListLiveData() {
        return listLiveData;
    }
}
