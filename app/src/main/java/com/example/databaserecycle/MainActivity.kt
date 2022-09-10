package com.example.databaserecycle

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import java.util.jar.Attributes


class MainActivity : AppCompatActivity() {
  EditText name,email,age;
  Button insert, view;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name =findViewById(R.id.name);
        email =findViewById(R.id.email);
        age=findViewById(R.id.age);
        insert=findViewById<(R.id.btninsert)
        view=findViewById(R.id.btnview)

        view.setOnClickListListener(view. )



    }
}