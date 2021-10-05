package com.example.newsapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome,msports,mhealth,mscience,mpolitics,mtechnology;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;
    String api="9fd768d80fc14497af27178710dde9c9";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar=findViewById(R.id.toolbaar);

        setSupportActionBar(mtoolbar);

        mhome=findViewById(R.id.home);
        msports=findViewById(R.id.sports);
        mhealth=findViewById(R.id.health);
        mscience=findViewById(R.id.science);
        mpolitics=findViewById(R.id.politics);
        mtechnology=findViewById(R.id.techology);

        ViewPager viewPager=findViewById(R.id.fragmentcontainer);

        tabLayout=findViewById(R.id.include);
        pagerAdapter = new pageradpater(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2||tab.getPosition() == 3 || tab.getPosition() == 4 || tab.getPosition() == 5)
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
      viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }
}