package mahiti.org.healthcare.views.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.models.DiseasesModel;
import mahiti.org.healthcare.models.PatientDetailsModel;
import mahiti.org.healthcare.views.activites.GatherDetailsActivity;
import mahiti.org.healthcare.views.activites.HouseMemeberActivity;

public class DiseasesAdapter extends RecyclerView.Adapter<DiseasesAdapter.MyViewHolder> {
    private Context context;
    private List<DiseasesModel> diseasesModels = new ArrayList<>();

    public DiseasesAdapter(Context context, List<DiseasesModel> diseasesModels) {
        this.context = context;
        this.diseasesModels = diseasesModels;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.diseaseitem, parent, false);
        DiseasesAdapter.MyViewHolder myviewHolder = new DiseasesAdapter.MyViewHolder(view);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int[] androidColors = context.getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];

        holder.diseaseName.setText(diseasesModels.get(position).getDiseaseName());
        holder.cardView.setCardBackgroundColor(randomAndroidColor);
        holder.disease.setImageResource(diseasesModels.get(position).getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, GatherDetailsActivity.class);
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return diseasesModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView diseaseName;
        ImageView disease;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.diseaseName = itemView.findViewById(R.id.tvName);
            this.disease = itemView.findViewById(R.id.ivProfile);
            this.cardView = itemView.findViewById(R.id.card_background);
        }
    }
}
