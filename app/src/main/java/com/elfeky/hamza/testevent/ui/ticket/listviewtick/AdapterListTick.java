package com.elfeky.hamza.testevent.ui.ticket.listviewtick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elfeky.hamza.testevent.R;
import com.elfeky.hamza.testevent.ui.category.listview.ListModelCateg;

import java.util.ArrayList;

public class AdapterListTick extends RecyclerView.Adapter<AdapterListTick.TicketViewHolder> {

    ArrayList<ListModelTick> listModels = new ArrayList<>();

    @NonNull
    @Override
    public AdapterListTick.TicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TicketViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list_ticket, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListTick.TicketViewHolder holder, int position) {

        holder.imgTK.setImageResource(listModels.get(position).getTick_img());
        holder.txtTitleTK.setText(listModels.get(position).getTick_title());
        holder.dateTK.setText(listModels.get(position).getTick_date());
        holder.adrTK.setText(listModels.get(position).getTick_adress());

    }

    @Override
    public int getItemCount() {
        return listModels.size();
    }

    public void setList(ArrayList<ListModelTick> arrayList){

        this.listModels = arrayList;
        notifyDataSetChanged();
    }

    public class TicketViewHolder extends RecyclerView.ViewHolder {

        ImageView imgTK;
        TextView txtTitleTK, dateTK, adrTK;
        public TicketViewHolder(@NonNull View itemView) {
            super(itemView);

            imgTK  = itemView.findViewById(R.id.img_tick);
            txtTitleTK = itemView.findViewById(R.id.title_tick);
            dateTK = itemView.findViewById(R.id.date_tick);
            adrTK = itemView.findViewById(R.id.adr_tick);
        }
    }
}

// convertView= LayoutInflater.from(con).inflate(R.layout.card_list_ticket,parent,false);
//
//         ImageView imgTK  =convertView.findViewById(R.id.img_tick);
//         imgTK.setImageResource(listModels.get(position).getTick_img());
//         TextView txtTitleTK =convertView.findViewById(R.id.title_tick);
//         txtTitleTK.setText(listModels.get(position).getTick_title());
//         TextView dateTK =convertView.findViewById(R.id.date_tick);
//         dateTK.setText(listModels.get(position).getTick_date());
//         TextView adrTK =convertView.findViewById(R.id.adr_tick);
//         adrTK.setText(listModels.get(position).getTick_adress());
