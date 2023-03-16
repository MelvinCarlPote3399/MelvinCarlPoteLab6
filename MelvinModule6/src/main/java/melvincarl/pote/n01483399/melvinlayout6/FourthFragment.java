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

public class FourthFragment extends Fragment {

    public FourthFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);
        TextView provincesView = view.findViewById(R.id.fourthFragment);

        getParentFragmentManager().setFragmentResultListener("requestResult", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                provincesView.setText(result.getString("selectPro"));
            }
        });

        //Bundle bundle = getArguments();

        return view;
    }
}