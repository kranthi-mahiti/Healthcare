package mahiti.org.healthcare.views.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.app.HealthCareConstants;
import mahiti.org.healthcare.models.VillageListModel;
import mahiti.org.healthcare.views.activites.HouseActivity;
import mahiti.org.healthcare.views.activites.VillagesListActivity;

public class VillageListAdapter extends RecyclerView.Adapter<VillageListAdapter.MyViewHolder> {

    private List<VillageListModel> villageListModels = new ArrayList<>();
    private Context context;


    public VillageListAdapter(Context context, List<VillageListModel> villageModels) {
        this.context = context;
        this.villageListModels = villageModels;
    }

    @NonNull
    @Override
    public VillageListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.housesitem, parent, false);
        VillageListAdapter.MyViewHolder myviewHolder = new VillageListAdapter.MyViewHolder(view);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VillageListAdapter.MyViewHolder holder, final int position) {
        holder.housename.setText(villageListModels.get(position).getName());
        holder.housenumbers.setText(String.valueOf(villageListModels.get(position).getNumberOfpeoples()));
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HouseActivity.class);
                intent.putExtra("villagename", villageListModels.get(position).getName());
                HealthCareConstants.SESSION_MANAGER.setHouseNo(villageListModels.get(position).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return villageListModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView housename;
        TextView housenumbers;
        RelativeLayout card;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.housename = itemView.findViewById(R.id.housename);
            this.housenumbers = itemView.findViewById(R.id.housenumber);
            this.card = itemView.findViewById(R.id.card);

        }
    }
}
