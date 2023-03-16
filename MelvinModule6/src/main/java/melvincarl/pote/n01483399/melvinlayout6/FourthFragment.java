package melvincarl.pote.n01483399.melvinlayout6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FourthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

import java.io.*;


//the code for the fourth fragment; should've been called SettingsFragment

public class FourthFragment extends Fragment {

    public FourthFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);

        //creating our TextViews, for where the values, passed from the third fragment, will be stored into
        TextView provincesView = view.findViewById(R.id.fourthFragment);
        TextView orderItem = view.findViewById(R.id.secondTextView);

        //allows for the fragment to 'accept' the passed values
        getParentFragmentManager().setFragmentResultListener("requestResult", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                //values passed in will be stored into the TextViews on this fragment
                provincesView.setText(result.getString("selectPro"));
                int index = result.getInt("selectIndex");
                orderItem.setText(String.valueOf(index));
            }
        });

        //Bundle bundle = getArguments();

        return view;
    }
}