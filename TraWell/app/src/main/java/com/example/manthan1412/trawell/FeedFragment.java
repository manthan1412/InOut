package com.example.manthan1412.trawell;

import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Manthan1412 on 11-04-2015.
 */
public class FeedFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Parse.enableLocalDatastore(this);

        //Parse.initialize(this, "eEATgoc82MA0HW8Vx0fW18CKWwpFfod7bAwFNtQg", "Mo3zMcxShre7j8Glf4Oz9LGeSp02LbjwrKDsxoDk");


        View v = inflater.inflate(R.layout.feed_fragment, container, false);
        //Button button = (Button)v.findViewById(R.id.button);
        //button.setOnClickListener(this)
        return v;
    }
}

    /*@Override
    public void onClick(View v) {
        EditText edit = (EditText)v.findViewById(R.id.editText);
        String s = edit.getText().toString();
        ParseObject testObject = new ParseObject("FeedBack");
        testObject.put("feedback", s);
        testObject.saveInBackground();
    }*/