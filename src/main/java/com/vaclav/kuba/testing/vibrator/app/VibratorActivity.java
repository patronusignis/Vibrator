package com.vaclav.kuba.testing.vibrator.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class VibratorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrator);
        final Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        Button button = (Button) findViewById(R.id.vibrateButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(500);
            }
        });
    }
}


