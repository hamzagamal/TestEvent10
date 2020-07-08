package com.elfeky.hamza.testevent.ui.category;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.elfeky.hamza.testevent.R;
import com.elfeky.hamza.testevent.ui.category.listview.AdapterCateg;
import com.elfeky.hamza.testevent.ui.category.listview.ListModelCateg;
import java.util.ArrayList;

public class CategoryFragment extends Fragment {

    private CategoryViewModel favoriteViewModel;
    AdapterCateg adapterCateg;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_category, container, false);

        recyclerView = root.findViewById(R.id.lt_category1);
        adapterCateg = new AdapterCateg();
        recyclerView.setAdapter(adapterCateg);

        favoriteViewModel = ViewModelProviders.of(this).get(CategoryViewModel.class);

        favoriteViewModel.mCateg.observe(getViewLifecycleOwner(), new Observer<ArrayList<ListModelCateg>>() {
            @Override
            public void onChanged(ArrayList<ListModelCateg> listModelCategs) {

                adapterCateg.setListCat(listModelCategs);

            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));

        return root;

    }
}