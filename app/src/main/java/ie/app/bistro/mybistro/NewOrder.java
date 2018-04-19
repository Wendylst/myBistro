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
    ScrollableNumberPicker soupNP,wingsNP,beefNP,chickenNP,burgerNP,pizzaNP,sizzlerNP,cakeNP,pieNP,pancakeNP,cokeNP,waterNP;
    int whatever =0;
    Button addMessage, addOrder;
    ScrollableNumberPicker mushNPO = null;

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference().child("menu4").child("one!");

        mushNPO = findViewById(R.id.mushNP);
        mushNPO.setMaxValue(20);
        mushNPO.setMinValue(0);

        mushCB = findViewById(R.id.mushCB);

        mushCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mushCB.isChecked()){
                    mushNPO.setValue(1);
                }
                else{
                    mushNPO.setValue(0);
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
        myRef.getRef().child("").setValue(whatever);

        mushNPO.setListener(new ScrollableNumberPickerListener() {
            @Override

            public void onNumberPicked(int value) {
                whatever = mushNPO.getValue();
                Log.i("numberpicker",String.valueOf(whatever));
                //myRef.setValue(value);
            }
        });
    }



}
