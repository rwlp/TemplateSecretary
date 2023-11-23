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
         selectedFragment.setValue(R.id.contentFragment);
    }

    public void navigateToRegister() {
        selectedFragment.setValue(R.id.sendDataFragment);
    }

    public void navigateToDonate() {
        selectedFragment.setValue(R.id.donateFragment);
    }

    public void navigateToMoreMenu() {
        selectedFragment.setValue(R.id.moreMenuFragment);
    }

}
