package rwlp.templatescretary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<Integer> selectedFragment = new MutableLiveData<>();

    public LiveData<Integer> getSelectedFragment() {
        return selectedFragment;
    }

    public void navigateToHome() {
         selectedFragment.setValue(R.id.homeFragment);
    }

    public void navigateToContent() {
         selectedFragment.setValue(R.id.otherFragment);
    }

    public void navigateToRegister() {
        // selectedFragment.setValue(R.id.) TODO: Make the fragment Register
    }

    public void navigateToDonate() {
        // TODO: Make the fragment Donate
    }

    public void navigateToMoreMenu() {
        // TODO: Make the fragment More Menu
    }

}
