package com.geektech.a31java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private EditText login, password;
    private Button btnGo;
    private ImageView imageCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnGo = findViewById(R.id.btn_go);
        imageCar = findViewById(R.id.img_car);
        Glide.with(this).load("https://i.pinimg.com/474x/23/ab/a6/23aba60b66ef08174bb7455c4a8a2d2f.jpg").into(imageCar);


        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login.getText().toString().equals("Admin")) {
                    Toast.makeText(MainActivity.this, "ВЫ УСПЕШНО ЗАРЕГИСТРИРОВАЛИСЬ", Toast.LENGTH_SHORT).show();
                } else {
                    login.setError("Ошибка");
                }
            }
        });
    }
}