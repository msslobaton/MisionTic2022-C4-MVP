package com.example.myapplication.mvp;

//creo el contrato MVP del Main

import com.example.myapplication.view.dto.TaskItem;

import java.util.List;

public interface MainMVP {

    interface Model {

        List<TaskItem> getTask();
    }

    //las funciones necesarias para que funcione  el modelo
    interface  Presenter {
        void LoadTask();
        void addNewTask();
    }

    interface View {


        void showTaskList(List<TaskItem> items);
    }

}
