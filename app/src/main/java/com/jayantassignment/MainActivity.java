package com.jayantassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.jayantassignment.Oppo.OppoFragment;
import com.jayantassignment.Samsung.SamsungFragment;

public class MainActivity extends AppCompatActivity {
    FrameLayout fragmentContainer;
    Fragment selectedFragment = null;
    ImageView samsung, oppo;
    final long[] pattern = {10,20};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentContainer = findViewById(R.id.fragmentContainer);
        Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        if (selectedFragment== null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,
                    new SamsungFragment()).commit();
        }else {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,
                    selectedFragment).commit();
        }
        samsung = findViewById(R.id.samsung);
        oppo = findViewById(R.id.oppo);
        samsung.setOnClickListener(v -> {
            vibrator.vibrate(pattern,-1);
            selectedFragment = new SamsungFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,
                    selectedFragment).commit();
            samsung.setImageResource(R.drawable.samsung_logo_blue);
            oppo.setImageResource(R.drawable.oppo_logo_white);
        });
        oppo.setOnClickListener(v -> {
            vibrator.vibrate(pattern,-1);
            selectedFragment = new OppoFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,
                    selectedFragment).commit();
            samsung.setImageResource(R.drawable.samsung_logo_white);
            oppo.setImageResource(R.drawable.oppo_logo_green);
        });
    }
}