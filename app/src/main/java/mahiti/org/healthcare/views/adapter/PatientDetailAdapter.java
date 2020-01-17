package mahiti.org.healthcare.views.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gtomato.android.ui.manager.CarouselLayoutManager;
import com.gtomato.android.ui.widget.CarouselView;

import java.util.ArrayList;
import java.util.List;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.models.PatientDetailsModel;

public class PatientDetailAdapter extends CarouselView.Adapter<PatientDetailAdapter.MyViewHolder> {
    private Context context;
    private List<PatientDetailsModel> patientDetailsModelList = new ArrayList<>();

    public PatientDetailAdapter(Context context, List<PatientDetailsModel> patientDetailsModels) {
        this.context = context;
        this.patientDetailsModelList = patientDetailsModels;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.patientdetailitem, parent, false);
        PatientDetailAdapter.MyViewHolder myviewHolder = new PatientDetailAdapter.MyViewHolder(view);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.patientdetail.setText(patientDetailsModelList.get(position).getPatientDetail());
        holder.imageView.setImageResource(patientDetailsModelList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return patientDetailsModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView patientdetail;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.patientdetail = itemView.findViewById(R.id.tvName);
            this.imageView = itemView.findViewById(R.id.ivProfile);
        }
    }
}
