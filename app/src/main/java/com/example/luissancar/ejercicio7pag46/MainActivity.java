package com.example.luissancar.ejercicio7pag46;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] ciudades={"Otura", "Alhendin","Armilla"};
    private String[] habitantes={"10.000.000","1.200.000","100.000"};
    private TextView tv1;
    private ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView);
        lv1=(ListView)findViewById(R.id.listView);
        
    }
}
