package com.example.hashmap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView viewHs, viewTs;
    Button butPut, butWrite, butClean;
    EditText editText;
    HashSet<String> myHashSet = new HashSet<>();
    TreeSet<String> myTreeSet = new TreeSet<>();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butPut = findViewById(R.id.addBut);
        butWrite = findViewById(R.id.viewBut);
        viewHs = findViewById(R.id.hashSet);
        viewTs = findViewById(R.id.treeSet);
        editText = findViewById(R.id.addText);
        butClean = findViewById(R.id.clearBut);

        butPut.setOnClickListener(this);
        butWrite.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.addBut:
                myHashSet.add(editText.getText().toString());
                myTreeSet.add(editText.getText().toString());
                break;

            case R.id.viewBut:
                for (String bfr : myHashSet) {
                    viewHs.append(bfr + "\n");

                }
                for (String bfr : myTreeSet) {
                    viewTs.append(bfr + "\n");

                }
                break;

            case R.id.clearBut:
                myHashSet.clear();
                myTreeSet.clear();
                viewTs.setText(" ");
                viewHs.setText(" ");
                break;
        }
    }
}