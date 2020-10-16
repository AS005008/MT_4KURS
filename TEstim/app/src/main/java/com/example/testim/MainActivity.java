package com.example.testim;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.ActionMode;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView tv_p1, tv_p2;
    ImageView im_11,im_12,im_13,im_14,im_21,im_22,im_23,im_24,im_31,im_32,im_33,im_34;
    Integer[] cardsArray={101,102,103,104,105,106,201,202,203,204,205,206};
    int image101,image102,image103,image104,image105,image106,
            image201,image202,image203,image204,image205,image206;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber=1;
    int turn=1;
    int playerPoints=0, cpuPoints=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_p1=(TextView) findViewById(R.id.tv_p1);
        tv_p2=(TextView) findViewById(R.id.tv_p2);

        im_11=(ImageView) findViewById(R.id.im_11);
        im_12=(ImageView) findViewById(R.id.im_12);
        im_13=(ImageView) findViewById(R.id.im_13);
        im_14=(ImageView) findViewById(R.id.im_14);
        im_21=(ImageView) findViewById(R.id.im_21);
        im_22=(ImageView) findViewById(R.id.im_22);
        im_23=(ImageView) findViewById(R.id.im_23);
        im_24=(ImageView) findViewById(R.id.im_24);
        im_31=(ImageView) findViewById(R.id.im_31);
        im_32=(ImageView) findViewById(R.id.im_32);
        im_33=(ImageView) findViewById(R.id.im_33);
        im_34=(ImageView) findViewById(R.id.im_34);
        im_11.setTag("0");
        im_12.setTag("1");
        im_13.setTag("2");
        im_14.setTag("3");
        im_21.setTag("4");
        im_22.setTag("5");
        im_23.setTag("6");
        im_24.setTag("7");
        im_31.setTag("8");
        im_32.setTag("9");
        im_33.setTag("10");
        im_34.setTag("11");
// load the card images
        frontOfCardsResources();
   //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        tv_p2.setTextColor(Color.GRAY);
        im_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_11, theCard);

            }
        });
        im_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_11, theCard);

            }
        });
        im_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_12, theCard);
            }
        });
        im_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_13, theCard);
            }
        });
        im_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_14, theCard);
            }
        });
        im_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_21, theCard);
            }
        });
        im_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_22, theCard);
            }
        });
        im_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_23, theCard);
            }
        });
        im_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_24, theCard);
            }
        });
        im_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_31, theCard);
            }
        });
        im_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_32, theCard);
            }
        });
        im_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_33, theCard);
            }
        });
        im_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String)view.getTag());
                doStuff(im_34, theCard);
            }
        });

    }
    private void  doStuff(ImageView im, int card){
        if(cardsArray[card]==101){
            im.setImageResource(image101);
        }else if(cardsArray[card]==102){
            im.setImageResource(image102);
        }else if(cardsArray[card]==103){
            im.setImageResource(image103);
        }else if(cardsArray[card]==104){
            im.setImageResource(image104);
        }else if(cardsArray[card]==105){
            im.setImageResource(image105);
        }else if(cardsArray[card]==106){
            im.setImageResource(image106);
        }else if(cardsArray[card]==201){
            im.setImageResource(image201);
        }else if(cardsArray[card]==202){
            im.setImageResource(image202);
        }else if(cardsArray[card]==203){
            im.setImageResource(image203);
        }else if(cardsArray[card]==204){
            im.setImageResource(image204);
        }else if(cardsArray[card]==205){
            im.setImageResource(image205);
        }else if(cardsArray[card]==206){
            im.setImageResource(image206);
        }

        //check which images is selected and save it to temporary variables
        if(cardNumber==1){
            firstCard= cardsArray[card];
            if(firstCard>200){
                firstCard=firstCard-100;
            }
            cardNumber=2;
            clickedFirst=card;
            im.setEnabled(false);
        } else if(cardNumber==2){
            secondCard=cardsArray[card];
            if(secondCard>200){
                secondCard=secondCard-100;
            }
            cardNumber=1;
            clickedSecond=card;

            im_11.setEnabled(false);
            im_12.setEnabled(false);
            im_13.setEnabled(false);
            im_14.setEnabled(false);
            im_21.setEnabled(false);
            im_22.setEnabled(false);
            im_23.setEnabled(false);
            im_24.setEnabled(false);
            im_31.setEnabled(false);
            im_32.setEnabled(false);
            im_33.setEnabled(false);
            im_34.setEnabled(false);
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // check if the selected images are equal
                calculate();
                }
            },1000);
        }
    }
    private void calculate(){
        if (firstCard==secondCard){
            if(clickedFirst==0){
                im_11.setVisibility(View.INVISIBLE);
            } else if(clickedFirst==1){
                im_12.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==2){
                im_13.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==3){
                im_14.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==4){
                im_21.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==5){
                im_22.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==6){
                im_23.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==7){
                im_24.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==8){
                im_31.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==9){
                im_32.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==10){
                im_33.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==11){
                im_34.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond==0){
                im_11.setVisibility(View.INVISIBLE);
            } else if(clickedSecond==1){
                im_12.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==2){
                im_13.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==3){
                im_14.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==4){
                im_21.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==5){
                im_22.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==6){
                im_23.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==7){
                im_24.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==8){
                im_31.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==9){
                im_32.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==10){
                im_33.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==11){
                im_34.setVisibility(View.INVISIBLE);
            }

            if(turn==1){
                playerPoints++;
                tv_p1.setText("");
            }else  if(turn==2){
                cpuPoints++;
                tv_p2.setText("");
            }
        }else {
            im_11.setImageResource(R.drawable.hidden);
            im_12.setImageResource(R.drawable.hidden);
            im_13.setImageResource(R.drawable.hidden);
            im_14.setImageResource(R.drawable.hidden);
            im_21.setImageResource(R.drawable.hidden);
            im_22.setImageResource(R.drawable.hidden);
            im_23.setImageResource(R.drawable.hidden);
            im_24.setImageResource(R.drawable.hidden);
            im_31.setImageResource(R.drawable.hidden);
            im_32.setImageResource(R.drawable.hidden);
            im_33.setImageResource(R.drawable.hidden);
            im_34.setImageResource(R.drawable.hidden);

            if(turn==1){
                turn=2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            } else if(turn==2){
                turn=1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }
        im_11.setEnabled(true);
        im_12.setEnabled(true);
        im_13.setEnabled(true);
        im_14.setEnabled(true);
        im_21.setEnabled(true);
        im_22.setEnabled(true);
        im_23.setEnabled(true);
        im_24.setEnabled(true);
        im_31.setEnabled(true);
        im_32.setEnabled(true);
        im_33.setEnabled(true);
        im_34.setEnabled(true);

        checkEnd();

    }
    private  void checkEnd(){
        if(im_11.getVisibility()==View.INVISIBLE &&
                im_12.getVisibility()==View.INVISIBLE &&
                im_13.getVisibility()==View.INVISIBLE &&
                im_14.getVisibility()==View.INVISIBLE &&
                im_21.getVisibility()==View.INVISIBLE &&
                im_22.getVisibility()==View.INVISIBLE &&
                im_23.getVisibility()==View.INVISIBLE &&
                im_24.getVisibility()==View.INVISIBLE &&
                im_31.getVisibility()==View.INVISIBLE &&
                im_32.getVisibility()==View.INVISIBLE &&
                im_33.getVisibility()==View.INVISIBLE &&
                im_34.getVisibility()==View.INVISIBLE ){
            AlertDialog.Builder alterDialogBuilder=new AlertDialog.Builder(MainActivity.this);
            alterDialogBuilder
                    .setMessage("GAME OVER!\nP1:"+playerPoints+ "\nP2:"+ cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog=alterDialogBuilder.create();
            alertDialog.show();

        }
    }
    private void frontOfCardsResources() {
        image101 = R.drawable.im_image101;
        image102 = R.drawable.im_image102;
        image103 = R.drawable.im_image103;
        image104 = R.drawable.im_image104;
        image105 = R.drawable.im_image105;
        image106 = R.drawable.im_image106;
        image201 = R.drawable.im_image201;
        image202 = R.drawable.im_image202;
        image203 = R.drawable.im_image203;
        image204 = R.drawable.im_image204;
        image205 = R.drawable.im_image205;
        image206 = R.drawable.im_image206;

    }

}
