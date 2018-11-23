package com.example.lutfillahmafazi.kulinerjawabarat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klikMasuk(View view) {
        Intent pindah = new Intent(this, RecycleActivity.class);
        startActivity(pindah);
    }
}
