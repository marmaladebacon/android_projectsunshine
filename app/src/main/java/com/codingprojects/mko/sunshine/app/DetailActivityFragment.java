package com.codingprojects.mko.sunshine.app;

import android.content.Intent;
import android.os.Debug;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_settings){
            Intent settingsIntent = new Intent(getActivity().getApplication(), SettingsActivity.class);
            startActivity(settingsIntent);
            Log.i(this.getClass().getSimpleName(), "Starting settings");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent intent = getActivity().getIntent();
        View rootView =  inflater.inflate(R.layout.fragment_detail, container, false);
        TextView t = (TextView)rootView.findViewById(R.id.titleText);
        t.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        return rootView;
    }


}
