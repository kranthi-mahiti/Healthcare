package mahiti.org.healthcare.views.activites;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.app.HealthCareConstants;

public class SuggestionActivity2 extends AppCompatActivity {
    Button btn_continue,btn_consultant;
    TextView t1, t2, t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_continue = findViewById(R.id.continue_btn);
        btn_consultant=findViewById(R.id.continue_btn1);
        setTitle(HealthCareConstants.SESSION_MANAGER.getHouseNo());
        t1 = findViewById(R.id.patient_name);
        t2 = findViewById(R.id.patient_birthday);
        t3 = findViewById(R.id.patient_gender);
        t1.setText(HealthCareConstants.SESSION_MANAGER.getPatientName());
        t2.setText(HealthCareConstants.SESSION_MANAGER.getPatientAge());
        t3.setText(HealthCareConstants.SESSION_MANAGER.getPatientGender());
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SuggestionActivity2.this, ConsultDoctor.class);
                startActivity(i);
            }
        });
        btn_consultant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SuggestionActivity2.this, PatientFormActivity.class);
                startActivity(i);

            }
        });
    }

}
