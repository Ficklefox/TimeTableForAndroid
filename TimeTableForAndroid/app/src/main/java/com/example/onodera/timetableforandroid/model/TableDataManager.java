package com.example.onodera.timetableforandroid.model;

/**
 * Created by Onodera on 2015/06/13.
 */
public class TableDataManager {

    private TableDataManager(){
        lordData();
    }
    private TableData[][] _tableData;
    private static TableDataManager _instance;
    public static TableDataManager getInstance(){
        if(_instance != null)return _instance;
        else return _instance = new TableDataManager();
    }
    public void lordData(){

    }
    public void saveData(){

    }
}
