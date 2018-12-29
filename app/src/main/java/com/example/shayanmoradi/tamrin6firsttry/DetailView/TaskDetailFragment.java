package com.example.shayanmoradi.tamrin6firsttry.DetailView;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shayanmoradi.tamrin6firsttry.Model.Task;
import com.example.shayanmoradi.tamrin6firsttry.Model.TaskManager;
import com.example.shayanmoradi.tamrin6firsttry.R;

import java.util.UUID;


/**
 * A simple {@link Fragment} subclass.
 */
public class TaskDetailFragment extends Fragment {
    private TextView title;
    public  Task task= new Task();
    public static final String ARG_CRIME_ID = "crimeId";

    public static TaskDetailFragment newInstance(UUID crimeId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_CRIME_ID, crimeId);

        TaskDetailFragment fragment = new TaskDetailFragment();
        fragment.setArguments(args);
        return fragment;
    }


    public TaskDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_task_detail, container, false);

    UUID crimeId = (UUID) getArguments().getSerializable(ARG_CRIME_ID);
    title= view.findViewById(R.id.detail_title);
//
//UUID taskid= DetailtaskActivity.baseId;
//    task=TaskManager.getInstance().getask(taskid);

       task=TaskManager.getInstance().getask(crimeId);
    //  task = TaskManager.getInstance().getTask(taskId);



      //Toast.makeText(getActivity(), task.getmTaskId()+"", Toast.LENGTH_LONG).show();
     //  task = TaskManager.getInstance().getTask(taskId);
    title.setText(task.getTitle()+"");
        return view;
    }

}
