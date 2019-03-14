package com.example.android.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Typhoid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoid);

        TextView mtyphoid = (TextView)findViewById(R.id.textWindow1);

         mtyphoid.setText("1.Typhoid fever is a type of enteric fever, along with paratyphoid fever. 2.Typhoid is spread by eating or drinking food or water contaminated with the feces of an infected person.\n" +
                "CAUSES\n" +
                "eating raw vegetables that have been fertilised with human waste\n" +
                "contaminated milk products\n" +
                "eating seafood from a water source contaminated by infected  pee\n" +
                "Symptoms\n" +
                "     It can take a week or two after infection for symptoms to appear. Some        of these symptoms are:\n" +
                "high fever\n" +
                "Weakness stomach pain\n" +
                "headache\n" +
                "poor appetite\n" +
                "rash\n" +
                "Fatigue\n" +
                "TREATING TYPHOID INCLUDE\n" +
                "Typhoid is treated with antibiotics.\n" +
                "Drinking fluids. This helps prevent the dehydration that results from a prolonged fever and diarrhea.\n" +
                "Surgery. If your intestines become perforated, you'll need surgery to repair the hole.\n" +
                "Prevention\n" +
                "Drink bottle, preferably carbonated, water\n" +
                "Boil non-bottled water for one minute before drinking\n" +
                "Avoiding drinking water from wells and taps while traveling\n" +
                "Avoiding salads and condiments prepared from fresh ingredients while in high-risk areas\n" +
                "Peel fruit yourself and don’t eat the peel\n" +
                "Try not to eat food from street food stands\n" +
                "Eat food while it’s still hot\n" +
                "Don’t touch your face unless you’ve just washed your hands\n" +
                "Wash hands frequently\n" +
                "Eat pasteurized dairy products\n" +
                "Avoid using ice made of tap or well water\n" +
                "Use hand sanitizer\n");


    }
}
