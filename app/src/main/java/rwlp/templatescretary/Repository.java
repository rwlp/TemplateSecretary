package rwlp.templatescretary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class Repository {


    /* // Here we use to connect the external or internal data base
    // of the application

    private MyDataBase myDataBase;

    public Repository() {
        yourDatabase = YourDatabase.getInstance();
    }
    */

    // This method is used to get all data to home Fragment.
    // Todo: data for home fragment
    //  this method need to return a LiveData<List<HomeDataModel>> object
    public LiveData<List<HomeDataModel>>  getHomeData() {
        // fake data
        String[] titles = {"Aviso", "Envento", "Artigo"};
        String[] subtitles = {"Agenda Semanal", "Congresso Juventude", "A arca da Aliança"};
        int[] imageIds = {R.drawable.image_recycle_view, R.drawable.image_recycle_view, R.drawable.image_recycle_view};

        MutableLiveData<List<HomeDataModel>> homeData = new MutableLiveData<>();

        // Create a list to hold simulated data
        List<HomeDataModel> simulatedData = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            HomeDataModel dataModel = new HomeDataModel();
            dataModel.setTitleOfItemInRecycleView(titles[i]);
            dataModel.setSubtitleInItemInRecycleView(subtitles[i]);
            dataModel.setImageOfItemInRecycleView(imageIds[i]);
            simulatedData.add(dataModel);
        }

        homeData.setValue(simulatedData);

        return homeData;

    }
}
