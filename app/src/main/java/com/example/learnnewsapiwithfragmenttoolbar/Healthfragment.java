package com.example.learnnewsapiwithfragmenttoolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Healthfragment extends Fragment {
    APIInterface apiInterface;
    RecyclerView recyclerView;
    String apikey="75a145d868f74345a0f01a85712b6006";
    String country="in";
    String category="health";
    int pageSize=50;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_healthfragment,null,false);

        recyclerView=v.findViewById(R.id.recyclehealth);
        apiInterface=ApiInstance.getRetrofit().create(APIInterface.class);

        apiInterface.myposts(country,category,pageSize,apikey).enqueue(new Callback<Pojo>() {
            @Override
            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                if(response.isSuccessful()){
//                    Toast.makeText(getContext(), "success", Toast.LENGTH_SHORT).show();
                    ArrayList<Pojo.articles> m=response.body().getArticles();
                    Adapter adapter=new Adapter(getContext(),m);
//              LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
//              recyclerView.setLayoutManager(linearLayoutManager);
//              recyclerView.setAdapter(adapter);


                    GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView.setAdapter(adapter);



                }
                else {
                    Toast.makeText(getContext(), "failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Pojo> call, Throwable t) {

            }
        });



        return v;
    }}