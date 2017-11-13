package com.atiscom.recyclerviewroomdatabase;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Mico on 11/13/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CarViewHolder> {

    List<CarModel> list;

    public RecyclerAdapter(List<CarModel> list) {
        this.list = list;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        CarViewHolder viewHolder = new CarViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        CarModel carModel = list.get(position);
        holder.txtName.setText(carModel.getCarName());
        holder.txtAge.setText(carModel.getCarAge());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CarViewHolder extends RecyclerView.ViewHolder{
        TextView txtName,txtAge;
        public CarViewHolder(View itemView) {
            super(itemView);

            txtName = (TextView)itemView.findViewById(R.id.txtName);
            txtAge = (TextView)itemView.findViewById(R.id.txtAge);

        }
    }

}
