package com.example.manthan1412.trawell;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Manthan1412 on 11-04-2015.
 */
public class LogFragment extends ListFragment {

    @Nullable
    String[] countries = new String[] {
            "Place1",
            "Place2",
            "Place3",
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1,countries);
        /** Setting the list adapter for the ListFragment */
        setListAdapter(adapter);

        // return super.onCreateView(inflater, container, savedInstanceState);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
