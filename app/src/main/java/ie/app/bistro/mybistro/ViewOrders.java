package ie.app.bistro.mybistro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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

                   /* Button button = (Button) findViewById(R.id.deleteAll);
                    button.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            //orders.child(childKey).removeValue();
                        }
                    });

                    new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            for (DataSnapshot child : dataSnapshot.getChildren()) {
                                String childKey = child.getKey();
                                orders.child(childKey).removeValue();
                                //child.getKey();
                            }
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {
                            System.out.println("The read failed: " + databaseError.getCode());
                        }
                    };

                /*for( DataSnapshot child : orders.getChildren() ) {
                    String childKey = child.getKey();

                }*/

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



                }

        };


        recView.setAdapter(adapter);


    }


}
