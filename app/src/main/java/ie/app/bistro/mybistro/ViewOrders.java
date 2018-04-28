package ie.app.bistro.mybistro;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

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

int i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for ( i = 1; i > 2; i++) {
            finish();
            startActivity(getIntent());
        }
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


                if(model.getSoupNP()==0 && model.getWingsNP() == 0 && model.getMushNP() == 0){
                    viewHolder.starterTV.setVisibility(View.GONE);
                }


                if(model.getBeefNP()==0 && model.getChickenNP() == 0 && model.getPizzaNP() == 0 && model.getSizzlerNP() == 0&& model.getBurgerNP() == 0){
                    viewHolder.mainsTV.setVisibility(View.GONE);
                }

                if(model.getCakeNP()==0 && model.getPieNP() == 0 && model.getPancakeNP() == 0){
                    viewHolder.dessertsTV.setVisibility(View.GONE);
                }

                if(model.getCokeNP()==0 && model.getWaterNP() == 0){
                    viewHolder.drinksTV.setVisibility(View.GONE);
                }



                if (model.getBeefNP() == 0) {
                    viewHolder.beefTV.setVisibility(View.GONE);
                } else {
                    viewHolder.beefTV.setText("Roast Beef: " +" ( "+ model.getBeefNP()+" )");
                }
                if (model.getChickenNP() == 0) {
                    viewHolder.chickenTV.setVisibility(View.GONE);
                } else {
                    viewHolder.chickenTV.setText("Roast Chicken: " +" ( "+ model.getChickenNP()+" )");
                }



                if (model.getSoupNP() == 0) {
                    viewHolder.soupTV.setVisibility(View.GONE);
                } else {
                    viewHolder.soupTV.setText("Soup of the Day: " +" ( "+ model.getSoupNP()+" )");
                }
                if (model.getWingsNP() == 0) {
                    viewHolder.chickenWingsTV.setVisibility(View.GONE);
                } else {
                    viewHolder.chickenWingsTV.setText("BBQ Chicken Wings: " +" ( "+ model.getWingsNP()+" )");
                }

                if (model.getMushNP() == 0) {
                    viewHolder.mushTV.setVisibility(View.GONE);
                } else {
                    viewHolder.mushTV.setText("Garlic Mushrooms: " +" ( "+ model.getMushNP()+" )");
                }
                if (model.getBurgerNP() == 0) {
                    viewHolder.beefBurgerTV.setVisibility(View.GONE);
                } else {
                    viewHolder.beefBurgerTV.setText("8oz Beef Burger: " +" ( "+ model.getBurgerNP()+" )");
                }
                if (model.getPizzaNP() == 0) {
                    viewHolder.pizzaTV.setVisibility(View.GONE);
                } else {
                    viewHolder.pizzaTV.setText("Meat Feast Pizza: "+" ( " + model.getPizzaNP()+" )");
                }
                if (model.getMessage() == null) {
                    viewHolder.messageTV.setVisibility(View.GONE);
                } else {
                    viewHolder.messageTV.setText("Message: " + model.getMessage());
                }


                if (model.getSizzlerNP() == 0) {
                    viewHolder.chickenSizzlerTV.setVisibility(View.GONE);
                } else {
                    viewHolder.chickenSizzlerTV.setText("Chicken Sizzler: " +" ( "+ model.getSizzlerNP()+" )");
                }
                if (model.getCakeNP() == 0) {
                    viewHolder.cakeTV.setVisibility(View.GONE);
                } else {
                    viewHolder.cakeTV.setText("Chocolate Cake: " +" ( "+ model.getCakeNP()+" )");
                }
                if (model.getPieNP() == 0) {
                    viewHolder.pieTV.setVisibility(View.GONE);
                } else {
                    viewHolder.pieTV.setText("Hot Apple Pie: "+" ( "+ model.getPieNP()+" )");
                }
                if (model.getPancakeNP() == 0) {
                    viewHolder.pancakeTV.setVisibility(View.GONE);
                } else {
                    viewHolder.pancakeTV.setText("Pancake Pleasure: "+" ( " + model.getPancakeNP()+" )");
                }
                if (model.getWaterNP() == 0) {
                    viewHolder.waterTV.setVisibility(View.GONE);
                } else {
                    viewHolder.waterTV.setText("Water: "+" ( " + model.getWaterNP()+" )");
                }
                if (model.getCokeNP() == 0) {
                    viewHolder.cokeTV.setVisibility(View.GONE);
                } else {
                    viewHolder.cokeTV.setText("Coke: " +" ( "+ model.getCokeNP()+" )");
                }
                String myOrderID = model.getOrderID();


                viewHolder.updateBtn.setTag(myOrderID);
                viewHolder.updateBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent startNewActivity = new Intent(ViewOrders.this, NewOrder.class);
                        startNewActivity.putExtra("orderID",(String)v.getTag());
                        startActivity(startNewActivity);
                    }
                });

                viewHolder.deleteBtn.setTag(myOrderID);
                viewHolder.deleteBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder;
                        final String orderID = (String)v.getTag();
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            builder = new AlertDialog.Builder(ViewOrders.this, android.R.style.Theme_Material_Dialog_Alert);
                            //getWindow().setSoftInputMode(
                                   // WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE
                           // );
                        } else {
                            builder = new AlertDialog.Builder(ViewOrders.this);
                        }

                        builder.setTitle("Are you sure you want to delete this order?");

                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.out.println(orders);
                                orders.child(orderID).removeValue();
                            }
                        });

                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(ViewOrders.this, "Cancel", Toast.LENGTH_LONG).show();
                            }
                        });

                        builder.show();
                    }
                });


            }

        };


        recView.setAdapter(adapter);


    }


}
