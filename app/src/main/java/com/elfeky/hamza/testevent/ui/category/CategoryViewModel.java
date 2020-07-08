package com.elfeky.hamza.testevent.ui.category;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.elfeky.hamza.testevent.R;
import com.elfeky.hamza.testevent.ui.category.listview.ListModelCateg;

import java.util.ArrayList;

public class CategoryViewModel extends ViewModel {

    public MutableLiveData<ArrayList<ListModelCateg>> mCateg = new MutableLiveData<>();

    public CategoryViewModel() {

        mCateg.setValue(getCateg());
    }

    public ArrayList<ListModelCateg> getCateg() {
        ArrayList<ListModelCateg> arrayListCat = new ArrayList<>();

        arrayListCat.add(new ListModelCateg(R.drawable.movephoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_mov_cat_icon,"movies"));
        arrayListCat.add(new ListModelCateg(R.drawable.sportphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_sport_cat_icon,"sports"));
        arrayListCat.add(new ListModelCateg(R.drawable.tecnolgphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_tecnolg_cat_icon,"Technology"));
        arrayListCat.add(new ListModelCateg(R.drawable.movephoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_mov_cat_icon,"movies"));
        arrayListCat.add(new ListModelCateg(R.drawable.sportphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_sport_cat_icon,"sports"));
        arrayListCat.add(new ListModelCateg(R.drawable.tecnolgphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_tecnolg_cat_icon,"Technology"));
        arrayListCat.add(new ListModelCateg(R.drawable.movephoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_mov_cat_icon,"movies"));
        arrayListCat.add(new ListModelCateg(R.drawable.sportphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_sport_cat_icon,"sports"));
        arrayListCat.add(new ListModelCateg(R.drawable.tecnolgphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_tecnolg_cat_icon,"Technology"));
        arrayListCat.add(new ListModelCateg(R.drawable.movephoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_mov_cat_icon,"movies"));
        arrayListCat.add(new ListModelCateg(R.drawable.sportphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_sport_cat_icon,"sports"));
        arrayListCat.add(new ListModelCateg(R.drawable.tecnolgphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_tecnolg_cat_icon,"Technology"));
        arrayListCat.add(new ListModelCateg(R.drawable.movephoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_mov_cat_icon,"movies"));
        arrayListCat.add(new ListModelCateg(R.drawable.sportphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_sport_cat_icon,"sports"));
        arrayListCat.add(new ListModelCateg(R.drawable.tecnolgphoto1,R.drawable.ic_favorite_white,
                R.drawable.ic_tecnolg_cat_icon,"Technology"));

        return arrayListCat;
    }
}