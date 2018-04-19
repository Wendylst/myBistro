package Adapters;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import Models.ListItemMain;
import ie.app.bistro.mybistro.MainActivity;
import ie.app.bistro.mybistro.NewOrder;
import ie.app.bistro.mybistro.R;
import ie.app.bistro.mybistro.SplashWelcome;
import ie.app.bistro.mybistro.ViewOrders;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<ListItemMain> listItems;
    private Context context;

    public RecyclerViewAdapter(Context context, List listitem){
        this.context = context;
        this.listItems = listitem;

    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        ListItemMain listItemMain = listItems.get(position);

        holder.textViewHead.setText(listItemMain.getHeading());
       // holder.textViewDescription.setText(listItemMain.getDescription());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView textViewHead;
        //public TextView textViewDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            //textViewDescription = (TextView) itemView.findViewById(R.id.textViewDes);
        }


    @Override
    public void onClick(View v) {
        int position = getAdapterPosition();
        ListItemMain item = listItems.get(position);

        switch (position) {

            case 0:
                Intent intent = new Intent(context, NewOrder.class);
                //Toast.makeText(context, "Create Order", Toast.LENGTH_SHORT).show();
                context.startActivity(intent);
                break;

            case 1:
                Intent intent2 = new Intent(context, ViewOrders.class);
                //Toast.makeText(context, "Tables", Toast.LENGTH_SHORT).show();
                context.startActivity(intent2);
                break;

            default:
                Intent intent6 = new Intent(context, SplashWelcome.class);
                Toast.makeText(context, "SPLASH!", Toast.LENGTH_SHORT).show();
                context.startActivity(intent6);
                break;
        }

    }
    }
}
