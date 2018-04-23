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

public class ViewOrders extends AppCompatActivity/*implements View.OnClickListener*/ {

    private static final String TAG = "View Orders Activity";
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recView;

    FirebaseDatabase database;
    DatabaseReference orders;

    FirebaseRecyclerAdapter<NewOrderModel, OrdersViewHolder> adapter;

    //private FirebaseDatabase database;
    //private DatabaseReference myRef;

    //private List<NewOrderModel> listItems;

    //DatabaseReference myDb = FirebaseDatabase.getInstance().getReference();

    //FirebaseRecyclerAdapter<NewOrderModel, OrdersViewAdapter> adapterSomething;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);
        //listItems = new ArrayList<>();

        recView = findViewById(R.id.ordersView);
        recView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);

        database = FirebaseDatabase.getInstance();
//        orders = database.getReference("My Bistro");
        DatabaseReference myRef = database.getReference();
        orders = myRef.child("My Bistro").child("Orders");

//        orders = orders.child("Orders");

//        Toast.makeText(this, ""  + orders.toString(), Toast.LENGTH_SHORT).show();

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
                    viewHolder.beefTV.setText("Beef " + model.getBeefNP());
                }
                if (model.getChickenNP() == 0) {
                    viewHolder.chickenTV.setVisibility(View.GONE);
                } else {
                    viewHolder.chickenTV.setText("Roast Chicken " + model.getChickenNP());
                }
                if (model.getSoupNP() == 0) {
                    viewHolder.soupTV.setVisibility(View.GONE);
                } else {
                    viewHolder.soupTV.setText("Soup " + model.getSoupNP());
                }
                if (model.getBurgerNP() == 0) {
                    viewHolder.beefBurgerTV.setVisibility(View.GONE);
                } else {
                    viewHolder.beefBurgerTV.setText("Beef Burger " + model.getBurgerNP());
                }
                if (model.getPizzaNP() == 0) {
                    viewHolder.pizzaTV.setVisibility(View.GONE);
                } else {
                    viewHolder.pizzaTV.setText("Pizza " + model.getPizzaNP());
                }

            }
        };

        recView.setAdapter(adapter);
    }
}
