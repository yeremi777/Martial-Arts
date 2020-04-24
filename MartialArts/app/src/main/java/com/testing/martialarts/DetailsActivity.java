package com.testing.martialarts;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailsActivity extends AppCompatActivity {
    /*public static final String NAME_EXTRA = "name extra";
    public static final String DETAILS_EXTRA = "detail extra";
    public static final String PHOTO_EXTRA = "photo extra";*/
    public static final String COMPONENT_EXTRA = "component extra";

    private ImageView imgMartialArts;
    private TextView tvName, tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if(getSupportActionBar() != null){
            final MartialArts martialArts = getIntent().getParcelableExtra(COMPONENT_EXTRA);
            getSupportActionBar().setTitle(martialArts.getNamaBelaDiri() + " Details");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tvName = findViewById(R.id.tv_martial_arts_name);
        tvDetails = findViewById(R.id.tv_martial_arts_details);
        imgMartialArts = findViewById(R.id.img_martial_arts_photo);
        showDetail();
    }

    private void showDetail(){
        /*String name = getIntent().getStringExtra(NAME_EXTRA);
        String details = getIntent().getStringExtra(DETAILS_EXTRA);
        int photo = getIntent().getIntExtra(PHOTO_EXTRA, 0);*/

        getSupportActionBar().show();

        final MartialArts martialArts = getIntent().getParcelableExtra(COMPONENT_EXTRA);
        Glide.with(this)
                .load(martialArts.getFotoBelaDiri())
                /*.apply(new RequestOptions().override(350, 350))*/
                .into(imgMartialArts);
        tvName.setText(martialArts.getNamaBelaDiri());
        tvDetails.setText(martialArts.getDetailBelaDiri());
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
