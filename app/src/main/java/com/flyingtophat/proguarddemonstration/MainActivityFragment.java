package com.flyingtophat.proguarddemonstration;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivityFragment extends Fragment {

    private RandomNameGenerator mNameGenerator;

    public MainActivityFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Resources res = getResources();

        mNameGenerator = new RandomNameGenerator(
            res.getStringArray(R.array.first_names),
            res.getStringArray(R.array.last_names));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        
        String name = getString(R.string.name_placement, mNameGenerator.getName());

        TextView textView = (TextView) view.findViewById(R.id.name);
        textView.setText(name);
        
        return view;
    }
}
