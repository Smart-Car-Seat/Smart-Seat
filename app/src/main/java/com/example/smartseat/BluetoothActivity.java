package com.example.smartseat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.jetbrains.annotations.Nullable;

public final class BluetoothActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_bluetooth);


        Button homePage_Button = (Button)this.findViewById(R.id.button_HomePageBT);
        homePage_Button.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                Intent Intent = new Intent((Context)BluetoothActivity.this, MainActivity.class);
                BluetoothActivity.this.startActivity(Intent);
            }
        }));
    }
}