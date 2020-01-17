package mahiti.org.healthcare.views.activites;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.models.HouseMembersModel;
import mahiti.org.healthcare.views.adapter.HouseAdapter;

public class HouseActivity extends AppCompatActivity {

    private MaterialSearchView searchView;
    private String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("villagename");
            }
        } else {
            newString = (String) savedInstanceState.getSerializable("villagename");
        }
        setTitle(newString);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        List<HouseMembersModel> houseMembersModels = new ArrayList<>();
        HouseMembersModel houseMembersModel = new HouseMembersModel("sanjay","26","male");
        houseMembersModels.add(houseMembersModel);

        HouseAdapter adapter = new HouseAdapter(this, houseMembersModels);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_screen, menu);

        return true;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
