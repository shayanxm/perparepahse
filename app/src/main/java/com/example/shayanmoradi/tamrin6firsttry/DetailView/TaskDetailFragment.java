package com.example.shayanmoradi.tamrin6firsttry.DetailView;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.shayanmoradi.tamrin6firsttry.MainView.MainActivity;
import com.example.shayanmoradi.tamrin6firsttry.Model.Task;
import com.example.shayanmoradi.tamrin6firsttry.Model.TaskManager;
import com.example.shayanmoradi.tamrin6firsttry.R;
import com.example.shayanmoradi.tamrin6firsttry.getInfromation.GetInfoActivity;

import java.util.UUID;


/**
 * A simple {@link Fragment} subclass.
 */
public class TaskDetailFragment extends Fragment {
    private TextView title;
    public  Task task;
    private TextView descTxt;
    private TextView timeTxt;
    private TextView dateTxt;
    private Button delteBtn;
    private Button editBtn;
    private Button doneBtn;
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

    final UUID crimeId = (UUID) getArguments().getSerializable(ARG_CRIME_ID);
    title= view.findViewById(R.id.detail_title);
    delteBtn= view.findViewById(R.id.delete_task);
    editBtn= view.findViewById(R.id.edit_task);
    doneBtn = view.findViewById(R.id.done_task);
    descTxt= view.findViewById(R.id.detail_des);
    timeTxt=view.findViewById(R.id.detail_time);
    dateTxt=view.findViewById(R.id.detail_date);

       task=TaskManager.getInstance().getask(crimeId);

    title.setText(task.getTitle()+"");
    descTxt.setText(task.getmDescription());
    timeTxt.setText(task.getSimpleTime()+"");
    dateTxt.setText(task.getSimpleDate());
    delteBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TaskManager.getInstance().deleteTask(task);
        }
    });
    editBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {



           startActivity( GetInfoActivity.newIntent(getActivity(),crimeId));
//            TaskManager.getInstance().deleteTask(task);


        }
    });
    doneBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            startActivity(intent);
        }
    });
        return view;
    }

}
