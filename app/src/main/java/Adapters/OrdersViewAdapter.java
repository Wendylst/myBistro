package Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import Models.ListItemMain;
import Models.NewOrderModel;
import ie.app.bistro.mybistro.R;

public class OrdersViewAdapter /*extends RecyclerView.Adapter<OrdersViewAdapter.ViewHolder>*/ {

    private List<NewOrderModel> orderItems;
    private Context context;

    public OrdersViewAdapter(List<NewOrderModel> orderItems, Context context) {
        this.orderItems = orderItems;
        this.context = context;
    }
/*
    @Override
    public OrdersViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent,false);
        return new OrdersViewAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdersViewAdapter.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return orderItems.size();
    }
*/


}
