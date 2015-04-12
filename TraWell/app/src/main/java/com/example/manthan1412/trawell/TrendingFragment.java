package com.example.manthan1412.trawell;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Manthan1412 on 11-04-2015.
 */
public class TrendingFragment extends ListFragment {

    @Nullable
    String[] countries = new String[] {
            "Surat-JammuKashmir-Surat\n6days-5nights\nRs.28000/per",
            "Surat-Uttarakhand-Surat\n5days-4nights\nRs.20000/per",
            "Surat-Rajsthan-Surat\n7days-6nights\nRs.15000/per",
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View v = inflater.inflate(R.layout.hotel_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1,countries);
        /** Setting the list adapter for the ListFragment */
        setListAdapter(adapter);

        // return super.onCreateView(inflater, container, savedInstanceState);
        return super.onCreateView(inflater, container, savedInstanceState);
        //return v;
    }
}
