package com.example.shayanmoradi.tamrin6firsttry.getInfromation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.shayanmoradi.tamrin6firsttry.R;

public class GetInfoActivity extends AppCompatActivity {
    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, GetInfoActivity.class);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_info);

        Fragment fragment = new GetInfoFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.info_geter_container, fragment)
                .commit();

    }
}
