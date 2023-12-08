package rwlp.templatescretary.viewmodels;

import androidx.lifecycle.LiveData;

import java.util.List;

import rwlp.templatescretary.repositories.Repository;
import rwlp.templatescretary.datamodels.HomeDataModel;

public class HomeViewModel {

    // Data for recycle View list in HomeFragment

    private Repository repository;
    private LiveData<List<HomeDataModel>> homeData;

    public HomeViewModel() {
        repository = new Repository();
        homeData = repository.getHomeData();
    }

    public LiveData<List<HomeDataModel>> getHomeData() {
        return homeData;
    }
}
