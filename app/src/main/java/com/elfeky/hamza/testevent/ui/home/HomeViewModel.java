package com.elfeky.hamza.testevent.ui.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.elfeky.hamza.testevent.R;
import com.elfeky.hamza.testevent.ui.home.viewpager.ViewPagerModel;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {


  // ViewPager Data
    public MutableLiveData<ArrayList<ViewPagerModel>> viewPagerMutableData = new MutableLiveData<ArrayList<ViewPagerModel>>();
    ArrayList<ViewPagerModel> arrayListVP = new ArrayList<>();

    public void ViewModelgetVP() {

        viewPagerMutableData.setValue(getDataVP());
    }

    public ArrayList<ViewPagerModel> getDataVP() {

        arrayListVP.add(new ViewPagerModel(R.drawable.egypt,"Egypt Special event","april 2,Egypt",
                R.drawable.ic_favorite_white));
        arrayListVP.add(new ViewPagerModel(R.drawable.uae,"UAE Special event","june 15,UAE",
                R.drawable.ic_favorite_red_24dp));
        arrayListVP.add(new ViewPagerModel(R.drawable.cairo,"Cairo Special event","October 30,Cairo",
                R.drawable.ic_favorite_white));

        return arrayListVP;
    }

    public int getSizeVP(){
        return arrayListVP.size();
    }



}