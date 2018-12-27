package com.example.shayanmoradi.tamrin6firsttry.MainView;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.shayanmoradi.tamrin6firsttry.R;
import com.example.shayanmoradi.tamrin6firsttry.SingleFragment;

public class MainActivity extends SingleFragment {
    private static final String EXTRA_CRIME_ID = "com.example.amin.criminalintent.crime_id";
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;


//    public static Intent newIntent(Context context, UUID crimeId) {
//        Intent intent = new Intent(context, CrimeDetailActivity.class);
//        intent.putExtra(EXTRA_CRIME_ID, crimeId);
//        return intent;
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new AllTasksFragment(), "Tab 1");
        adapter.addFragment(new DoneTaskFragment(), "Tab 2");
        adapter.addFragment(new UnDoneFragment(), "Tab 3");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
//
//            tabLayout.getTabAt(0).setIcon(tabIcons[0]);
//            tabLayout.getTabAt(1).setIcon(tabIcons[1]);
//            tabLayout.getTabAt(2).setIcon(tabIcons[2]);

    }


    @Override
    public Fragment createFragment() {
        return new DoneTaskFragment();

    }
}
