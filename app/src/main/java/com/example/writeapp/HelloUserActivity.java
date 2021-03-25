package com.example.writeapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HelloUserActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellouser);

        final EditText editText = findViewById(R.id.edit_text);
        Button btn = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.output);

        textView.setVisibility(View.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                String hello = getString(R.string.hello_user, name);
                textView.setText(hello);
                textView.setVisibility(View.VISIBLE);
            }
        });
    }
}
