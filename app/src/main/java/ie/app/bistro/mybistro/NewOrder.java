package ie.app.bistro.mybistro;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.michaelmuenzer.android.scrollablennumberpicker.ScrollableNumberPicker;
import com.michaelmuenzer.android.scrollablennumberpicker.ScrollableNumberPickerListener;

public class NewOrder extends AppCompatActivity {

    EditText editText;
    CheckBox mushCB,soupCB,wingsCB,beefCB,chickenCB,burgerCB,pizzaCB,sizzlerCB,cakeCB,pieCB,pancakeCB,cokeCB,waterCB;
    //ScrollableNumberPicker soupNP,wingsNP,beefNP,chickenNP,burgerNP,pizzaNP,sizzlerNP,cakeNP,pieNP,pancakeNP,cokeNP,waterNP;
    int mushNPInt,soupNPInt,wingsNPInt,beefNPInt,chickenNPInt,burgerNPInt,pizzaNPInt,sizzlerNPInt,cakeNPInt,pieNPInt,pancakeNPInt,cokeNPInt,waterNPInt =0;
    Button addMessage, addOrder;
    ScrollableNumberPicker mushNP,soupNP,wingsNP,beefNP,chickenNP,burgerNP,pizzaNP,sizzlerNP,cakeNP,pieNP,pancakeNP,cokeNP,waterNP = null;

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference().child("menu").child("order");

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


        soupNP.setMaxValue(20);
        soupNP.setMinValue(0);
        mushNP.setMaxValue(20);
        mushNP.setMinValue(0);

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

        //editText = findViewById(R.id.editText);
        //editText.setSelected(false);
        //editText.setImeOptions(EditorInfo.IME_ACTION_DONE);
        //myRef.setValue("Hello, world!");
        //myRef.child("2").setValue("Hello, earth!");

        //this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //AlertDialog.Builder alert = new AlertDialog.Builder(this);
        //mushNP.getValue();



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
        //mushNPO.getValue();
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference().child("menu4").child("one!");
        //mushNP = findViewById(R.id.mushNP);
        callAllNumberPickers();
        //myRef.setValue(mushNPO);
    }


//NUMBER PICKERS
    public void callAllNumberPickers(){
        Log.i("numberpicker","number pick2");

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRefNew = myRef.push();
        myRef.getRef().child("").setValue(mushNPInt);
        myRef.getRef().child("").setValue(soupNPInt);


        mushNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                mushNPInt = mushNP.getValue();
                Log.i("numberpicker",String.valueOf(mushNPInt));
                //myRef.setValue(value);
            }
        });
        soupNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                soupNPInt = soupNP.getValue();
                Log.i("numberpicker",String.valueOf(soupNPInt));
                //myRef.setValue(value);
            }
        });
        wingsNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                wingsNPInt = wingsNP.getValue();
                Log.i("numberpicker",String.valueOf(wingsNPInt));
                //myRef.setValue(value);
            }
        });
        beefNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                beefNPInt = beefNP.getValue();
                Log.i("numberpicker",String.valueOf(beefNPInt));
                //myRef.setValue(value);
            }
        });
        chickenNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                chickenNPInt = chickenNP.getValue();
                Log.i("numberpicker",String.valueOf(chickenNPInt));
                //myRef.setValue(value);
            }
        });
        burgerNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                burgerNPInt = burgerNP.getValue();
                Log.i("numberpicker",String.valueOf(burgerNPInt));
                //myRef.setValue(value);
            }
        });
        pizzaNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                pizzaNPInt = pizzaNP.getValue();
                Log.i("numberpicker",String.valueOf(pizzaNPInt));
                //myRef.setValue(value);
            }
        });
        sizzlerNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                sizzlerNPInt = sizzlerNP.getValue();
                Log.i("numberpicker",String.valueOf(sizzlerNPInt));
                //myRef.setValue(value);
            }
        });
        cakeNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                cakeNPInt = cakeNP.getValue();
                Log.i("numberpicker",String.valueOf(cakeNPInt));
                //myRef.setValue(value);
            }
        });
        pieNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                pieNPInt = pieNP.getValue();
                Log.i("numberpicker",String.valueOf(pieNPInt));
                //myRef.setValue(value);
            }
        });
        pancakeNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                pancakeNPInt = pancakeNP.getValue();
                Log.i("numberpicker",String.valueOf(pancakeNPInt));
                //myRef.setValue(value);
            }
        });
        cokeNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                cokeNPInt = cokeNP.getValue();
                Log.i("numberpicker",String.valueOf(cokeNPInt));
                //myRef.setValue(value);
            }
        });
        waterNP.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                waterNPInt = soupNP.getValue();
                Log.i("numberpicker",String.valueOf(waterNPInt));
                //myRef.setValue(value);
            }
        });


    }



}
