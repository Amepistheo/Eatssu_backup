package com.example.eatssu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.speech.RecognizerIntent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class InfoActivity_Haksik extends AppCompatActivity implements View.OnClickListener {
    private ImageButton mapBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_info_haksik);

        mapBtn = findViewById(R.id.btn_map);
        mapBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        if (v == mapBtn) { // 지도 연동
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.497103,126.956785"));
            startActivity(intent);
        }
    }

}