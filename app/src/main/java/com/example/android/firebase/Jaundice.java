package com.example.android.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Jaundice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaundice);

        TextView mjaundice = (TextView)findViewById(R.id.textWindow1);

        mjaundice.setText("JAUNDICE\n" +
                "Jaundice is a term used to describe a yellowish tinge to the skin and the whites of the eye. Body fluids may also be yellow.\n" +
                "Causes\n" +
                "infections of the liver from a virus (hepatitis A, hepatitis B,hepatitis C,hepatitis Dand hepatitis E) or a parasite\n" +
                "Use of certain drugs (such as an overdose of acetaminophen) or exposure to poisons\n" +
                "Chronic liver disease \n" +
                "Blood disorders\n" +
                "Cancer of pancreas\n" +
                "Symptomps\n" +
                "a yellow tinge to the skin and the whites of the eyes, normally starting at the head and spreading down the body\n" +
                " pale stools\n" +
                "dark urine\n" +
                "itchiness\n" +
                "Treatment\n" +
                "The medical treatment of jaundice targets the specific cause, rather than the jaundice itself. For example:\n" +
                "Hepatocellular jaundice is treated with anti-viral medications and steroids\n" +
                "Hemolytic jaundice is treated with iron supplements\n" +
                "Obstructive jaundice is treated with surgery to remove the obstruction followed by medication\n" +
                "There is also medication induced jaundice, in other words, jaundice which occurs as a side effect to consuming certain medicines. In such cases the medicines are discontinued and alternative medicines are prescribed.\n" +
                "Prevention\n" +
                "Drink plenty of water daily.\n" +
                "Avoid hepatitis infection.\n" +
                "Stay within recommended alcohol limits.\n" +
                "Maintain a healthy weight.\n" +
                "Manage your cholesterol.\n");
    }
}
