package ie.app.bistro.mybistro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import Adapters.OrdersViewAdapter;
import Models.ListItemMain;
import Models.NewOrderModel;

public class ViewOrders extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<NewOrderModel> orderItems;
    private int mushNP,soupNP,wingsNP,beefNP,chickenNP,burgerNP,pizzaNP,sizzlerNP,cakeNP,pieNP,pancakeNP,cokeNP,waterNP;

    DatabaseReference myDb = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);

        recyclerView = findViewById(R.id.ordersView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        orderItems = new ArrayList<>();
        NewOrderModel object = new NewOrderModel("New Order");
        //ListItemMain object1 = new ListItemMain("View Orders");
        orderItems.add(object);
        //listItems.add(object1);
        adapter = new OrdersViewAdapter(this, orderItems);
        recyclerView.setAdapter(adapter);
    }
}
