package rwlp.templatescretary.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import rwlp.templatescretary.R;
import rwlp.templatescretary.datamodels.HomeDataModel;

public class AdapterRecycleViewOfHomeFragment extends RecyclerView.Adapter<AdapterRecycleViewOfHomeFragment.HomeViewHolderForRecyclerView> {

    private List<HomeDataModel> homeDataModelList;
    private final Context context;

    public AdapterRecycleViewOfHomeFragment (Context context) {
        this.context = context;
    }

    public void setHomeData(List<HomeDataModel> homeDataModelList) {
        this.homeDataModelList = homeDataModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterRecycleViewOfHomeFragment.HomeViewHolderForRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layoute_of_recycle_view_in_home_fragment, parent, false);
        return new AdapterRecycleViewOfHomeFragment.HomeViewHolderForRecyclerView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycleViewOfHomeFragment.HomeViewHolderForRecyclerView holder, int position) {

        int adjustedPosition = position % homeDataModelList.size();
        holder.title.setText(homeDataModelList.get(adjustedPosition).getTitleOfItemInRecycleView());
        holder.imageView.setImageResource(homeDataModelList.get(adjustedPosition).getImageOfPrincipalView());
        holder.subtitle.setText(homeDataModelList.get(adjustedPosition).getSubtitleInItemInRecycleView());
    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class HomeViewHolderForRecyclerView extends RecyclerView.ViewHolder {

        TextView title, subtitle;
        ImageView imageView;

        public HomeViewHolderForRecyclerView(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tv_title_item_recycle_view);
            subtitle = itemView.findViewById(R.id.tv_subtitle_item_recycle_view);
            imageView = itemView.findViewById(R.id.iv_item_recycle_view);

        }
    }
}
