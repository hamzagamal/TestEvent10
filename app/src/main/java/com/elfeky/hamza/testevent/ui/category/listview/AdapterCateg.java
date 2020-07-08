package com.elfeky.hamza.testevent.ui.category.listview;

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
import java.util.ArrayList;

public class AdapterCateg extends RecyclerView.Adapter<AdapterCateg.CatedViewHolder> {

    ArrayList<ListModelCateg> listModels = new ArrayList<>();

    @NonNull
    @Override
    public AdapterCateg.CatedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CatedViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list_home
                ,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCateg.CatedViewHolder holder, int position) {


        holder.imgBK.setImageResource(listModels.get(position).getImg_back());
        holder.txtTitle.setText(listModels.get(position).getTitle());
        holder.imgIC.setImageResource(listModels.get(position).getImg_icon());
        holder.imgFV.setImageResource(listModels.get(position).getImg_fav());
    }

    @Override
    public int getItemCount() {
        return listModels.size();
    }

    public void setListCat(ArrayList<ListModelCateg> arrayList){

        this.listModels = arrayList;
        notifyDataSetChanged();
    }

    public class CatedViewHolder extends RecyclerView.ViewHolder {

        ImageView imgBK ,imgIC ,imgFV;
        TextView txtTitle ;
        public CatedViewHolder(@NonNull View itemView) {
            super(itemView);

                 imgBK  =itemView.findViewById(R.id.img_bk_LT);
                 txtTitle =itemView.findViewById(R.id.text_title_LT);
                 imgIC  =itemView.findViewById(R.id.img_icon_LT);
                 imgFV  =itemView.findViewById(R.id.img_fav_LT);

        }
    }
}

 //   ArrayList<ListModelCateg> listModels = new ArrayList<>();
//    ImageView imgBK  =convertView.findViewById(R.id.img_bk_LT);
//        imgBK.setImageResource(listModels.get(position).getImg_back());
//                TextView txtTitle =convertView.findViewById(R.id.text_title_LT);
//                txtTitle.setText(listModels.get(position).getTitle());
//                ImageView imgIC  =convertView.findViewById(R.id.img_icon_LT);
//                imgIC.setImageResource(listModels.get(position).getImg_icon());
//                ImageView imgFV  =convertView.findViewById(R.id.img_fav_LT);
//                imgFV.setImageResource(listModels.get(position).getImg_fav());
