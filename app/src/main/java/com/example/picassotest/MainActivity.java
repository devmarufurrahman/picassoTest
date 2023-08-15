package com.example.picassotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    Button imgBtn, img1Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = findViewById(R.id.imgView);
        imgBtn = findViewById(R.id.imgBtn);
        img1Btn = findViewById(R.id.img1Btn);

        Picasso.get().load("https://img.freepik.com/free-vector/blogging-concept-illustration_114360-1038.jpg?w=826&t=st=1691475023~exp=1691475623~hmac=40f670d06b0e0cc572d85ba2c6540bfe166b9790561c2c009c23809e95e6b008").into(imgView);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load("https://img.freepik.com/free-vector/web-development-programmer-engineering-coding-website-augmented-reality-interface-screens-developer-project-engineer-programming-software-application-design-cartoon-illustration_107791-3863.jpg?w=1380&t=st=1691475357~exp=1691475957~hmac=bff5db8f2b4ecc8296cc8d9c04028227e45d7ed9a219929645a4c0c1e61b5f16").into(imgView);
            }
        });


        img1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://img.freepik.com/free-vector/flat-creativity-concept-illustration_52683-64279.jpg?w=826&t=st=1691475579~exp=1691476179~hmac=db526ee1b79f2f0130efcb2afcd0ed8654b9482f5e4caf935512e0b3cd76c844")
                        .placeholder(R.drawable.ic_launcher_background)
                        .into(imgView);
            }
        });
    }
}