package com.example.android.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Dysentry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dysentry);

        TextView mDysentry =(TextView)findViewById(R.id.textWindow1);

        mDysentry.setText("Dysentery is an intestinal infection that causes severe diarrhea with blood. In some cases, mucus may be found in the stool. This usually lasts for 3 to 7 days\n" +
                "CAUSE:\n" +
                "contaminated food\n" +
                "contaminated water and other drinks\n" +
                "poor hand washing by infected people\n" +
                "swimming in contaminated water, such as lakes or pools\n" +
                "physical contact\n" +
                "\n" +
                "SYMPTOMS:\n" +
                "\n" +
                "sudden onset of high fever and chills\n" +
                "abdominal pain\n" +
                "cramps and bloating\n" +
                "flatulence (passing gas)\n" +
                "urgency to pass stool\n" +
                "loss of appetite\n" +
                "dehydration\n" +
                "TREATMENT\n" +
                "Mild shigellosis is usually treated just with rest and plenty of fluids.\n" +
                "Antiparasitic medications such as metronidazole and iodoquinol, are commonly used to treat dysentery caused by amoebiasis.\n" +
                "Antibiotics like ciprofloxacin, ofloxacin, levofloxacin, or azithromycin are used to treat the organisms causing bacillary dysentery.\n" +
                "PREVENTION \n" +
                "frequent hand washing\n" +
                "being careful when changing a sick baby’s diaper\n" +
                "not drinks that aren’t bottled and sealed\n");
    }
}
