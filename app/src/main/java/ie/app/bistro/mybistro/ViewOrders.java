package ie.app.bistro.mybistro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import Adapters.OrdersViewHolder;
import Models.NewOrderModel;

public class ViewOrders extends AppCompatActivity{

    private static final String TAG = "View Orders Activity";
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recView;

    FirebaseDatabase database;
    DatabaseReference orders;

    FirebaseRecyclerAdapter<NewOrderModel, OrdersViewHolder> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);
        recView = findViewById(R.id.ordersView);
        recView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);

        database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        orders = myRef.child("My Bistro").child("Orders");
        loadOrders();
    }

    public void loadOrders(){
        adapter = new FirebaseRecyclerAdapter<NewOrderModel,
                OrdersViewHolder>(NewOrderModel.class, R.layout.order_list, OrdersViewHolder.class,
                orders) {

            @Override
            protected void populateViewHolder(OrdersViewHolder viewHolder, NewOrderModel model, int position) {

                if (model.getBeefNP() == 0) {
                    viewHolder.beefTV.setVisibility(View.GONE);
                } else {
                    viewHolder.beefTV.setText("[M]  Roast Beef: " +"- ("+ model.getBeefNP()+")");
                }
                if (model.getChickenNP() == 0) {
                    viewHolder.chickenTV.setVisibility(View.GONE);
                } else {
                    viewHolder.chickenTV.setText("[M]  Roast Chicken: " +"- ("+ model.getChickenNP()+")");
                }


                if (model.getSoupNP() == 0) {
                    viewHolder.soupTV.setVisibility(View.GONE);
                } else {
                    viewHolder.soupTV.setText("[S]   Soup of the Day: " +"- ("+ model.getSoupNP()+")");
                }
                if (model.getWingsNP() == 0) {
                    viewHolder.chickenWingsTV.setVisibility(View.GONE);
                } else {
                    viewHolder.chickenWingsTV.setText("[S]   BBQ Chicken Wings: " +"- ("+ model.getWingsNP()+")");
                }

                if (model.getMushNP() == 0) {
                    viewHolder.mushTV.setVisibility(View.GONE);
                } else {
                    viewHolder.mushTV.setText("[S]   Garlic Mushrooms: " +"- ("+ model.getMushNP()+")");
                }
                if (model.getBurgerNP() == 0) {
                    viewHolder.beefBurgerTV.setVisibility(View.GONE);
                } else {
                    viewHolder.beefBurgerTV.setText("[M]  8oz Beef Burger: " +"- ("+ model.getBurgerNP()+")");
                }
                if (model.getPizzaNP() == 0) {
                    viewHolder.pizzaTV.setVisibility(View.GONE);
                } else {
                    viewHolder.pizzaTV.setText("[M]  Meat Feast Pizza: "+"- (" + model.getPizzaNP()+")");
                }
                if (model.getMessage() == null) {
                    viewHolder.messageTV.setVisibility(View.GONE);
                } else {
                    viewHolder.messageTV.setText("Message: " + model.getMessage());
                }


                if (model.getSizzlerNP() == 0) {
                    viewHolder.chickenSizzlerTV.setVisibility(View.GONE);
                } else {
                    viewHolder.chickenSizzlerTV.setText("[M]  Chicken Sizzler: " +"- ("+ model.getSizzlerNP()+")");
                }
                if (model.getCakeNP() == 0) {
                    viewHolder.cakeTV.setVisibility(View.GONE);
                } else {
                    viewHolder.cakeTV.setText("[D]   Chocolate Cake: " +"- ("+ model.getCakeNP()+")");
                }
                if (model.getPieNP() == 0) {
                    viewHolder.pieTV.setVisibility(View.GONE);
                } else {
                    viewHolder.pieTV.setText("[D]   Hot Apple Pie: "+"- ("+ model.getPieNP()+")");
                }
                if (model.getPancakeNP() == 0) {
                    viewHolder.pancakeTV.setVisibility(View.GONE);
                } else {
                    viewHolder.pancakeTV.setText("[D]   Pancake Pleasure: "+"- (" + model.getPancakeNP()+")");
                }
                if (model.getWaterNP() == 0) {
                    viewHolder.waterTV.setVisibility(View.GONE);
                } else {
                    viewHolder.waterTV.setText("Water: "+"- (" + model.getWaterNP()+")");
                }
                if (model.getCokeNP() == 0) {
                    viewHolder.cokeTV.setVisibility(View.GONE);
                } else {
                    viewHolder.cokeTV.setText("Coke: " +"- ("+ model.getCokeNP()+")");
                }

            }
        };

        recView.setAdapter(adapter);
    }
}
