package ie.app.bistro.mybistro;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.michaelmuenzer.android.scrollablennumberpicker.ScrollableNumberPicker;
import com.michaelmuenzer.android.scrollablennumberpicker.ScrollableNumberPickerListener;

import java.util.UUID;

import Models.NewOrderModel;

public class NewOrder extends AppCompatActivity {

    EditText editText;
    CheckBox mushCB,soupCB,wingsCB,beefCB,chickenCB,burgerCB,pizzaCB,sizzlerCB,cakeCB,pieCB,pancakeCB,cokeCB,waterCB;
    String message;
    int mushNPInt,soupNPInt,wingsNPInt,beefNPInt,chickenNPInt,burgerNPInt,pizzaNPInt,sizzlerNPInt,cakeNPInt,pieNPInt,pancakeNPInt,cokeNPInt,waterNPInt =0;
    Button addMessage, addOrder;
    ScrollableNumberPicker mushNP,soupNP,wingsNP,beefNP,chickenNP,burgerNP,pizzaNP,sizzlerNP,cakeNP,pieNP,pancakeNP,cokeNP,waterNP = null;

    Button btnOpenDialog;
    TextView textInfo;
    FirebaseDatabase database;
    DatabaseReference myRef;
    String ID;
    String orderID; //= UUID.randomUUID().toString();
    NewOrderModel dataToSave = new NewOrderModel();
    DatabaseReference myRefNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        if (getIntent().hasExtra("orderID")) {
            ID = getIntent().getExtras().getString("orderID");
            orderID = ID;
        }

        mushNP = findViewById(R.id.mushNP);
        soupNP = findViewById(R.id.soupNP);
        wingsNP = findViewById(R.id.wingsNP);
        beefNP  = findViewById(R.id.beefNP);
        chickenNP = findViewById(R.id.chickenNP);
        burgerNP = findViewById(R.id.burgerNP);
        pizzaNP = findViewById(R.id.pizzaNP);
        sizzlerNP = findViewById(R.id.sizzlerNP);
        cakeNP = findViewById(R.id.cakeNP);
        pieNP = findViewById(R.id.pieNP);
        pancakeNP = findViewById(R.id.pancakeNP);
        cokeNP = findViewById(R.id.cokeNP);
        waterNP = findViewById(R.id.waterNP);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference().child("My Bistro").child("Orders");
        if (ID != null && !ID.equalsIgnoreCase("")) {
            myRefNew = myRef.child(ID);
            myRefNew.addListenerForSingleValueEvent(
                    new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            dataToSave = dataSnapshot.getValue(NewOrderModel.class);
                            int garlic = dataToSave.getMushNP();
                            if (garlic > 0) {
                                mushCB.setChecked(true);
                                mushNP.setValue(garlic);
                            }
                            int soup = dataToSave.getSoupNP();
                            if (soup > 0) {
                                soupCB.setChecked(true);
                                soupNP.setValue(soup);
                            }
                            int wings = dataToSave.getWingsNP();
                            if (wings > 0) {
                                wingsCB.setChecked(true);
                                wingsNP.setValue(wings);
                            }
                            int rbeef = dataToSave.getBeefNP();
                            if (rbeef > 0) {
                                beefCB.setChecked(true);
                                beefNP.setValue(rbeef);
                            }
                            int rChicken = dataToSave.getChickenNP();
                            if (rChicken > 0) {
                                chickenCB.setChecked(true);
                                chickenNP.setValue(rChicken);
                            }
                            int burger = dataToSave.getBurgerNP();
                            if (burger > 0) {
                                burgerCB.setChecked(true);
                                burgerNP.setValue(burger);
                            }
                            int pizza = dataToSave.getPizzaNP();
                            if (pizza > 0) {
                                pizzaCB.setChecked(true);
                                pizzaNP.setValue(pizza);
                            }
                            int sizzler = dataToSave.getSizzlerNP();
                            if (sizzler > 0) {
                                sizzlerCB.setChecked(true);
                                sizzlerNP.setValue(sizzler);
                            }
                            int cake = dataToSave.getCakeNP();
                            if (cake > 0) {
                                cakeCB.setChecked(true);
                                cakeNP.setValue(cake);
                            }
                            int pie = dataToSave.getPieNP();
                            if (pie > 0) {
                                pieCB.setChecked(true);
                                pieNP.setValue(pie);
                            }
                            int pancake = dataToSave.getPancakeNP();
                            if (pancake > 0) {
                                pancakeCB.setChecked(true);
                                pancakeNP.setValue(pancake);
                            }
                            int coke = dataToSave.getCokeNP();
                            if (coke > 0) {
                                cokeCB.setChecked(true);
                                cokeNP.setValue(coke);
                            }
                            int water = dataToSave.getWaterNP();
                            if (water > 0) {
                                waterCB.setChecked(true);
                                waterNP.setValue(water);
                            }

                            String message = dataToSave.getMessage();
                            if (message != null) {
                            }
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
        } else {
            myRefNew = myRef.push();
        }

        dataToSave.setOrderID(myRefNew.getKey());
        myRefNew.getRef().setValue(dataToSave);



        soupNP.setMaxValue(20);
        soupNP.setMinValue(0);
        mushNP.setMaxValue(20);
        mushNP.setMinValue(0);
        wingsNP.setMinValue(0);
        wingsNP.setMaxValue(20);
        beefNP.setMinValue(0);
        beefNP.setMaxValue(20);
        chickenNP.setMinValue(0);
        chickenNP.setMaxValue(20);
        burgerNP.setMinValue(0);
        burgerNP.setMaxValue(20);
        pizzaNP.setMinValue(0);
        pizzaNP.setMaxValue(20);
        sizzlerNP.setMinValue(0);
        sizzlerNP.setMaxValue(20);
        cakeNP.setMinValue(0);
        cakeNP.setMaxValue(20);
        pieNP.setMinValue(0);
        pieNP.setMaxValue(20);
        pancakeNP.setMinValue(0);
        pancakeNP.setMaxValue(20);
        cokeNP.setMinValue(0);
        cokeNP.setMaxValue(20);
        waterNP.setMinValue(0);
        waterNP.setMaxValue(20);


        mushCB = findViewById(R.id.mushCB);
        soupCB = findViewById(R.id.soupCB);
        wingsCB = findViewById(R.id.wingsCB);
        beefCB  = findViewById(R.id.beefCB);
        chickenCB = findViewById(R.id.chickenCB);
        burgerCB = findViewById(R.id.burgerCB);
        pizzaCB = findViewById(R.id.pizzaCB);
        sizzlerCB = findViewById(R.id.sizzlerCB);
        cakeCB = findViewById(R.id.cakeCB);
        pieCB = findViewById(R.id.pieCB);
        pancakeCB = findViewById(R.id.pancakeCB);
        cokeCB = findViewById(R.id.cokeCB);
        waterCB = findViewById(R.id.waterCB);
        callAllNumberPickers();

        btnOpenDialog = (Button)findViewById(R.id.addMessage);
        textInfo = (TextView)findViewById(R.id.info);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });



        mushCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mushCB.isChecked()){
                    mushNP.setValue(1);
                }
                else{
                    mushNP.setValue(0);
                }
            }
        });

        soupCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (soupCB.isChecked()){
                    soupNP.setValue(1);
                }
                else{
                    soupNP.setValue(0);
                }
            }
        });
        wingsCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wingsCB.isChecked()){
                    wingsNP.setValue(1);
                }
                else{
                    wingsNP.setValue(0);
                }
            }
        });
        beefCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (beefCB.isChecked()){
                    beefNP.setValue(1);
                }
                else{
                    beefNP.setValue(0);
                }
            }
        });
        chickenCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chickenCB.isChecked()){
                    chickenNP.setValue(1);
                }
                else{
                    chickenNP.setValue(0);
                }
            }
        });
        burgerCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (burgerCB.isChecked()){
                    burgerNP.setValue(1);
                }
                else{
                    burgerNP.setValue(0);
                }
            }
        });
        pizzaCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pizzaCB.isChecked()){
                    pizzaNP.setValue(1);
                }
                else{
                    pizzaNP.setValue(0);
                }
            }
        });
        sizzlerCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sizzlerCB.isChecked()){
                    sizzlerNP.setValue(1);
                }
                else{
                    sizzlerNP.setValue(0);
                }
            }
        });
        cakeCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cakeCB.isChecked()){
                    cakeNP.setValue(1);
                }
                else{
                    cakeNP.setValue(0);
                }
            }
        });
        pieCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pieCB.isChecked()){
                    pieNP.setValue(1);
                }
                else{
                    pieNP.setValue(0);
                }
            }
        });
        pancakeCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pancakeCB.isChecked()){
                    pancakeNP.setValue(1);
                }
                else{
                    pancakeNP.setValue(0);
                }
            }
        });
        cokeCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cokeCB.isChecked()){
                    cokeNP.setValue(1);
                }
                else{
                    cokeNP.setValue(0);
                }
            }
        });
        waterCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (waterCB.isChecked()){
                    waterNP.setValue(1);
                }
                else{
                    waterNP.setValue(0);
                }

            }
        });




    }

    private void openDialog(){

        LayoutInflater inflater = LayoutInflater.from(NewOrder.this);
        View subView = inflater.inflate(R.layout.dialog_box, null);
        final EditText subEditText = (EditText)subView.findViewById(R.id.dialogEditText);
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(NewOrder.this, android.R.style.Theme_Material_Dialog_Alert);
            getWindow().setSoftInputMode(
                    WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE
            );
        } else {
            builder = new AlertDialog.Builder(NewOrder.this);
        }

        builder.setTitle("Message:");
        builder.setView(subView);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                message = subEditText.getText().toString();
                dataToSave.setMessage(message);
                myRefNew.getRef().setValue(dataToSave);
                getWindow().setSoftInputMode(
                        WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
                );


            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(NewOrder.this, "Cancel", Toast.LENGTH_LONG).show();
            }
        });

        builder.show();
    }


    public void clearAll(View view){

        waterNP.setValue(0);
        if(waterCB.isChecked()){
            waterCB.toggle();
        }

        mushNP.setValue(0);
        if(mushCB.isChecked()){
            mushCB.toggle();
        }

        soupNP.setValue(0);
        if(soupCB.isChecked()){
            soupCB.toggle();
        }

        wingsNP.setValue(0);
        if(wingsCB.isChecked()){
            wingsCB.toggle();
        }

        beefNP.setValue(0);
        if(beefCB.isChecked()){
            beefCB.toggle();
        }

        chickenNP.setValue(0);
        if(chickenCB.isChecked()){
            chickenCB.toggle();
        }

        burgerNP.setValue(0);
        if(burgerCB.isChecked()){
            burgerCB.toggle();
        }

        pizzaNP.setValue(0);
        if(pizzaCB.isChecked()){
            pizzaCB.toggle();
        }

        sizzlerNP.setValue(0);
        if(sizzlerCB.isChecked()){
            sizzlerCB.toggle();
        }
        cakeNP.setValue(0);
        if(cakeCB.isChecked()){
            cakeCB.toggle();
        }
        pieNP.setValue(0);
        if(pieCB.isChecked()){
            pieCB.toggle();
        }
        pancakeNP.setValue(0);
        if(pancakeCB.isChecked()){
            pancakeCB.toggle();
        }
        cokeNP.setValue(0);
        if(cokeCB.isChecked()){
            cokeCB.toggle();
        }
        waterNP.setValue(0);
        if(waterCB.isChecked()){
            waterCB.toggle();
        }
    }


    public void addOrder(View view)
    {
        /*LayoutInflater inflater = LayoutInflater.from(NewOrder.this);
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(NewOrder.this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(NewOrder.this);
        }

        builder.setTitle("Confirm Order");


        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Order Created.", Toast.LENGTH_SHORT).show();
                finish();


            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(NewOrder.this, "Cancel", Toast.LENGTH_LONG).show();
            }
        });

        builder.show();
*/      Intent startNewActivity = new Intent(this,ViewOrders.class);
        startActivity(startNewActivity);
        Toast.makeText(getApplicationContext(),"Order Created.", Toast.LENGTH_SHORT).show();
        finish();
    }


    //NUMBER PICKERS
    public void callAllNumberPickers(){
        Log.i("numberpicker","number pick2");
        ID = this.orderID;

        //openDialog();

        mushNP.setListener(new ScrollableNumberPickerListener() {

            @Override

            public void onNumberPicked(int value) {
                mushNPInt = mushNP.getValue();

                Log.i("numberpicker", String.valueOf(mushNPInt));
                String mushNPO = String.valueOf(mushNPInt);
                if(mushNPO.equalsIgnoreCase("0")){
                    mushCB.setChecked(false);
                }else{
                    mushCB.setChecked(true);
                }

                dataToSave.setMushNP(mushNPInt);
                myRefNew.getRef().setValue(dataToSave);
            }
        });
        soupNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                soupNPInt = soupNP.getValue();
                Log.i("numberpicker",String.valueOf(soupNPInt));
                String soupNPO = String.valueOf(soupNPInt);
                if(soupNPO.equalsIgnoreCase("0")){
                    soupCB.setChecked(false);
                }else{
                    soupCB.setChecked(true);
                }
                dataToSave.setSoupNP(soupNPInt);
                myRefNew.getRef().setValue(dataToSave);

            }
        });
        wingsNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                wingsNPInt = wingsNP.getValue();
                Log.i("numberpicker",String.valueOf(wingsNPInt));
                String wingsNPO = String.valueOf(wingsNPInt);
                if(wingsNPO.equalsIgnoreCase("0")){
                    wingsCB.setChecked(false);
                }else{
                    wingsCB.setChecked(true);
                }

                dataToSave.setWingsNP(wingsNPInt);
                myRefNew.getRef().setValue(dataToSave);

            }
        });
        beefNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                beefNPInt = beefNP.getValue();
                Log.i("numberpicker",String.valueOf(beefNPInt));
                String beefNPO = String.valueOf(beefNPInt);
                if(beefNPO.equalsIgnoreCase("0")){
                    beefCB.setChecked(false);
                }else{
                    beefCB.setChecked(true);
                }
                dataToSave.setBeefNP(beefNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });
        chickenNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                chickenNPInt = chickenNP.getValue();
                Log.i("numberpicker",String.valueOf(chickenNPInt));
                String chickenNPO = String.valueOf(chickenNPInt);
                if(chickenNPO.equalsIgnoreCase("0")){
                    chickenCB.setChecked(false);
                }else{
                    chickenCB.setChecked(true);
                }
                dataToSave.setChickenNP(chickenNPInt);
                myRefNew.getRef().setValue(dataToSave);
            }
        });
        burgerNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                burgerNPInt = burgerNP.getValue();
                Log.i("numberpicker",String.valueOf(burgerNPInt));
                String burgerNPO = String.valueOf(burgerNPInt);
                if(burgerNPO.equalsIgnoreCase("0")){
                    burgerCB.setChecked(false);
                }else{
                    burgerCB.setChecked(true);
                }

                dataToSave.setBurgerNP(burgerNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });
        pizzaNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                pizzaNPInt = pizzaNP.getValue();
                Log.i("numberpicker",String.valueOf(pizzaNPInt));
                String pizzaNPO = String.valueOf(pizzaNPInt);
                if(pizzaNPO.equalsIgnoreCase("0")){
                    pizzaCB.setChecked(false);
                }else{
                    pizzaCB.setChecked(true);
                }

                dataToSave.setPizzaNP(pizzaNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });
        sizzlerNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                sizzlerNPInt = sizzlerNP.getValue();
                Log.i("numberpicker",String.valueOf(sizzlerNPInt));
                String sizzlerNPO = String.valueOf(sizzlerNPInt);
                if(sizzlerNPO.equalsIgnoreCase("0")){
                    sizzlerCB.setChecked(false);
                }else{
                    sizzlerCB.setChecked(true);
                }

                dataToSave.setSizzlerNP(sizzlerNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });
        cakeNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                cakeNPInt = cakeNP.getValue();
                Log.i("numberpicker",String.valueOf(cakeNPInt));
                String cakeNPO = String.valueOf(cakeNPInt);
                if(cakeNPO.equalsIgnoreCase("0")){
                    cakeCB.setChecked(false);
                }else{
                    cakeCB.setChecked(true);
                }

                dataToSave.setCakeNP(cakeNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });
        pieNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                pieNPInt = pieNP.getValue();
                Log.i("numberpicker",String.valueOf(pieNPInt));
                String pieNPO = String.valueOf(pieNPInt);
                if(pieNPO.equalsIgnoreCase("0")){
                    pieCB.setChecked(false);
                }else{
                    pieCB.setChecked(true);
                }

                dataToSave.setPieNP(pieNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });
        pancakeNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                pancakeNPInt = pancakeNP.getValue();
                Log.i("numberpicker",String.valueOf(pancakeNPInt));
                String pancakeNPO = String.valueOf(pancakeNPInt);
                if(pancakeNPO.equalsIgnoreCase("0")){
                    pancakeCB.setChecked(false);
                }else{
                    pancakeCB.setChecked(true);
                }

                dataToSave.setPancakeNP(pancakeNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });
        cokeNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                cokeNPInt = cokeNP.getValue();
                Log.i("numberpicker",String.valueOf(cokeNPInt));
                String cokeNPO = String.valueOf(cokeNPInt);
                if(cokeNPO.equalsIgnoreCase("0")){
                    cokeCB.setChecked(false);
                }else{
                    cokeCB.setChecked(true);
                }

                dataToSave.setCokeNP(cokeNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });
        waterNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                waterNPInt = waterNP.getValue();
                Log.i("numberpicker",String.valueOf(waterNPInt));
                String waterNPO = String.valueOf(waterNPInt);
                if(waterNPO.equalsIgnoreCase("0")){
                    waterCB.setChecked(false);
                }else{
                    waterCB.setChecked(true);
                }

                dataToSave.setWaterNP(waterNPInt);

                myRefNew.getRef().setValue(dataToSave);

            }
        });


    }


    public void clearEverything(){
        waterNP.setValue(0);
        if(waterCB.isChecked()){
            waterCB.toggle();
        }

        mushNP.setValue(0);
        if(mushCB.isChecked()){
            mushCB.toggle();
        }

        soupNP.setValue(0);
        if(soupCB.isChecked()){
            soupCB.toggle();
        }

        wingsNP.setValue(0);
        if(wingsCB.isChecked()){
            wingsCB.toggle();
        }

        beefNP.setValue(0);
        if(beefCB.isChecked()){
            beefCB.toggle();
        }

        chickenNP.setValue(0);
        if(chickenCB.isChecked()){
            chickenCB.toggle();
        }

        burgerNP.setValue(0);
        if(burgerCB.isChecked()){
            burgerCB.toggle();
        }

        pizzaNP.setValue(0);
        if(pizzaCB.isChecked()){
            pizzaCB.toggle();
        }

        sizzlerNP.setValue(0);
        if(sizzlerCB.isChecked()){
            sizzlerCB.toggle();
        }
        cakeNP.setValue(0);
        if(cakeCB.isChecked()){
            cakeCB.toggle();
        }
        pieNP.setValue(0);
        if(pieCB.isChecked()){
            pieCB.toggle();
        }
        pancakeNP.setValue(0);
        if(pancakeCB.isChecked()){
            pancakeCB.toggle();
        }
        cokeNP.setValue(0);
        if(cokeCB.isChecked()){
            cokeCB.toggle();
        }
        waterNP.setValue(0);
        if(waterCB.isChecked()){
            waterCB.toggle();
        }
    }


}


