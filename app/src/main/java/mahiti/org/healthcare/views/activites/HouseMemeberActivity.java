package mahiti.org.healthcare.views.activites;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gtomato.android.ui.transformer.CoverFlowViewTransformer;
import com.gtomato.android.ui.widget.CarouselView;

import java.util.ArrayList;
import java.util.List;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.models.DiseasesModel;
import mahiti.org.healthcare.models.PatientDetailsModel;
import mahiti.org.healthcare.views.adapter.DiseasesAdapter;
import mahiti.org.healthcare.views.adapter.PatientDetailAdapter;

public class HouseMemeberActivity extends AppCompatActivity {

    private String newString = null;
    private String name = null;
    private String age = null;
    private String gender = null;
    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_memeber);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
                name = null;
                age = null;
                gender = null;
            } else {
                newString = extras.getString("villagename");
                name = extras.getString("name");
                age = extras.getString("age");
                gender = extras.getString("gender");
            }
        } else {
            newString = (String) savedInstanceState.getSerializable("villagename");
            name = (String) savedInstanceState.getSerializable("name");
            age = (String) savedInstanceState.getSerializable("age");
            gender = (String) savedInstanceState.getSerializable("gender");
        }

        setTitle(newString);
        t1 = findViewById(R.id.patient_name);
        t2 = findViewById(R.id.patient_birthday);
        t3 = findViewById(R.id.patient_gender);

        t1.setText(name);
        t2.setText(age);
        t3.setText(gender);

        CarouselView carousel = findViewById(R.id.recyclerview_patient_details);
        CoverFlowViewTransformer transformer = new CoverFlowViewTransformer();
        carousel.setTransformer(transformer);


        List<PatientDetailsModel> patientDetailsModels = new ArrayList<>();
        PatientDetailsModel patientDetailsModel = new PatientDetailsModel("163 CM", R.drawable.scroolheight100);
        PatientDetailsModel patientDetailsModel1 = new PatientDetailsModel("63 KG", R.drawable.scroolwaight100);
        PatientDetailsModel patientDetailsModel2 = new PatientDetailsModel("B+ Ve ", R.drawable.scroolbloodgroup100);
        PatientDetailsModel patientDetailsModel3 = new PatientDetailsModel("85", R.drawable.scroolbp100);
        PatientDetailsModel patientDetailsModel4 = new PatientDetailsModel("90'C ", R.drawable.scrooltemp100);

        patientDetailsModels.add(patientDetailsModel);
        patientDetailsModels.add(patientDetailsModel1);
        patientDetailsModels.add(patientDetailsModel2);
        patientDetailsModels.add(patientDetailsModel3);
        patientDetailsModels.add(patientDetailsModel4);

        PatientDetailAdapter adapter = new PatientDetailAdapter(this, patientDetailsModels);
        carousel.setAdapter(adapter);


        RecyclerView recyclerView1 = findViewById(R.id.recyclerview_diseases);
        recyclerView1.setLayoutManager(new GridLayoutManager(this, 3));
        List<DiseasesModel> diseasesModels = new ArrayList<>();
        DiseasesModel diseasesModel = new DiseasesModel("Cough and cold", R.drawable.coughandcold100);
        DiseasesModel diseasesModel1 = new DiseasesModel("Tiredness", R.drawable.tiredness100);
        DiseasesModel diseasesModel2 = new DiseasesModel("Diarrhea", R.drawable.diarrhea100);
        DiseasesModel diseasesModel3 = new DiseasesModel("Breathinf Trouble", R.drawable.breathingtrouble100);
        DiseasesModel diseasesModel4 = new DiseasesModel("Muscle Ache", R.drawable.muscleache100);
        DiseasesModel diseasesModel5 = new DiseasesModel("Diabetes and Hypertension", R.drawable.diabetesandhypertension100);
        DiseasesModel diseasesModel6 = new DiseasesModel("Skin", R.drawable.skin100);
        DiseasesModel diseasesModel7 = new DiseasesModel("Fever", R.drawable.fever100);
        diseasesModels.add(diseasesModel);
        diseasesModels.add(diseasesModel1);
        diseasesModels.add(diseasesModel2);
        diseasesModels.add(diseasesModel3);
        diseasesModels.add(diseasesModel4);
        diseasesModels.add(diseasesModel5);
        diseasesModels.add(diseasesModel6);
        diseasesModels.add(diseasesModel7);
        DiseasesAdapter adapter1 = new DiseasesAdapter(this, diseasesModels);
        recyclerView1.setAdapter(adapter1);
    }

}
