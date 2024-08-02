package pk.com.shumaila.gridrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VerticalListAdapter extends  RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<List<App>> appList;
    List<Category> categoryList;

    public VerticalListAdapter(List<List<App>> appList, List<Category> categoryList) {
        this.appList = appList;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView;
        if (viewType == 0){
            rootView= LayoutInflater.from(parent.getContext()).inflate(R.layout.ads_horizontal_recyclerview, null);
            return new AdsRecyclerViewHolder(rootView);
        }else {
            rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_list_view_holder, null);
            return new VerticalListViewHolder(rootView);
        }

    }

    @Override
    public int getItemViewType(int position) {
        return position%20;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        Category category=categoryList.get(position);

        if (holder instanceof VerticalListViewHolder){

            ((VerticalListViewHolder) holder).tvCategoryName.setText(categoryList.get(position).getName());
            ((VerticalListViewHolder) holder).rvHorizontalAppList.setAdapter(new HorizontalAppListAdapter(appList.get(position)));
            ((VerticalListViewHolder) holder).rvHorizontalAppList.setHasFixedSize(true);
            ((VerticalListViewHolder) holder).rvHorizontalAppList.setLayoutManager( new LinearLayoutManager(( ((VerticalListViewHolder) holder).rvHorizontalAppList.getContext()),LinearLayoutManager.HORIZONTAL,false));

        }else {

            ( (AdsRecyclerViewHolder)  holder).rvAdsHorizontal.setAdapter(new HorizontalAdsAdapter( generateAds()));
            ( (AdsRecyclerViewHolder)  holder).rvAdsHorizontal.setHasFixedSize(true);
            ( (AdsRecyclerViewHolder)  holder).rvAdsHorizontal.setLayoutManager(new LinearLayoutManager(( (AdsRecyclerViewHolder)  holder).rvAdsHorizontal.getContext() , LinearLayoutManager.HORIZONTAL , false));
        }

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    class VerticalListViewHolder extends RecyclerView.ViewHolder{
        RecyclerView rvHorizontalAppList;
        TextView tvCategoryName;
        public VerticalListViewHolder(@NonNull View itemView) {
            super(itemView);
            rvHorizontalAppList=itemView.findViewById(R.id.rvHorizontalAppList);
            tvCategoryName=itemView.findViewById(R.id.tvCategoryName);

        }

    }
    static class AdsRecyclerViewHolder extends RecyclerView.ViewHolder{
        RecyclerView rvAdsHorizontal;
        public AdsRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            rvAdsHorizontal=itemView.findViewById(R.id.rvAdsHorizontal);
        }
    }

    public List<HorizontalAds> generateAds (){
        List<HorizontalAds> adsList = new ArrayList<>();

        adsList.add(new HorizontalAds(R.drawable.sonic_game , R.drawable.sonic , "Super Sonic"));
        adsList.add(new HorizontalAds(R.drawable.gta_vicecity_game , R.drawable.gta_vicecity , "GTA Vice City"));
        adsList.add(new HorizontalAds(R.drawable.mario_game , R.drawable.mario , "Super Mario"));
        adsList.add(new HorizontalAds(R.drawable.ironman_game , R.drawable.ironman, "Iron Man Game"));


        return adsList;
    }

//    interface OnImageClickListener{
//        void onImageClick();
//    }
}
