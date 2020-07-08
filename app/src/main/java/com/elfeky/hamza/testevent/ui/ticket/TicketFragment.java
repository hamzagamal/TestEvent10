package com.elfeky.hamza.testevent.ui.ticket;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.elfeky.hamza.testevent.R;
import com.elfeky.hamza.testevent.ui.category.listview.AdapterCateg;
import com.elfeky.hamza.testevent.ui.category.listview.ListModelCateg;
import com.elfeky.hamza.testevent.ui.ticket.listviewtick.AdapterListTick;
import com.elfeky.hamza.testevent.ui.ticket.listviewtick.AdapterListTicket2;
import com.elfeky.hamza.testevent.ui.ticket.listviewtick.ListModelTick;

import java.util.ArrayList;

public class TicketFragment extends Fragment {

    private TicketViewModel ticketViewModel;
    RecyclerView recyclerView , recyclerView2;
    AdapterListTick adapterListTick;
    AdapterListTicket2 adapterListTicket2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_ticket, container, false);
        ticketViewModel = ViewModelProviders.of(this).get(TicketViewModel.class);


        recyclerView = root.findViewById(R.id.lt_tick_1);
        adapterListTick = new AdapterListTick();
        recyclerView.setAdapter(adapterListTick);

        recyclerView2 = root.findViewById(R.id.lt_tick_2);
        adapterListTicket2 = new AdapterListTicket2();
        recyclerView2.setAdapter(adapterListTicket2);

        ticketViewModel.mTicket.observe(getViewLifecycleOwner(), new Observer<ArrayList<ListModelTick>>() {
            @Override
            public void onChanged(ArrayList<ListModelTick> listModelTicks) {

                adapterListTick.setList(listModelTicks);

            }
        });
        ticketViewModel.mTicket2.observe(getViewLifecycleOwner(), new Observer<ArrayList<ListModelTick>>() {
            @Override
            public void onChanged(ArrayList<ListModelTick> listModelTicks) {

                adapterListTicket2.setList2(listModelTicks);

            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView2.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView2.setNestedScrollingEnabled(false);

        return root;

    }
}
