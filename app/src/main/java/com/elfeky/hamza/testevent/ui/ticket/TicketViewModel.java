package com.elfeky.hamza.testevent.ui.ticket;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.elfeky.hamza.testevent.R;
import com.elfeky.hamza.testevent.ui.ticket.listviewtick.ListModelTick;

import java.util.ArrayList;

public class TicketViewModel extends ViewModel{

    public MutableLiveData<ArrayList<ListModelTick>> mTicket = new MutableLiveData<>();
    public MutableLiveData<ArrayList<ListModelTick>> mTicket2 = new MutableLiveData<>();


    public TicketViewModel() {

        mTicket.setValue(getTecket());
        mTicket2.setValue(getTecket2());
    }

    public ArrayList<ListModelTick> getTecket() {

        ArrayList<ListModelTick> arrayList = new ArrayList<>();

        arrayList.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));

        return arrayList;
    }

    public ArrayList<ListModelTick> getTecket2() {

        ArrayList<ListModelTick> arrayList2 = new ArrayList<>();

        arrayList2.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList2.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList2.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList2.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList2.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList2.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
        arrayList2.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList2.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList2.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList2.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList2.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList2.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList2.add(new ListModelTick(R.drawable.cairo,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList2.add(new ListModelTick(R.drawable.egypt,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));
//        arrayList.add(new ListModelTick(R.drawable.uae,"UI-UX Design Eventat 2020",
//                "September 30, 10:00 AM","Okaland IMAX Theater"));

        return arrayList2;
    }
}
