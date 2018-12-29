package com.example.shayanmoradi.tamrin6firsttry.RecyclerStaffs;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shayanmoradi.tamrin6firsttry.DetailView.DetailtaskActivity;
import com.example.shayanmoradi.tamrin6firsttry.Model.Task;
import com.example.shayanmoradi.tamrin6firsttry.R;

public class TaskHolder extends RecyclerView.ViewHolder {

    private TextView mTitleTextView;
    private TextView firstLetter;
   // private TextView mDateTextView;
 //   private ImageView mSolvedImageView;

    private Task mTask;

    public TaskHolder(@NonNull final View itemView) {
        super(itemView);

        mTitleTextView = itemView.findViewById(R.id.task_title);
        firstLetter = itemView.findViewById(R.id.first_letter_of_task);
//        mDateTextView = itemView.findViewById(R.id.list_item_crime_date);
//        mSolvedImageView = itemView.findViewById(R.id.crime_solved);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Toast.makeText(itemView.getContext(), mTask.getTitle() + " clicked!", Toast.LENGTH_LONG).show();
         //      for task click


                Intent intent = DetailtaskActivity.newIntent(itemView.getContext(), mTask.getmTaskId());
                itemView.getContext().startActivity(intent);
            }
        });
    }

    public void bind(Task crime) {
        mTask = crime;
        mTitleTextView.setText(crime.getTitle());
        String firstLetterString = crime.getTitle().substring(0,1);
        firstLetter.setText(firstLetterString);
//        mDateTextView.setText(crime.getDate().toString());
//        mSolvedImageView.setVisibility(crime.isSolved() == true ? View.VISIBLE : View.GONE);
    }
}
