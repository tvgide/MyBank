package com.example.trevorv.mybank;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText amount_input;
    Button withdraw_button;
    Button deposit_button;
    TextView amount_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount_display = (TextView) findViewById(R.id.balance_display);
        withdraw_button = (Button) findViewById(R.id.withdraw_button);
        deposit_button = (Button) findViewById(R.id.deposit_button);
        amount_input = (EditText) findViewById(R.id.amount_input);

        withdraw_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = amount_input.getText().toString();
                amount_display.setText(amount);
            }
        });

        deposit_button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = amount_input.getText().toString();
                amount_display.setText(amount);
            }
        });
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
