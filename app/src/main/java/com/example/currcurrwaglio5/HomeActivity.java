package com.example.currcurrwaglio5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton luoghi = (ImageButton) this.<View>findViewById(R.id.b_luoghi);
        luoghi.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v){
                                          Intent i=new Intent(HomeActivity.this,LuoghiActivity.class);
                                          startActivity(i);
                                      }
                                  }
        );


        ImageButton meteo = (ImageButton) this.<View>findViewById(R.id.b_meteo);
        meteo.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v){
                                         Intent i=new Intent(HomeActivity.this,MapsActivity.class);
                                         startActivity(i);
                                     }
                                 }
        );


        ImageButton maps = (ImageButton) this.<View>findViewById(R.id.b_maps);
        maps.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v){
                                        Intent i=new Intent(HomeActivity.this,MapsActivity.class);
                                        startActivity(i);
                                    }
                                }
        );




    }
}
