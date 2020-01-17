package mahiti.org.healthcare.views.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.app.HealthCareConstants;
import mahiti.org.healthcare.models.HouseMembersModel;
import mahiti.org.healthcare.views.activites.HouseMemeberActivity;

public class HouseAdapter extends RecyclerView.Adapter<HouseAdapter.MyViewHolder> {

    private List<HouseMembersModel> houseMembersModels = new ArrayList<>();
    private Context context;

    public HouseAdapter(Context context, List<HouseMembersModel> houseMembersModels) {
        this.context = context;
        this.houseMembersModels = houseMembersModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.housemembersitem, parent, false);
        HouseAdapter.MyViewHolder myviewHolder = new HouseAdapter.MyViewHolder(view);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.name.setText(String.valueOf(houseMembersModels.get(position).getName()));
        holder.age.setText(String.valueOf(houseMembersModels.get(position).getAge()));
        holder.gender.setText(String.valueOf(houseMembersModels.get(position).getGender()));
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HouseMemeberActivity.class);
                intent.putExtra("villagename", houseMembersModels.get(position).getName());
                intent.putExtra("name", houseMembersModels.get(position).getName());
                intent.putExtra("age", houseMembersModels.get(position).getAge());
                intent.putExtra("gender", houseMembersModels.get(position).getGender());
                HealthCareConstants.SESSION_MANAGER.setPatientName(houseMembersModels.get(position).getName());
                HealthCareConstants.SESSION_MANAGER.setPatientAge(houseMembersModels.get(position).getAge());
                HealthCareConstants.SESSION_MANAGER.setPatientGender(houseMembersModels.get(position).getGender());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return houseMembersModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView age;
        TextView gender;
        LinearLayout card;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.tvName);
            this.age = itemView.findViewById(R.id.age);
            this.gender = itemView.findViewById(R.id.gender);
            this.card = itemView.findViewById(R.id.card);
        }
    }
}
