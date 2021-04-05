package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Model.Menu;
import com.example.myapplication.R;

import java.util.ArrayList;

public class MenuAdapter extends BaseAdapter {

    ArrayList<Menu> arrayListmenu;
    Context context;

    public MenuAdapter(ArrayList<Menu> arrayListmenu, Context context) {
        this.arrayListmenu = arrayListmenu;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayListmenu.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListmenu.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class ViewHolder{
        TextView txttenmenu;
        ImageView imgmenu;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if(view == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.dong_listview_menu,null);
            viewHolder.txttenmenu = view.findViewById(R.id.textviewmenu);
            viewHolder.imgmenu = view.findViewById(R.id.imageviewmenu);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
            Menu menu = (Menu) getItem(i);
            viewHolder.txttenmenu.setText(menu.getTenmenu());

        }
        return view;
    }
}
