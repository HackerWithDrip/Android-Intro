package com.example.androidintro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSayHello = findViewById(R.id.btnSayHello);
        //Handling events using code
        btnSayHello.setOnClickListener(view -> {
            EditText edtName = findViewById(R.id.edtName);
            String name = edtName.getText().toString();

            Toast.makeText(this,"Hello, " + name.trim() + ", welcome to my world!",Toast.LENGTH_LONG).show();
        });


    }

    //Using event handler
    public void onWriteHelloClicked(View view) {
        TextView txtMessage = findViewById(R.id.txtMessage);
        txtMessage.setText("Hello World!");
    }

    public void onDialClicked(View view) {
        //using Implicit intent, asking android to decide which intent to use
        Uri helplineNumber = Uri.parse("tel:0670880796");
        Intent dialNumber = new Intent(Intent.ACTION_DIAL,helplineNumber);
        startActivity(dialNumber);
    }

    public void onShowClicked(View view) {
        //using Explicit intent, telling android how to handle the event explicitly
        Intent showIntent = new Intent(this,AnotherActivity.class);
        startActivity(showIntent);
    }
}