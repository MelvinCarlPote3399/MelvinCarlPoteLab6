package melvincarl.pote.n01483399.melvinlayout6;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.*;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment #newInstance} factory method to
 * create an instance of this fragment.
 */

//the code for our second screen; should've been called MelvinFragment

public class SecondFragment extends Fragment {

    //declaring our radiogroup and radio buttons;
    //enabling a radiogroup will allow for only one button at a time to be pressed
    RadioGroup radioGroup;
    RadioButton button1;
    RadioButton button2;
    RadioButton button3;

    public SecondFragment() {
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        radioGroup = (RadioGroup)view.findViewById(R.id.ButtonGroup);
        button1 = (RadioButton)view.findViewById(R.id.Button1);
        button2 = (RadioButton)view.findViewById(R.id.Button2);
        button3 = (RadioButton)view.findViewById(R.id.Button3);

        //here, we set our event listeners for our 3 radio buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    //making the Alertdialog for a button is pressed
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setCancelable(false);
                    builder.setTitle(R.string.alert_title);
                    builder.setMessage(R.string.alert_button1);
                    builder.setIcon(R.drawable.nikeblue);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog alert = builder.create(); //create the alert
                    alert.show(); //alert is able to be shown
                }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(false);
                builder.setTitle(R.string.alert_title);
                builder.setMessage(R.string.alert_button2);
                builder.setIcon(R.drawable.nikeblue);
                builder.setPositiveButton(R.string.alert_ok_button, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(false);
                builder.setTitle(R.string.alert_title);
                builder.setMessage(R.string.alert_button3);
                builder.setIcon(R.drawable.nikeblue);
                builder.setPositiveButton(R.string.alert_ok_button, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });


        return view;
    }
}
