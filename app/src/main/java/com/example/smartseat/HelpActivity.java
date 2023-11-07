package com.example.smartseat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public final class HelpActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_help);
        Button homePage_Button3 = (Button)this.findViewById(R.id.button7);
        homePage_Button3.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                Intent Intent = new Intent((Context)HelpActivity.this, MainActivity.class);
                HelpActivity.this.startActivity(Intent);
            }
        }));
    }
}
