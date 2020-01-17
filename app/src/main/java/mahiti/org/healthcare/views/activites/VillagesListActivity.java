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
import mahiti.org.healthcare.models.VillageListModel;
import mahiti.org.healthcare.views.adapter.VillageListAdapter;

public class VillagesListActivity extends AppCompatActivity {

    private MaterialSearchView searchView;
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villages_list);
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


        List<VillageListModel> villageModels=new ArrayList<>();
        VillageListModel villageListModel=new VillageListModel("kanna","5");
        VillageListModel villageListModel1=new VillageListModel("sanjay","95");
        VillageListModel villageListModel2=new VillageListModel("chetha","20");
        VillageListModel villageListModel3=new VillageListModel("rajaryan","10");
        VillageListModel villageListModel4=new VillageListModel("kittu","03");
        villageModels.add(villageListModel);
        villageModels.add(villageListModel1);
        villageModels.add(villageListModel2);
        villageModels.add(villageListModel3);
        villageModels.add(villageListModel4);
        VillageListAdapter adapter = new VillageListAdapter(this,villageModels);
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
