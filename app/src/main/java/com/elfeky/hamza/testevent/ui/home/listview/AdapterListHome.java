package com.elfeky.hamza.testevent.ui.home.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.elfeky.hamza.testevent.R;

import java.util.ArrayList;

public class AdapterListHome extends BaseAdapter {

    Context con;


    ArrayList<ListModelHome> listModels = new ArrayList<>();


    public AdapterListHome() {
    }

    public AdapterListHome(Context con, ArrayList<ListModelHome> listModels) {
        this.con = con;
        this.listModels = listModels;
    }

    @Override
    public int getCount() {
        return listModels.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView= LayoutInflater.from(con).inflate(R.layout.card_list_home,parent,false);

        ImageView imgBK  =convertView.findViewById(R.id.img_bk_LT);
        imgBK.setImageResource(listModels.get(position).getImg_back());
        TextView txtTitle =convertView.findViewById(R.id.text_title_LT);
        txtTitle.setText(listModels.get(position).getTitle());
        ImageView imgIC  =convertView.findViewById(R.id.img_icon_LT);
        imgIC.setImageResource(listModels.get(position).getImg_icon());
        ImageView imgFV  =convertView.findViewById(R.id.img_fav_LT);
        imgFV.setImageResource(listModels.get(position).getImg_fav());

        return convertView;
    }
}
