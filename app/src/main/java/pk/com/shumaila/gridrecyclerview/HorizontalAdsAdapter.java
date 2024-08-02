package pk.com.shumaila.gridrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAdsAdapter extends RecyclerView.Adapter<HorizontalAdsAdapter.AdsViewHolder1> {
List<HorizontalAds> horizontalAdsList;

    public HorizontalAdsAdapter(List<HorizontalAds> horizontalAdsList) {
        this.horizontalAdsList = horizontalAdsList;
    }

    @NonNull
    @Override
    public AdsViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adsRootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_ads_list_view , null);
        return new AdsViewHolder1(adsRootView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdsViewHolder1 holder, int position) {
        HorizontalAds horizontalAds = horizontalAdsList.get(position);
        holder.ivAdsImage.setImageResource(horizontalAds.getAdsImageId());
        holder.tvAppNameAds.setText(horizontalAds.getAppNameAds());
        holder.ivAppIconAds.setImageResource(horizontalAds.getAppIconAds());
    }

    @Override
    public int getItemCount() {
        return horizontalAdsList.size();
    }

     class AdsViewHolder1 extends RecyclerView.ViewHolder{
        ImageView ivAdsImage , ivAppIconAds;
        TextView tvAppNameAds;

        public AdsViewHolder1(@NonNull View itemView) {
            super(itemView);
            ivAdsImage=itemView.findViewById(R.id.ivAdsImage);

            ivAppIconAds = itemView.findViewById(R.id.ivAppIconAds);
            tvAppNameAds = itemView.findViewById(R.id.tvAppNameAds);

        }
    }

}
