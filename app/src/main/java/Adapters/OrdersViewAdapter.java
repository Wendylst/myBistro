package Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ValueEventListener;

import java.util.List;

import Models.ListItemMain;
import Models.NewOrderModel;
import ie.app.bistro.mybistro.R;
import ie.app.bistro.mybistro.ViewOrders;

public class OrdersViewAdapter extends RecyclerView.Adapter<OrdersViewAdapter.ViewHolder> {

    private List<NewOrderModel> orderItems;
    private Context context;

    public OrdersViewAdapter(ValueEventListener context, List<NewOrderModel> orderItems) {
        this.orderItems = orderItems;
        this.context = (Context) context;
    }

    @Override
    public OrdersViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(OrdersViewAdapter.ViewHolder holder, int position) {
        NewOrderModel listItemMain = orderItems.get(position);

        holder.textViewHead.setText(listItemMain.getHeading());
        holder.starterMush.setText(listItemMain.getMushNP());
    }

    @Override
    public int getItemCount() {
        return orderItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView starterMush;
        public TextView textViewHead;
        //public TextView textViewDescription;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.textViewStart);
            starterMush = (TextView) itemView.findViewById(R.id.starterMush);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

        }
    }
}