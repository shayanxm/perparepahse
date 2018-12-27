package com.example.shayanmoradi.tamrin6firsttry.RecyclerStaffs;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.shayanmoradi.tamrin6firsttry.Model.Task;
import com.example.shayanmoradi.tamrin6firsttry.R;

public class TaskHolder extends RecyclerView.ViewHolder {

    private TextView mTitleTextView;
   // private TextView mDateTextView;
 //   private ImageView mSolvedImageView;

    private Task mTask;

    public TaskHolder(@NonNull View itemView) {
        super(itemView);

        mTitleTextView = itemView.findViewById(R.id.task_title);
//        mDateTextView = itemView.findViewById(R.id.list_item_crime_date);
//        mSolvedImageView = itemView.findViewById(R.id.crime_solved);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                    Toast.makeText(getActivity(), mCrime.getTitle() + " clicked!", Toast.LENGTH_LONG).show();
         //      for task click
//                Intent intent = CrimePagerActivity.newIntent(getActivity(), mCrime.getId());
//                startActivity(intent);
            }
        });
    }

    public void bind(Task crime) {
        mTask = crime;
        mTitleTextView.setText(crime.getTitle());
//        mDateTextView.setText(crime.getDate().toString());
//        mSolvedImageView.setVisibility(crime.isSolved() == true ? View.VISIBLE : View.GONE);
    }
}
