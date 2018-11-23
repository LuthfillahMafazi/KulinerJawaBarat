package com.example.lutfillahmafazi.kulinerjawabarat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lutfillahmafazi.kulinerjawabarat.Adapter.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.myRecycle)
    RecyclerView myRecycle;

    String[] namaMakanan,detailMakanan;
    int[] gambarMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaMakanan = getResources().getStringArray(R.array.kulinerJawaBarat);
        detailMakanan = getResources().getStringArray(R.array.isiKuliner);
        gambarMakanan = new int[]{R.drawable.lotek,R.drawable.karedok,R.drawable.empal_gentong,R.drawable.batagor,R.drawable.peuyeum,R.drawable.cireng,R.drawable.tahu_gejrot,R.drawable.cara_membuat_asinan_bogor};

        Adapter adapter = new Adapter(this,gambarMakanan,namaMakanan,detailMakanan);
        myRecycle.setHasFixedSize(true);
        myRecycle.setLayoutManager(new LinearLayoutManager(this));
        myRecycle.setAdapter(adapter);
    }
}
