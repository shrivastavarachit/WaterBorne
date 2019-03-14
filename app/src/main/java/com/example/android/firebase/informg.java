package com.example.android.firebase;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class informg extends AppCompatActivity {


    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informg);

        setSingleEvent(gridLayout);

    }

    private void setSingleEvent(GridLayout gridLayout) {

        CardView c11;

        c11 = (CardView)findViewById(R.id.c1);

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(informg.this , Cholera.class));

            }
        });

        CardView c12;

        c12 = (CardView)findViewById(R.id.c2);

        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(informg.this , Dysentry.class));

            }
        });

        CardView c13;

        c13 = (CardView)findViewById(R.id.c3);

        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(informg.this , Typhoid.class));

            }
        });

        CardView c14;

        c14 = (CardView)findViewById(R.id.c4);

        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(informg.this , Jaundice.class));

            }
        });

        CardView c15;

        c15 = (CardView)findViewById(R.id.c5);

        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(informg.this , Others.class));

            }
        });

//        CardView c16;
//
//        c16 = (CardView)findViewById(R.id.c6);
//
//            c16.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    addNotification();
//
//                }
//            });




        }

        private void addNotification()
        {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                    .setSmallIcon(android.R.drawable.stat_notify_more)
                    .setContentTitle("Notify me")
                    .setContentTitle("Alert");

            Intent notificationIntent = new Intent(this,SecondActivity.class);
            PendingIntent contentIntent = PendingIntent.getActivity(this,0,notificationIntent,PendingIntent.FLAG_IMMUTABLE);
            builder.setContentIntent(contentIntent);

            NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0,builder.build());

        }


}


