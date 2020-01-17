package mahiti.org.healthcare.views.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.models.VillageModel;
import mahiti.org.healthcare.views.activites.VillagesListActivity;

public class VillageAdapter extends RecyclerView.Adapter<VillageAdapter.MyviewHolder> {

    private List<VillageModel> villageModelList = new ArrayList<>();
    private Context context;

    public VillageAdapter(Context context) {
        this.context = context;

    }

    public VillageAdapter(Context c, List<VillageModel> villageModels) {
        this.context = c;
        this.villageModelList = villageModels;
    }

    @NonNull
    @Override
    public VillageAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.villageitemnew, parent, false);
        MyviewHolder myviewHolder = new MyviewHolder(view);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VillageAdapter.MyviewHolder holder, final int position) {
        int[] androidColors = context.getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];

        holder.villageName.setText(villageModelList.get(position).getVillageName());
        holder.villageCount.setText(String.valueOf(villageModelList.get(position).getPeopleCount()));
        holder.peopleCount.setText(String.valueOf(villageModelList.get(position).getPeopleCount()));
        holder.villageCard.setCardBackgroundColor(randomAndroidColor);
        holder.villageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, VillagesListActivity.class);
                intent.putExtra("villagename",villageModelList.get(position).getVillageName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return villageModelList.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView villageName;
        TextView villageCount;
        TextView peopleCount;
        CardView villageCard;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            this.villageName = itemView.findViewById(R.id.tvName);
            this.villageCount = itemView.findViewById(R.id.tvName2);
            this.peopleCount = itemView.findViewById(R.id.tvName3);
            this.villageCard=itemView.findViewById(R.id.villagecard);
        }
    }
}
