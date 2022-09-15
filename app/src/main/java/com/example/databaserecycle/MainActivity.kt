package com.example.databaserecycle

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintSet
import com.example.databaserecycle.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.sql.DatabaseMetaData
import java.util.jar.Attributes


class MainActivity : AppCompatActivity() {

      private lateinit var binding: ActivityMainBinding
      private lateinit var database: DatabaseReference

      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

          binding.loginbtn.setOnClickListener{

              var name =binding.name.text.toString()
              var email =binding.email.text.toString()
              var age=binding.age.text.toString()

          }





    }
}