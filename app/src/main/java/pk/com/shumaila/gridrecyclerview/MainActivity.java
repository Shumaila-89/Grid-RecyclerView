package pk.com.shumaila.gridrecyclerview;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView ivDpImage;
    RecyclerView rvVerticalList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ivDpImage=findViewById(R.id.ivDpImage);

        ivDpImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.gmail_click);

                TextView cross = dialog.findViewById(R.id.icCross);
                cross.setOnClickListener(v1 -> {
                    dialog.dismiss();
                });

                dialog.show();
            }
        });


        rvVerticalList=findViewById(R.id.rvRecyclerview);
        VerticalListAdapter verticalListAdapter=new VerticalListAdapter(childMode(),ParentMode());
        rvVerticalList.setAdapter(verticalListAdapter);
        rvVerticalList.setHasFixedSize(true);
        rvVerticalList.setLayoutManager(new LinearLayoutManager(this));

    }

    public List<List<App>> childMode() {
        List<List<App>> appList = new ArrayList<>();
        appList.add(RecommendedForYou());
        appList.add(PopularApp());
        appList.add(Education());
        appList.add(fitnessApps());
        appList.add(EditingLikePro());
        appList.add(SocialsApp());
        return appList;

    }
    public List<Category>ParentMode(){
        List<Category> categoryList=new ArrayList<>();
        categoryList.add(new Category("Recommended For You"));
        categoryList.add(new Category("Popular Apps"));
        categoryList.add(new Category("Education Apps"));
        categoryList.add(new Category("Health & Fitness Apps"));
        categoryList.add(new Category("Editing Like Pro"));
        categoryList.add(new Category("Social Apps"));
        return categoryList;
    }
    public List<App> RecommendedForYou(){
        List<App> appList=new ArrayList<>();
        appList.add(new App(R.drawable.instagram,"InstaGram " , "4.4"));
        appList.add(new App(R.drawable.tiktok,"TikTok" , "4.5"));
        appList.add(new App(R.drawable.snapchat,"SnapChat"  ,"3.3"));
        appList.add(new App(R.drawable.messenger,"Messanger", "3.9"));
        appList.add(new App(R.drawable.linkedin,"Linkedin" , "4.8"));

        return appList;



    }
    public List<App> PopularApp(){
        List<App>appList=new ArrayList<>();
        appList.add(new App(R.drawable.pubg,"Pubg" , "4.4"));
        appList.add(new App(R.drawable.telegramimage7,"Telegram" , "3.5"));
        appList.add(new App(R.drawable.facebook,"FaceBook" , "3.9"));
        appList.add(new App(R.drawable.twitter,"Twitter" , "3.4"));
        appList.add(new App(R.drawable.whatsapp,"Whatsapp" , "4.2"));
        appList.add(new App(R.drawable.youtube1,"Youtube" ,  " 4.5"));
        return appList;

    }
    public List<App>Education(){
        List<App>appList=new ArrayList<>();
        appList.add(new App(R.drawable.pgc,"PGC" , "4.6"));
        appList.add(new App(R.drawable.kips,"Kips" , "3.6"));
        appList.add(new App(R.drawable.step,"Step by PGC" , "4.1"));
        appList.add(new App(R.drawable.udemy,"Udemy" , "3.6"));
        appList.add(new App(R.drawable.quizlet,"Quizlet" , "4.3"));
        appList.add(new App(R.drawable.remini,"Remini" , "3.6"));
        appList.add(new App(R.drawable.quizlet2,"Quizlet Updated" , "3.3"));



        return  appList;


    }
    public List<App> fitnessApps(){
        List<App> appList=new ArrayList<>();
        appList.add(new App(R.drawable.careplus,"Care Plus" , "3.9"));
        appList.add(new App(R.drawable.heartbeat,"Fitness","4.6"));
        appList.add(new App(R.drawable.medicareimage,"Medicare" , "4.1"));
        appList.add(new App(R.drawable.meplusimage,"First Aid" , "3.4"));
        appList.add(new App(R.drawable.gym,"Gym App" , "4.4"));
        appList.add(new App(R.drawable.healthcare,"Health Care", "4.2"));


        return appList;
    }
    public List<App>SocialsApp(){
        List<App>appList=new ArrayList<>();
        appList.add(new App(R.drawable.instagram,"InstaGram" , "3.9"));
        appList.add(new App(R.drawable.tiktok,"TikTok" , "4.4"));
        appList.add(new App(R.drawable.snapchat,"SnapChat", "4.2"));
        appList.add(new App(R.drawable.messenger,"Messanger","4.6"));
        appList.add(new App(R.drawable.whatsapp,"Whatsapp" , "3.4"));
        appList.add(new App(R.drawable.linkedin,"Linkedin","4.6"));
        appList.add(new App(R.drawable.facebook,"Facebook" , "4.8"));

//        appList.add(new App(R.drawable.lik,"Likee\n2.1*\n 21MB"));


        return appList;

    }
    public List<App> EditingLikePro(){
        List<App>appList=new ArrayList<>();
        appList.add(new App(R.drawable.canva,"Canva" , "4.3"));
        appList.add(new App(R.drawable.camscnner,"Camscanner" , "4.4"));
        appList.add(new App(R.drawable.beauty_camera,"Beauty Camera" , "4.3"));
        appList.add(new App(R.drawable.capcut,"Capcut" , "4.3"));
        appList.add(new App(R.drawable.camera5,"Camera" , "4.6"));
        appList.add(new App(R.drawable.beautycamera,"Photo Camera" , "4.3"));
        appList.add(new App(R.drawable.face_app,"Face App" , "4.3"));


//        appList.add(new App(R.drawable.img_29,"Photo editor\n 30Mb"));

        return appList;
    }
}
