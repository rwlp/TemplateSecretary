package rwlp.templatescretary.views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.util.Objects;

import rwlp.templatescretary.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView;
        Toolbar toolbar;
        NavigationView navigationView;

        // Init of MainViewModel Instance

        // Set the observe to control screens in flNavHostFragment

        // Init and configuration of Toolbar, Navigation Drawer and Bottom Bar.
        // Observe that the actions in menu in Navigation Drawer have settings
        // in method onNavigationItemSelected of this class.

        drawerLayout = findViewById(R.id.dlDrawerMainActivity);
        navController = Navigation.findNavController(this, R.id.flNavHostFragmentMain);
        toolbar = findViewById(R.id.tbTopBarMainActivity);
        bottomNavigationView = findViewById(R.id.bnvBottomNavigationViewMainActivity);
        // Set the action for click in each button in bottom bar navigation.

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.bottomButtonHome ) {
                navController.navigate(R.id.homeFragment);
                return true;
            } else if (id == R.id.bottomButtoncContent ) {
                navController.navigate(R.id.contentFragment);
                return true;
            } else if (id == R.id.bottomButtonSendData) {
                navController.navigate(R.id.sendDataFragment);
                return true;
            } else if (id == R.id.bottomButtonDonate) {
                navController.navigate(R.id.donateFragment);
                return true;
            } else if (id == R.id.bottomButtonMore) {
                navController.navigate(R.id.moreMenuFragment);
                return true;
            }

            return false;
        });

        navigationView = findViewById(R.id.nvRightMenuMainActivity);
        navigationView.setNavigationItemSelectedListener(this);

        // Here we set the button menu in Toolbar to open the navigation Drawer
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Here are handle the navigation in Menu of Navigation Drawer Menu

        int id = item.getItemId();
        if (id == R.id.navDrawerButtonProfileSettings) {
            // TODO: function to set the navigation to the profile UI settings
            navController.navigate(R.id.sendDataFragment);
            drawerLayout.closeDrawer(GravityCompat.START); // Close the navigation drawer
            return true;
        }
        drawerLayout.closeDrawer(GravityCompat.START); // Close the navigation drawer
        return false;
    }
}