package com.brefft.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.brefft.entity.Chat;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("chats");
        Chat chat=new Chat();
        chat.setName("davidww2");
        chat.setSender_id("33332215");
        chat.setText("Hello how are youddd");
        myRef.push().setValue(chat);
        //myRef.child(chat.getSender_id()).setValue(chat);
       // myRef.ch
    }
}
