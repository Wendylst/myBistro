package Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
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
    public TextView messageTV;
    public TextView starterTV;
    public TextView mainsTV;
    public TextView dessertsTV;
    public TextView drinksTV;
    public Button updateBtn;
    public Button deleteBtn;

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
        messageTV = itemView.findViewById(R.id.messageTV);
        starterTV = itemView.findViewById(R.id.startersTV);
        mainsTV = itemView.findViewById(R.id.mainsTV);
        dessertsTV = itemView.findViewById(R.id.dessertsTV);
        drinksTV = itemView.findViewById(R.id.drinksTV);
        updateBtn = itemView.findViewById(R.id.updateBT);
        deleteBtn = itemView.findViewById(R.id.deleteBT);
    }

}
