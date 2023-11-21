package rwlp.templatescretary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Integer> selectedFragment = new MutableLiveData<>();

    public LiveData<Integer> getSelectedFragment() {
        return selectedFragment;
    }

    public void navigateToHome () {
        return;
    }
}
