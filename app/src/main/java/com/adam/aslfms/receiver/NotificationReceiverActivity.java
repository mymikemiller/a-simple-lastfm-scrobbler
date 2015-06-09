package com.adam.aslfms.receiver;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.adam.aslfms.R;

public class NotificationReceiverActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        String name = getIntent().hasExtra("name") ? getIntent().getExtras().getString("name") : "unknown";
        Toast.makeText(this, "You tipped " + name + " $1", Toast.LENGTH_LONG).show();

    }
}
