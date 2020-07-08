package com.elfeky.hamza.testevent.ui.home;


import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.elfeky.hamza.testevent.R;
import com.elfeky.hamza.testevent.ui.home.listview.AdapterListHome;
import com.elfeky.hamza.testevent.ui.home.listview.ListModelHome;
import com.elfeky.hamza.testevent.ui.home.viewpager.ViewPagerAdapter;
import com.elfeky.hamza.testevent.ui.home.viewpager.ViewPagerModel;
import java.util.ArrayList;

public class HomeFragment extends Fragment {

    ViewPagerAdapter viewPagerAdapter;
    AdapterListHome adapterListHome;
    LinearLayout linearLayout;
    Context context;
    // ViewPager Array
    ArrayList<ViewPagerModel> arrayListVP = new ArrayList<>();
    TextView[] dot;
    // ListView Array
    ArrayList<ListModelHome> arrayListLV = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        context = container.getContext();

        // Create View Pager

        arrayListVP.add(new ViewPagerModel(R.drawable.egypt,"Egypt Special event","april 2,Egypt",
                R.drawable.ic_favorite_white));
        arrayListVP.add(new ViewPagerModel(R.drawable.uae,"UAE Special event","june 15,UAE",
                R.drawable.ic_favorite_red_24dp));
        arrayListVP.add(new ViewPagerModel(R.drawable.cairo,"Cairo Special event","October 30,Cairo",
                R.drawable.ic_favorite_white));
        linearLayout = root.findViewById(R.id.lin_dot);
        ViewPager viewPager = root.findViewById(R.id.VP_home);
        viewPagerAdapter = new ViewPagerAdapter(context,arrayListVP);
        viewPager.setAdapter(viewPagerAdapter);
        addDot(0);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                addDot(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });




        return root;

        //        // Create ListView
//
//        arrayListLV.add(new ListModel(R.drawable.movephoto,R.drawable.ic_favorite_white,R.drawable.ic_mov_cat_icon,"movies"));
//        arrayListLV.add(new ListModel(R.drawable.sportphoto,R.drawable.ic_favorite_white,R.drawable.ic_sport_cat_icon,"sports"));
//        arrayListLV.add(new ListModel(R.drawable.tecnolgphoto,R.drawable.ic_favorite_white,R.drawable.ic_tecnolg_cat_icon,"Technology"));
//
//        ListView lstIcon = root.findViewById(R.id.lt_fav_icon);
//        adapterListHome = new AdapterListHome(context,arrayListLV);
//        lstIcon.setAdapter(adapterListHome);

//        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
//        homeViewModel.viewPagerMutableData.observe(getViewLifecycleOwner(), new Observer<ArrayList<ViewPagerModel>>() {
//            @Override
//            public void onChanged(ArrayList<ViewPagerModel> viewPagerModels) {
//
//            }
//        });


//        recyclerView = root.findViewById(R.id.rycle_home);
//        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
//        startSnapHelper = new PagerSnapHelper();
//        startSnapHelper.attachToRecyclerView(recyclerView);
//        recycleAdapter = new RecycleAdapter(arrayList);
//        recyclerView.setAdapter(recycleAdapter);





//        recyclerView.removeOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//            }
//
//            @Override
//            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//            }
//        });


    }

       public void addDot(int pg_position){
        dot = new TextView[arrayListVP.size()];
        linearLayout.removeAllViews();

        for(int i = 0 ; i <dot.length ; i++){
            dot[i] = new TextView(context);
            dot[i].setText(Html.fromHtml("."));
            dot[i].setTextSize(40);
            dot[i].setHintTextColor(getResources().getColor(R.color.offwhite));
            linearLayout.addView(dot[i]);
        }
        dot[pg_position].setTextColor(getResources().getColor(R.color.white));
    }

}