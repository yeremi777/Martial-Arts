package com.testing.martialarts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMartialArts;
    private ArrayList<MartialArts> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("List Martial Arts");
        }

        rvMartialArts = findViewById(R.id.rv_martialArts);
        rvMartialArts.setHasFixedSize(true);

        list.addAll(MartialArtsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMartialArts.setLayoutManager(new LinearLayoutManager(this));
        ListMartialArtsAdapter listMartialArtsAdapter = new ListMartialArtsAdapter(list);
        rvMartialArts.setAdapter(listMartialArtsAdapter);
        listMartialArtsAdapter.setOnItemClickCallback(new ListMartialArtsAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(MartialArts data) {
                Intent clickIntent = new Intent(MainActivity.this, DetailsActivity.class);
                /*clickIntent.putExtra(DetailsActivity.NAME_EXTRA, data.getNamaBelaDiri());
                clickIntent.putExtra(DetailsActivity.DETAILS_EXTRA, data.getDetailBelaDiri());
                clickIntent.putExtra(DetailsActivity.PHOTO_EXTRA, data.getFotoBelaDiri());*/
                clickIntent.putExtra(DetailsActivity.COMPONENT_EXTRA, data);
                startActivity(clickIntent);
                /*showSelectedItem(data);*/
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Intent profileIntent = new Intent(MainActivity.this, MyProfileActivity.class);
        startActivity(profileIntent);

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*private void showSelectedItem(MartialArts martialArts){
        Toast.makeText(this, "Kamu memilih " + martialArts.getNamaBelaDiri(), Toast.LENGTH_SHORT).show();
    }*/
}
