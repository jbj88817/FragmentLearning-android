package com.bojie.fragmentlearn;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by bojiejiang on 4/1/15.
 */
public class FragmentB extends Fragment {

    TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTextView = (TextView) getActivity().findViewById(R.id.textView);

    }

    public void changeData(int position) {
        if (isAdded()) {
            Resources resources = getResources();
            String[] descriptions = resources.getStringArray(R.array.descriptions);
            mTextView.setText(descriptions[position]);
        }
    }
}
