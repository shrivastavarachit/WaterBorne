package com.example.android.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Cholera extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholera);

        TextView mTitleWindow = (TextView)findViewById(R.id.titleWindow);
        TextView mTextWindow1 = (TextView)findViewById(R.id.textWindow1);

        mTitleWindow.setText("Cholera");

        mTextWindow1.setText(
                "1. An infectious, sometimes fatal disease of the small intestine caused by the bacterium      Vibrio cholerae. \n" +
                        "\n" +
                        "2. It is spread from contaminated water and food and causes severe diarrhea, vomiting, and dehydration\n" +
                        "\n" +
                        "\nCauses of Cholera\n" +
                        "\n" +
                        "Cholera bacteria enter the body through the mouth, often in food or water that has been contaminated with human waste, due to poor sanitation and hygiene.\n" +
                        "Municipal water supplies\n" +
                        "Ice made from municipal water\n" +
                        "Foods and drinks sold by street vendors\n" +
                        "Vegetables grown with water containing human wastes\n" +
                        "\n" +
                        "\n" +
                        "Symptoms of cholera\n" +
                        "Sudden onset on Diarrhea \n" +
                        "Vomiting\n" +
                        "Mild to severe dehydration\n" +
                        "Kidney failure\n" +
                        "\n" +
                        "Treating cholera include:\n" +
                        "oral rehydration salts\n" +
                        "intravenous fluid rehydration\n" +
                        "antibiotics\n" +
                        "zinc supplements\n" +
                        "Preventing Cholera Infection\n" +
                        "wash your hand\n" +
                        "drink only bottled or boiled water\n" +
                        "avoid raw food and shellfish\n" +
                        "avoid dairy foods\n" +
                        "eat raw fruits and vegetables that you can peel yourself\n");





    }
}
