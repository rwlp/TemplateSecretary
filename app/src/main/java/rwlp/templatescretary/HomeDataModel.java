package rwlp.templatescretary;

import android.widget.ImageView;

public class HomeDataModel {

    private int imageOfItemInRecycleView;
    private String titleOfItemInRecycleView;
    private String subtitleInItemInRecycleView;

    public HomeDataModel(int imageOfItemInRecycleView, String titleOfItemInRecycleView, String subtitleInItemInRecycleView) {
        this.imageOfItemInRecycleView = imageOfItemInRecycleView;
        this.titleOfItemInRecycleView = titleOfItemInRecycleView;
        this.subtitleInItemInRecycleView = subtitleInItemInRecycleView;
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
