package mahiti.org.healthcare.views.activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.app.HealthCareConstants;

public class SymptomsDetailActivity extends AppCompatActivity {
    TextView t1, t2, t3;
    Button continue_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(HealthCareConstants.SESSION_MANAGER.getHouseNo());
        t1 = findViewById(R.id.patient_name);
        t2 = findViewById(R.id.patient_birthday);
        t3 = findViewById(R.id.patient_gender);
        continue_btn = findViewById(R.id.continue_btn);
        t1.setText(HealthCareConstants.SESSION_MANAGER.getPatientName());
        t2.setText(HealthCareConstants.SESSION_MANAGER.getPatientAge());
        t3.setText(HealthCareConstants.SESSION_MANAGER.getPatientGender());
        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SymptomsDetailActivity.this, SuggestionsActivity.class);
                startActivity(i);
            }
        });

    }

}
