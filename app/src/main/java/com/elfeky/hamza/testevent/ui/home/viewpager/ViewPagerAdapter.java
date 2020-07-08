package com.elfeky.hamza.testevent.ui.home.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.elfeky.hamza.testevent.R;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter
{

    private Context context;
    private LayoutInflater layoutInflater;
     ArrayList<ViewPagerModel> viewPagerList = new ArrayList<>();

    public ViewPagerAdapter() {
    }

    public ViewPagerAdapter(Context context, ArrayList<ViewPagerModel> viewPagerList) {
        this.context = context;
        this.viewPagerList = viewPagerList;
    }

    @Override
    public int getCount() {
        return viewPagerList.size();
        //return title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        //layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View view = layoutInflater.inflate(R.layout.card_viewpager_home,null);
        View view = LayoutInflater.from(context).inflate(R.layout.card_viewpager_home,container,false);

        ImageView img_main = view.findViewById(R.id.imag_card_vp1);
        img_main.setImageResource(viewPagerList.get(position).getImage_page());


        TextView text_t_vp = view.findViewById(R.id.text_title_vp1);
        text_t_vp.setText(viewPagerList.get(position).getTitle());

        TextView text_d_vp = view.findViewById(R.id.text_date_vp1);
        text_d_vp.setText(viewPagerList.get(position).getDate());


        ImageView img_fav = view.findViewById(R.id.imag_fav_vp1);
        img_fav.setImageResource(viewPagerList.get(position).getImage_fav());
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);

//        ViewPager vp = (ViewPager)container;
//        View view = (View) object;
//        vp.removeView(view);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }
}
