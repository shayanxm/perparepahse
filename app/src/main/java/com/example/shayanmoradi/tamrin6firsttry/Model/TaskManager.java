package com.example.shayanmoradi.tamrin6firsttry.Model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

public class TaskManager {
    private static TaskManager instance;
    LinkedHashMap<UUID, Task> mTAskMap;

    private TaskManager() {
        mTAskMap = new LinkedHashMap<>();
        for (int i = 0; i < 100; i++) {
            Task task = new Task();
            task.setTitle("task#" + i);
            task.setmDoneOrUnDone(i % 2 == 0);
            task.setmDescription("des" + i);

            mTAskMap.put(task.getmTaskId(), task);
        }

    }

    public static TaskManager getInstance() {
        if (instance == null)
            instance = new TaskManager();
        return instance;
    }

    public List<Task> getTasks() {
        List<Task> valueList = new ArrayList<>(mTAskMap.values());
        return valueList;
    }

    public Task getTask(UUID id) {
        Task task;
        if (mTAskMap.containsValue(id))
            return mTAskMap.get(id);
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
