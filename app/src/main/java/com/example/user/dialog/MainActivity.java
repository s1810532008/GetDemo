package com.example.user.dialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bdr = new AlertDialog.Builder(MainActivity.this);
                bdr.setMessage("交談窗示範教學");
                bdr.setTitle("歡迎");
                bdr.setIcon(android.R.drawable.presence_away);
                bdr.show();
            }
        });


    }

}
