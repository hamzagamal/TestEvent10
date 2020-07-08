package com.elfeky.hamza.testevent.ui.ticket.listviewtick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elfeky.hamza.testevent.R;

import java.util.ArrayList;

public class AdapterListTicket2 extends RecyclerView.Adapter<AdapterListTicket2.TecketViewHolder2> {

    ArrayList<ListModelTick> listModels2 = new ArrayList<>();
    @NonNull
    @Override
    public AdapterListTicket2.TecketViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TecketViewHolder2(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_list_ticket, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListTicket2.TecketViewHolder2 holder, int position) {

        holder.imgTK.setImageResource(listModels2.get(position).getTick_img());
        holder.txtTitleTK.setText(listModels2.get(position).getTick_title());
        holder.dateTK.setText(listModels2.get(position).getTick_date());
        holder.adrTK.setText(listModels2.get(position).getTick_adress());
    }

    @Override
    public int getItemCount() {
        return listModels2.size();
    }

    public void setList2(ArrayList<ListModelTick> arrayList){

        this.listModels2 = arrayList;
        notifyDataSetChanged();
    }

    public class TecketViewHolder2 extends RecyclerView.ViewHolder {
        ImageView imgTK;
        TextView txtTitleTK, dateTK, adrTK;
        public TecketViewHolder2(@NonNull View itemView) {
            super(itemView);
            imgTK  = itemView.findViewById(R.id.img_tick);
            txtTitleTK = itemView.findViewById(R.id.title_tick);
            dateTK = itemView.findViewById(R.id.date_tick);
            adrTK = itemView.findViewById(R.id.adr_tick);
        }
    }
}
