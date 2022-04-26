package com.example.learnnewsapiwithfragmenttoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    Button home,sports,health,business;
    LinearLayout linearLayout;
    APIInterface apiInterface;
    String key="75a145d868f74345a0f01a85712b6006";
    String country="in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home=findViewById(R.id.tabidhome);
        sports=findViewById(R.id.tabidsports);
        health=findViewById(R.id.tabidhealth);
        business=findViewById(R.id.tabidbusiness);
        linearLayout=findViewById(R.id.linermainpage);
        apiInterface=ApiInstance.getRetrofit().create(APIInterface.class);
        TabLayout tabLayout=findViewById(R.id.tabid);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==0){
                    Homefragment homefragment=new Homefragment();
                    FragmentTransaction t=getSupportFragmentManager().beginTransaction();
                    t.replace(R.id.linermainpage,homefragment);

                    t.commit();


                }


                else if(tab.getPosition()==1){
                    Sportsfragment sportsfragment=new Sportsfragment();
                FragmentTransaction t=getSupportFragmentManager().beginTransaction();
                t.replace(R.id.linermainpage,sportsfragment);

                t.commit();

                }
                else if (tab.getPosition()==2){
                    Businessfragment businessfragment=new Businessfragment();
                FragmentTransaction t=getSupportFragmentManager().beginTransaction();
                t.replace(R.id.linermainpage,businessfragment);

                t.commit();

                }
                else if(tab.getPosition()==3){
                    Healthfragment healthfragment=new Healthfragment();
                FragmentTransaction t=getSupportFragmentManager().beginTransaction();
                t.replace(R.id.linermainpage,healthfragment);

                t.commit();

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

//


//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Homefragment homefragment=new Homefragment();
//                FragmentTransaction t=getSupportFragmentManager().beginTransaction();
//                t.replace(R.id.linermainpage,homefragment);
//
//                t.commit();
//            }
//        });
//
//
//        business.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {

//                Businessfragment businessfragment=new Businessfragment();
//                FragmentTransaction t=getSupportFragmentManager().beginTransaction();
//                t.replace(R.id.linermainpage,businessfragment);
//
//                t.commit();
//            }
//        });
//
//
//        health.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Healthfragment healthfragment=new Healthfragment();
//                FragmentTransaction t=getSupportFragmentManager().beginTransaction();
//                t.replace(R.id.linermainpage,healthfragment);
//
//                t.commit();
//            }
//        });
//
//
//        sports.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Sportsfragment sportsfragment=new Sportsfragment();
//                FragmentTransaction t=getSupportFragmentManager().beginTransaction();
//                t.replace(R.id.linermainpage,sportsfragment);
//
//                t.commit();
//            }
//        });
//



    }
}