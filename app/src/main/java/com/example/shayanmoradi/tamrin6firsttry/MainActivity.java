package com.example.shayanmoradi.tamrin6firsttry;

import android.support.v4.app.Fragment;

public class MainActivity extends SingleFragment {
    private static final String EXTRA_CRIME_ID = "com.example.amin.criminalintent.crime_id";

//    public static Intent newIntent(Context context, UUID crimeId) {
//        Intent intent = new Intent(context, CrimeDetailActivity.class);
//        intent.putExtra(EXTRA_CRIME_ID, crimeId);
//        return intent;
//    }

    @Override
    public Fragment createFragment() {
        return null;
    }
}
