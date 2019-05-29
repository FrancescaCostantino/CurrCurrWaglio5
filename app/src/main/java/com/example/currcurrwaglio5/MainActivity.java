package com.example.currcurrwaglio5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.currcurrwaglio5.R.id.b_inizio;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton home = (ImageButton) this.<View>findViewById(R.id.b_inizio);
        home.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v){
                                        Intent i=new Intent(MainActivity.this,HomeActivity.class);
                                        startActivity(i);
                                    }
                                }

        );

    }

}
