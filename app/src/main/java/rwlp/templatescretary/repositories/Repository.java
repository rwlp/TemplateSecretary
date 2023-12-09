package rwlp.templatescretary.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import rwlp.templatescretary.R;
import rwlp.templatescretary.datamodels.HomeDataModel;

public class Repository {




    public LiveData<List<HomeDataModel>>  getHomeData() {
        /* Here we use to connect the external or internal data base

         * private MyDataBase myDataBase;
         * public Repository() {
         *   yourDatabase = YourDatabase.getInstance();
         *}
         */

        // We are using fake data, could use resources, sqlite, etc. in this case are simple arrays with random data
        String[] titles = {"Aviso", "Envento", "Artigo"};
        String[] subtitles = {"Agenda Semanal", "Congresso Juventude", "A arca da Aliança"};
        int[] imageIds = {R.drawable.image_recycle_view, R.drawable.image_recycle_view, R.drawable.image_recycle_view};

        MutableLiveData<List<HomeDataModel>> homeData = new MutableLiveData<>();

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
