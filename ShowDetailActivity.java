package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class ShowDetailActivity extends AppCompatActivity {

    private TextView addToCardBtn ;
    private FoodDomain object ;
    private TextView titleTxt ,feeTxt ,descriptionTxt ,numberOrderTxt;
    private ImageView plusBtn , minusBtn , picFood;
    private int numberOrder = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detial);

    initView();
    getBundle();

    }

    private void getBundle() {

        object = (FoodDomain) (getIntent()).getSerializableExtra("object");

        int drawableResourceId = this.getResources().getIdentifier(object.getPic(),"drwable" , this.getPackageName());

        Glide
                .with(this)
                .load(drawableResourceId)
                .into(picFood);



        titleTxt.setText(object.getTitle());
        feeTxt.setText("$" + object.getFee());
        descriptionTxt.setText(object.getDescription());
        numberOrderTxt.setText(String.valueOf(numberOrder));


        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numberOrder = numberOrder + 1;
                numberOrderTxt.setText(String.valueOf(numberOrder));

            }
        });


        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(numberOrder>1)

                {
                    numberOrder = numberOrder-1;

                }

                numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });


        addToCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





            }
        });

    }

    private void initView() {

        addToCardBtn=findViewById(R.id.addToCardBtn);
        titleTxt=findViewById(R.id.titleTxt);
        feeTxt=findViewById(R.id.priceTxt);
        descriptionTxt=findViewById(R.id.descriptionTxt);
        numberOrderTxt=findViewById(R.id.numberOrder);
        plusBtn=findViewById(R.id.plusBtn);
        minusBtn=findViewById(R.id.minusBtn);
        picFood=findViewById(R.id.foodPic);





    }
}