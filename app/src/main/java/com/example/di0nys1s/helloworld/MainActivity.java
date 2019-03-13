package com.example.di0nys1s.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

//    Button btnFirebase;
  //  TextView tvFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String courses [] = {"MIT","MNS","MDS","MBIS","BIT(Hons)"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     btnFirebase = findViewById(R.id.firebaseButton);
   //     tvFirebase = findViewById(R.id.txtFirebase);

        Button clearButton = (Button)findViewById(R.id.clearButton);
        //registering with onclicklistener
        clearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        EditText tv = (EditText)findViewById(R.id.edit_message);
        tv.setText("");
        }
    });

 //       btnFirebase.setOnClickListener(new View.OnClickListener() {
//            @Override
   //         public void onClick(View view) {
//                FirebaseDatabase firebaseDatabase = new FirebaseDatabase.getInstance();
//                DatabaseReference databaseReference = firebaseDatabase.getReference("message");
//
//                databaseReference.setValue("Hello Firebase");
   //             tvFirebase.setText("Data sent to Firebase database!");
//
            }
    //    });

//}

    public void reverseWord(View view) {
    // Do something in response to button
        EditText editText = findViewById(R.id.edit_message);
        String builder = new StringBuilder(editText.getText()).reverse().toString();
        editText.setText(builder);
    }

    public void clearWord(View view) {
        EditText editText = findViewById(R.id.edit_message);
        editText.setText("");

    }
}
