package com.codingprojects.mko.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> weekForecast = new ArrayList<>();
        weekForecast.add("Today Sunny 88/63");
        weekForecast.add("Today Sunny 48/23");
        weekForecast.add("Today Sunny 78/63");
        weekForecast.add("Today Sunny 78/53");
        weekForecast.add("Today Sunny 68/33");
        weekForecast.add("Today Sunny 88/43");
        weekForecast.add("Today Sunny 88/33");
        //getActivity returns this fragment's parent activity hence the context
        //R.layout.list_item_forecast is the ID of the list item layout
        //R.id.list_item_forecast_textview is the ID of the textview to populate.
        //forecast data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);
        return rootView;
    }
}
