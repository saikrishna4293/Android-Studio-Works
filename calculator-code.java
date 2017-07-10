package com.example.ezio.app2_7;

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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private TextView result;
    private int num1;
    private int num2;
    private EditText editText3;
    private Button button;
    public void ToastButton(){
        editText3 = (EditText)findViewById(R.id.editText3);
        button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this, editText3.getText(), Toast.LENGTH_LONG
                ).show();
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
        ToastButton();
    }

    public void onAddButton(View v){
        a = (EditText)findViewById(R.id.editText);
        b = (EditText)findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.ResultBox);
        num1 = Integer.parseInt(a.getText().toString());
        num2 = Integer.parseInt(b.getText().toString());
        int add = num1+num2;
        result.setText(Integer.toString(add));
    }
    public void onSubButton(View v){
        a = (EditText)findViewById(R.id.editText);
        b = (EditText)findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.ResultBox);
        num1 = Integer.parseInt(a.getText().toString());
        num2 = Integer.parseInt(b.getText().toString());
        int sub = num1-num2;
        result.setText(Integer.toString(sub));
    }
    public void onDivButton(View v){
        a = (EditText)findViewById(R.id.editText);
        b = (EditText)findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.ResultBox);
        num1 = Integer.parseInt(a.getText().toString());
        num2 = Integer.parseInt(b.getText().toString());
        int div = num1/num2;
        result.setText(Integer.toString(div));
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

