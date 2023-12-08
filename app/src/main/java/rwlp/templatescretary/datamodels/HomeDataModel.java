package rwlp.templatescretary.datamodels;

import android.widget.ImageView;

public class HomeDataModel {

    private int imageOfItemInRecycleView;
    private int imageOfPrincipalView;
    private String titleOfItemInRecycleView;
    private String subtitleInItemInRecycleView;



    public int getImageOfPrincipalView() {
        return imageOfPrincipalView;
    }

    public void setImageOfPrincipalView() {
        this.imageOfPrincipalView = imageOfPrincipalView;
    }

    public int getImageOfItemInRecycleView() {
        return imageOfItemInRecycleView;
    }

    public void setImageOfItemInRecycleView(int imageOfItemInRecycleView) {
        this.imageOfItemInRecycleView = imageOfItemInRecycleView;
    }

    public String getTitleOfItemInRecycleView() {
        return titleOfItemInRecycleView;
    }

    public void setTitleOfItemInRecycleView(String titleOfItemInRecycleView) {
        this.titleOfItemInRecycleView = titleOfItemInRecycleView;
    }

    public String getSubtitleInItemInRecycleView() {
        return subtitleInItemInRecycleView;
    }

    public void setSubtitleInItemInRecycleView(String subtitleInItemInRecycleView) {
        this.subtitleInItemInRecycleView = subtitleInItemInRecycleView;
    }
}
