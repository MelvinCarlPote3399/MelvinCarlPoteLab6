package melvincarl.pote.n01483399.melvinlayout6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class PoteActivity6 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FirstFragment homeFragment = new FirstFragment();
    SecondFragment melvinFragment = new SecondFragment();
    ThirdFragment personFragment = new ThirdFragment();
    FourthFragment settingsFragment = new FourthFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,homeFragment).commit();
                        return true;
                    case R.id.melvin:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,melvinFragment).commit();
                        return true;
                    case R.id.person:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,personFragment).commit();
                        return true;
                    case R.id.settings:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,settingsFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }


}