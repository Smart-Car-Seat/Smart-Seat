package com.example.smartseat;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
        d2 = {"Lcom/example/smartseat3/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class MainActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        // Bluetooth Button
        Button bluetooth_Button = (Button)this.findViewById(R.id.button);
        bluetooth_Button.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                Intent Intent = new Intent((Context)MainActivity.this, BluetoothActivity.class);
                MainActivity.this.startActivity(Intent);
            }
        }));

        // Help Button
        Button help_Button = (Button)this.findViewById(R.id.button4);
        help_Button.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                Intent Intent = new Intent((Context)MainActivity.this, HelpActivity.class);
                MainActivity.this.startActivity(Intent);
            }
        }));

        // Setting Button
        Button setting_Button = (Button)this.findViewById(R.id.button5);
        setting_Button.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                Intent Intent = new Intent((Context)MainActivity.this, SettingActivity.class);
                MainActivity.this.startActivity(Intent);
            }
        }));
    }
}
