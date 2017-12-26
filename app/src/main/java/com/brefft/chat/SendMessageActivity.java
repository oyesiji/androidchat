package com.brefft.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.brefft.entity.Author;
import com.brefft.entity.Message;
import com.stfalcon.chatkit.messages.MessageInput;
import com.stfalcon.chatkit.messages.MessagesList;
import com.stfalcon.chatkit.messages.MessagesListAdapter;

import java.util.Date;

public class SendMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        MessageInput inputView=(MessageInput)findViewById(R.id.input);
        MessagesList messagesList=(MessagesList)findViewById(R.id.messagesList);


        final MessagesListAdapter<Message> adapter = new MessagesListAdapter<>("hello", null);
        messagesList.setAdapter(adapter);


        inputView.setInputListener(new MessageInput.InputListener() {
            @Override
            public boolean onSubmit(CharSequence input) {
                //validate and send message
                Author author =new Author();
                author.setId("2");
                author.setName("Jubril");
                Message  message=new Message();
                message.setCreatedAt(new Date());
                message.setId("1");
                message.setText(input.toString());
                message.setAuthor(author);
                adapter.addToStart(message, true);
                return true;
            }
        });

    }



}
