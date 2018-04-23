package Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ie.app.bistro.mybistro.R;

public class OrdersViewHolder extends RecyclerView.ViewHolder {

    public TextView mushTV;
    public TextView soupTV;
    public TextView chickenWingsTV;
    public TextView beefTV;
    public TextView chickenTV;
    public TextView beefBurgerTV;
    public TextView pizzaTV;
    public TextView chickenSizzlerTV;
    public TextView cakeTV;
    public TextView pieTV;
    public TextView pancakeTV;
    public TextView cokeTV;
    public TextView waterTV;


    public OrdersViewHolder(View itemView) {
        super(itemView);
        mushTV = itemView.findViewById(R.id.mushTV);
        soupTV = itemView.findViewById(R.id.soupTV);
        chickenWingsTV = itemView.findViewById(R.id.chickenWingsTV);
        beefTV = itemView.findViewById(R.id.beefTV);
        chickenTV = itemView.findViewById(R.id.chickenTV);
        beefBurgerTV = itemView.findViewById(R.id.beefBurgerTV);
        pizzaTV = itemView.findViewById(R.id.pizzaTV);
        chickenSizzlerTV = itemView.findViewById(R.id.chickenSizzlerTV);
        cakeTV = itemView.findViewById(R.id.cakeTV);
        pieTV = itemView.findViewById(R.id.pieTV);
        pancakeTV = itemView.findViewById(R.id.pancakeTV);
        cokeTV = itemView.findViewById(R.id.cokeTV);
        waterTV = itemView.findViewById(R.id.waterTV);





    }


}


























//private List<NewOrderModel> orderItems;

//public TextView test;
// private Context context;

// public OrdersViewHolder(ValueEventListener context, List<NewOrderModel> orderItems) {
//     super();
//    this.orderItems = orderItems;
//     this.context = (Context) context;
// }
























//    @Override
//    public OrdersViewHolder.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.order_list, parent, false);
//        return new ViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(OrdersViewHolder.ViewHolder holder, int position) {
//        NewOrderModel listItemMain = orderItems.get(position);
//
//        holder.textViewHead.setText(listItemMain.getHeading());
//        holder.starterMush.setText(listItemMain.getMushNP());
//    }
//
//    @Override
//    public int getItemCount() {
//        return orderItems.size();
//    }
//
//
//    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//        public TextView starterMush;
//        public TextView textViewHead;
//        //public TextView textViewDescription;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//
//            textViewHead = (TextView) itemView.findViewById(R.id.textViewStart);
//            starterMush = (TextView) itemView.findViewById(R.id.starterMush);
//
//            itemView.setOnClickListener(this);
//        }
//
//
//        @Override
//        public void onClick(View v) {
//
//        }
//    }
//}