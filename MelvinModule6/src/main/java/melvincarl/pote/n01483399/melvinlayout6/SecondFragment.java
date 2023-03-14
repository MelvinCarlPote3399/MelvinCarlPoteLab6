package melvincarl.pote.n01483399.melvinlayout6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.*;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment #newInstance} factory method to
 * create an instance of this fragment.
 */


public class SecondFragment extends Fragment {

    public SecondFragment() {
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}