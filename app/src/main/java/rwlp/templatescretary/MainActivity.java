package rwlp.templatescretary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import androidx.activity.OnBackPressedCallback;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.ViewModelProvider;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private  MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        // Observe changes in the MainViewModel. TODO: Update dependencies for NavController
//        mainViewModel.getSelectedFragment().observe(this, fragmentId -> {
//            // Use Navigation Component to navigate to the selected fragment
//            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//            navController.navigate(fragmentId);
//        });
        // Set the toolbar as the action bar

        toolbar = findViewById(R.id.tbTopBarMainActivity);
        drawerLayout = findViewById(R.id.dlDrawerMainActivity);
        bottomNavigationView = findViewById(R.id.bnvBottomNavigationViewMainActivity);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                // switch menu
                return false;
            }
        });
        navigationView = findViewById(R.id.nvRightMenuMainActivity);
        navigationView.setNavigationItemSelectedListener(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation item clicks here
        // You can open new activities, fragments, etc., based on the selected item
        int id = item.getItemId();


        drawerLayout.closeDrawer(GravityCompat.START); // Close the navigation drawer
        return true;
    }
}