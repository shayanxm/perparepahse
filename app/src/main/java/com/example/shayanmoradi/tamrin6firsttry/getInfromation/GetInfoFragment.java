package com.example.shayanmoradi.tamrin6firsttry.getInfromation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.shayanmoradi.tamrin6firsttry.Model.Task;
import com.example.shayanmoradi.tamrin6firsttry.Model.TaskManager;
import com.example.shayanmoradi.tamrin6firsttry.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class GetInfoFragment extends Fragment {
private EditText editText;
private Button addToList;
private String titleeText;

    public GetInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_get_info, container, false);
        editText = view.findViewById(R.id.titile_geter_edit_text);
addToList = view.findViewById(R.id.add_task_btn);
        editText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
titleeText = editText.getText()+"";


            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        addToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Task task = new Task();
                task.setTitle(     titleeText +"");
                TaskManager.getInstance().addTask(task);
            }
        });
        return view;
    }


}
