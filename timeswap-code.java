package com.example.ezio.a714clock;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private DigitalClock digital;
    private AnalogClock analog;

    public void onClick(){
        button = (Button)findViewById(R.id.button);
        digital = (DigitalClock)findViewById(R.id.digitalClock);
        analog = (AnalogClock)findViewById(R.id.analogClock);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(digital.getVisibility() == DigitalClock.GONE){
                    digital.setVisibility(DigitalClock.VISIBLE);
                    analog.setVisibility(AnalogClock.GONE);
                }else{
                    digital.setVisibility(DigitalClock.GONE);
                    analog.setVisibility(AnalogClock.VISIBLE);
                }
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        onClick();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //         getMenuInflater().inflate(R.menu.menu_main, menu);
        //                 return true;
        //                     }
        //
        //                         @Override
        //                             public boolean onOptionsItemSelected(MenuItem item) {
        //                                     // Handle action bar item clicks here. The action bar will
        //                                             // automatically handle clicks on the Home/Up button, so long
        //                                                     // as you specify a parent activity in AndroidManifest.xml.
        //                                                             int id = item.getItemId();
        //
        //                                                                     //noinspection SimplifiableIfStatement
        //                                                                             if (id == R.id.action_settings) {
        //                                                                                         return true;
        //                                                                                                 }
        //
        //                                                                                                         return super.onOptionsItemSelected(item);
        //                                                                                                             }
        //                                                                                                             }
        //
