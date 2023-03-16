package melvincarl.pote.n01483399.melvinlayout6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThirdFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

import java.io.*;

public class ThirdFragment<provinces_and_territories> extends Fragment {

    private ListView listView;

    public ThirdFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        listView = view.findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.provinces_and_territories));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                listView.setSelector(android.R.color.holo_blue_dark);

                Bundle bundle = new Bundle();

                String selected = adapterView.getItemAtPosition(position).toString();

                String province = getResources().getStringArray(R.array.provinces_and_territories)[position];

                bundle.putString("selectitem",selected);
                bundle.putString("selectPro",province);
                getParentFragmentManager().setFragmentResult("requestResult",bundle);
                /*
                FourthFragment fragObject = new FourthFragment();
                fragObject.setArguments(bundle);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerView2,fragObject);
                fragmentTransaction.commit();
                */

            }
        });


        return view;
    }
}