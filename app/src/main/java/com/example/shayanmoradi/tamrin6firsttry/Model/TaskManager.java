package com.example.shayanmoradi.tamrin6firsttry.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskManager {
    private static TaskManager instance;
    ArrayList<Task> mTAskMap;

    private TaskManager() {
        mTAskMap = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            Task task = new Task();
//            task.setTitle("task#" + i);
//            task.setmDoneOrUnDone(i % 2 == 0);
//            task.setmDescription("des" + i);
//
//            mTAskMap.add( task);
//        }

    }

    public void addTask(Task task){
        mTAskMap.add(task);

    }
    public void deleteTask(Task task){
        mTAskMap.remove(task);
    }
    public static TaskManager getInstance() {
        if (instance == null)
            instance = new TaskManager();
        return instance;
    }

    public List<Task> getTasks() {
        List<Task> valueList =mTAskMap;
        return valueList;
    }

//    public Task getTask(UUID id) {
//        Task task;
//        if (mTAskMap.containsValue(id))
//            return mTAskMap.get(id);
//        return null;
//    }
    public Task getask(UUID id) {
        if (mTAskMap.get(getIndexOfTask(id))!=null)
        return mTAskMap.get(getIndexOfTask(id));
        return null;
    }
    public int getIndexOfTask(UUID id ){
        List<Task>task =getTasks();

        for(int i=0;i<task.size();i++){
            if (task.get(i).getmTaskId().equals(id))
                return i;
        }
        return -1;
    }

}
