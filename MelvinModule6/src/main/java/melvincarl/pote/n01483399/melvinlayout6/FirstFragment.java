package melvincarl.pote.n01483399.melvinlayout6;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import java.io.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment #newInstance} factory method to
 * create an instance of this fragment.
 */


public class FirstFragment extends Fragment {
    ImageButton imageButton;
    int counter = 0;
    //Context context = getApplicationContext();
    ProgressBar simpleProgressBar;
    int progress = 0;

    public FirstFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        simpleProgressBar = (ProgressBar)view.findViewById(R.id.progressBar);
        setProgressValue(progress);
        imageButton = (ImageButton)view.findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setProgressValue(progress);

                if (counter == 0){
                    counter++;
                    Toast.makeText(getContext(), getString(R.string.toast_text) + String.valueOf(counter),Toast.LENGTH_LONG).show();
                }

                else if (counter == 1){
                    counter++;
                    Toast.makeText(getContext(), getString(R.string.toast_text) + String.valueOf(counter),Toast.LENGTH_LONG).show();

                }

                else if (counter == 2){
                    counter++;
                    Toast.makeText(getContext(), getString(R.string.toast_text) + String.valueOf(counter),Toast.LENGTH_LONG).show();

                }
                else if(counter == 3){
                    counter++;
                    Toast.makeText(getContext(), getString(R.string.toast_text) + String.valueOf(counter),Toast.LENGTH_LONG).show();

                }
                else if(counter == 4){
                    counter++;
                    Toast.makeText(getContext(), getString(R.string.toast_text) + String.valueOf(counter),Toast.LENGTH_LONG).show();
                    simpleProgressBar.setVisibility(View.INVISIBLE);
                }
                else if(counter == 5){
                    counter++;
                    Toast.makeText(getContext(), getString(R.string.toast_text) + String.valueOf(counter),Toast.LENGTH_LONG).show();
                }
                else if (counter == 6){
                    counter++;
                    Toast.makeText(getContext(), getString(R.string.toast_text) + String.valueOf(counter),Toast.LENGTH_LONG).show();
                }
                else if (counter == 7){
                    counter++;
                    Toast.makeText(getContext(), getString(R.string.toast_text) + String.valueOf(counter),Toast.LENGTH_LONG).show();
                }
                else if (counter == 8){
                    System.exit(0);
                }
            }
        });

        // Inflate the layout for this fragment
        return view;

    }

    //progress bar; obtained via the link provided
    private void setProgressValue(int progress) {
        // set the progress
        simpleProgressBar.setProgress(progress);
        // thread is used to change the progress value
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setProgressValue(progress + 10);
            }
        });
        thread.start();
    }


}

