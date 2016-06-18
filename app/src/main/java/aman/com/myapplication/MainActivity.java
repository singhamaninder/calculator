package aman.com.myapplication;

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

public class MainActivity extends AppCompatActivity {
    int i=0;
    TextView TV;
    TextView textView_counter;
    EditText editText, editText1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
         editText = (EditText) findViewById(R.id.et);
         editText1 = (EditText) findViewById(R.id.et1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView_counter  = (TextView) findViewById(R.id.tv);
        Button button = (Button) findViewById(R.id.BT);
        Button button1 = (Button)  findViewById(R.id.BT1);
        Button button2 = (Button)  findViewById(R.id.BT2);
        Button button3 = (Button)  findViewById(R.id.BT3);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i - 1;
                textView_counter.setText(""+i);
                calculate(1);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i +1;
                textView_counter.setText(""+i);
                calculate(2);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i * 2;
                textView_counter.setText(""+i);
                calculate(3);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i / 2;
                textView_counter.setText(""+i);
                calculate(4);
            }
        });




    }

    private void calculate(int i) {
        int a,b;
        if (editText.getText().toString().trim()!=null) {
            if (editText1.getText().toString().trim() != null) {
                a = Integer.parseInt(editText.getText().toString());
                b = Integer.parseInt(editText1.getText().toString());
                if (i == 1) {
                    textView_counter.setText("" + (a - b));

                }
                if (i == 2) {
                    textView_counter.setText("" + (a + b));

                }
                if (i == 3) {
                    textView_counter.setText("" + (a * b));

                }
                if (i == 4) {
                    textView_counter.setText("" + (a /b));

                }

            }


        }}

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
