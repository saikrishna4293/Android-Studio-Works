package com.example.ezio.a815loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Button button;
    private static EditText uname;
    private static EditText passwd;
    private static TextView attempts;
    int attempt_cnt = 3;

    public void onClickLogin(){
        button = (Button)findViewById(R.id.button);
        uname = (EditText)findViewById(R.id.text_uname);
        passwd = (EditText)findViewById(R.id.text_password);
        attempts = (TextView)findViewById(R.id.text_attempts);
        attempts.setText(Integer.toString(attempt_cnt));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uname.getText().toString().equals("ezio") && passwd.getText().toString().equals("18")) {
                    Intent intent = new Intent("com.example.ezio.a815loginscreen.UserActivity");
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "username and password are incorrect", Toast.LENGTH_LONG).show();
                    attempt_cnt--;
                    attempts.setText(Integer.toString(attempt_cnt));
                    if (attempt_cnt == 0) {
                        button.setEnabled(false);
                    }
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
        onClickLogin();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

