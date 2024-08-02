package pk.com.shumaila.gridrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAppListAdapter extends RecyclerView.Adapter<HorizontalAppListAdapter.HorizontalAppListViewHolder> {
    List<App> appList;

    public HorizontalAppListAdapter(List<App> appList) {
        this.appList = appList;
    }

    @NonNull
    @Override
    public HorizontalAppListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView=LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_list_view_holder,null);
        return new HorizontalAppListViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAppListViewHolder holder, int position) {
        App app  = appList.get(position);

        holder.tvAppName.setText(app.getName());
        holder.ivApp.setImageResource(app.getImageResourceId());
        holder.rating.setText(app.getRating());

    }

    @Override
    public int getItemCount() {
        return appList.size();
    }

    class HorizontalAppListViewHolder extends RecyclerView.ViewHolder{

        ImageView ivApp;
        TextView tvAppName;
        TextView rating;

        public HorizontalAppListViewHolder(@NonNull View itemView) {
            super(itemView);
            ivApp=itemView.findViewById(R.id.ivApp);
            tvAppName=itemView.findViewById(R.id.tvAppName);
            rating = itemView.findViewById(R.id.tvRating);
        }
    }





}
