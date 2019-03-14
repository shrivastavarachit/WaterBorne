package com.example.android.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Others extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        TextView mOthers = (TextView)findViewById(R.id.textWindow1);
        mOthers.setText("SYMPTOMS – Salmonella\n" +
                "\n" +
                "\n" +
                "The most common symptoms of salmonellosis include diarrhea, fever, vomiting and abdominal cramps. Dehydration can also occur, most notably in infants.\n" +
                "\n" +
                "Usually there is little or no fever, and the illness goes away in 5-10 days.\n" +
                "\n" +
                "\n" +
                "PREVENTION\n" +
                "Wash fresh vegetables and fruit thoroughly before eating.\n" +
                "Keep hot foods hot and cold foods cold.\n" +
                "Do not eat or drink foods containing raw eggs or raw (unpasteurized) milk.\n" +
                "Giardia and Cryptosporidium\n" +
                "Giardia and Cryptosporidium are microscopic parasites or cysts that can be found in water.\n" +
                "Giardia causes an intestinal illness called giardiasis or “beaver fever.” During the past 2 decades, Giardia infection has become recognized as one of the most common causes of waterborne disease (found in both drinking and recreational water) in humans in North America. Giardia are found worldwide and within every region of Canada and the United States.\n" +
                "Cryptosporidium is responsible for a similar illness called cryptosporidiosis.\n" +
                "SYMPTOMS\n" +
                "Diarrhea, abdominal cramps, gas, malaise, and weight loss are the most common symptoms caused by Giardia. Vomiting, chills, headache, and fever may also occur.\n" +
                "These symptoms usually surface six to 16 days after the initial contact and can continue as long as one month.\n" +
                "PREVENTION\n" +
                "\n" +
                "Wash your hands thoroughly by using plenty of soap and hot water, cleaning between fingers and under fingernails, rinsing well and drying on a clean dry towel or paper towel:\n" +
                "before and after preparing food\n" +
                "after going to the toilet or changing a baby’s nappy\n" +
                "after caring for people with cryptosporidium or giardia\n");
    }
}
