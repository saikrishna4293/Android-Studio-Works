package com.example.ezio.a39checkbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox c1, c2, c3, c4, c5, c6;
    private Button button;

    public void onDogClick(){
        c1 = (CheckBox)findViewById(R.id.DogBox);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()){
                    Toast.makeText(MainActivity.this,"Dog is Selected",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void onClick(){
        c1 = (CheckBox)findViewById(R.id.DogBox);
        c2 = (CheckBox)findViewById(R.id.CatBox);
        c3 = (CheckBox)findViewById(R.id.LionBox);
        c4 = (CheckBox)findViewById(R.id.ElephantBox);
        c5 = (CheckBox)findViewById(R.id.GiraffeBox);
        c6 = (CheckBox)findViewById(R.id.CamelBox);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer checked = new StringBuffer();
                checked.append("Dog :").append(c1.isChecked());
                checked.append("\nCat :").append(c2.isChecked());
                checked.append("\nLion :").append(c3.isChecked());
                checked.append("\nElephant :").append(c4.isChecked());
                checked.append("\nGiraffe :").append(c5.isChecked());
                checked.append("\nCamel :").append(c6.isChecked());
                Toast.makeText(
                        MainActivity.this,checked.toString(),Toast.LENGTH_LONG
                ).show();
            }
        });
    }
    private RadioGroup rg;
    private RadioButton rb;
    private Button button2;
    public void onCLick2(){
        rg = (RadioGroup)findViewById(R.id.radioGroup);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_rb = rg.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(selected_rb);
                Toast.makeText(MainActivity.this, rb.getText().toString(),Toast.LENGTH_LONG).show();
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
        onDogClick();
        onCLick2();
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
