package rwlp.templatescretary;

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

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init of MainViewModel Instance
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        // Set the observe to control screens in flNavHostFragment
        mainViewModel.getSelectedFragment().observe(this, fragmentId -> {
            // Use Navigation Component to navigate to the selected fragment
            NavController navController = Navigation.findNavController(this, R.id.flNavHostFragmentMain);
            navController.navigate(fragmentId);
        });

        // Init and configuration of Toolbar, Navigation Drawer and Bottom Bar.
        // Observe that the actions in menu in Navigation Drawer have settings
        // in method onNavigationItemSelected of this class.

        toolbar = findViewById(R.id.tbTopBarMainActivity);
        drawerLayout = findViewById(R.id.dlDrawerMainActivity);
        bottomNavigationView = findViewById(R.id.bnvBottomNavigationViewMainActivity);
        // Set the action for click in each button in bottom bar navigation.

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.bottomButtonHome ) {
                mainViewModel.navigateToHome();
                return true;
            } else if (id == R.id.bottomButtoncContent ) {
                mainViewModel.navigateToContent();
                return true;
            } else if (id == R.id.bottomButtonSendData) {
                mainViewModel.navigateToRegister();
                return true;
            } else if (id == R.id.bottomButtonDonate) {
                mainViewModel.navigateToDonate();
                return true;
            } else if (id == R.id.bottomButtonMore) {
                mainViewModel.navigateToMoreMenu();
                return true;
            }

            return false;
        });

        navigationView = findViewById(R.id.nvRightMenuMainActivity);
        navigationView.setNavigationItemSelectedListener(this);

        // Here we set the button menu in Toolbar to open the navigation Drawer
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Here are handle the navigation in Menu of Navigations Drawer Menu

        int id = item.getItemId();
        if (id == R.id.navDrawerButtonProfileSettings) {
            // TODO: function to set the navigation to the profile UI settings
            mainViewModel.navigateToRegister();
            return true;
        }
        drawerLayout.closeDrawer(GravityCompat.START); // Close the navigation drawer
        return false;
    }
}