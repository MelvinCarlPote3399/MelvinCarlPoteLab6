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


//the code for the third fragment (and part of the fourth);
//the file should've been called PersonFragment
public class ThirdFragment<provinces_and_territories> extends Fragment {

    //declaring our listview, consisting of the names of the provinces
    private ListView listView;

    public ThirdFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        listView = view.findViewById(R.id.listView1);

        //obtains the array we declared in our strings array file (strings.xml)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.provinces_and_territories));
        listView.setAdapter(adapter);

        //event listener for when items on the list are clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                //when item is selected, this color will appear
                listView.setSelector(android.R.color.holo_blue_dark);

                //declaring a bundle will allow us to carry our values over to the next screen
                Bundle bundle = new Bundle();

                //grab the item that is selected
                String selected = adapterView.getItemAtPosition(position).toString();

                //grab and obtain the respective value from the array of the item selected
                String province = getResources().getStringArray(R.array.provinces_and_territories)[position];

                bundle.putString("selectitem",selected);
                bundle.putString("selectPro",province);
                bundle.putInt("selectIndex",position+1);

                //takes our key value pairs that we created, enabling it be passed on to the next fragment
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