package com.testing.shoesmary.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testing.shoesmary.R;
import com.testing.shoesmary.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeAdapter.ItemAdapterCallback{
    private RecyclerView rvSport;
    private List<HomeModel> listData;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        rvSport = view.findViewById(R.id.rv_sport);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        listData = new ArrayList<>();
        listData.add(new HomeModel(1, "Test", "New", "25%", "url"));
        listData.add(new HomeModel(2, "Test", "New", "25%", "url"));
        listData.add(new HomeModel(3, "Test", "New", "25%", "url"));
        listData.add(new HomeModel(4, "Test", "New", "25%", "url"));
        listData.add(new HomeModel(5, "Test", "New", "25%", "url"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        HomeAdapter homeAdapter = new HomeAdapter(listData, this);
        rvSport.setLayoutManager(linearLayoutManager);
        rvSport.setAdapter(homeAdapter);
    }

    @Override
    public void onClick(View view) {

    }
}
