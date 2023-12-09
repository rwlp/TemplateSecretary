package rwlp.templatescretary.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rwlp.templatescretary.R;
import rwlp.templatescretary.viewmodels.HomeViewModel;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rvHomeFragment);
        HomeViewModel homeViewModel = new HomeViewModel();
        AdapterRecycleViewOfHomeFragment adapterRecycleViewOfHomeFragment  = new AdapterRecycleViewOfHomeFragment(getContext());

        recyclerView.setAdapter(adapterRecycleViewOfHomeFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        homeViewModel.getHomeData().observe(getViewLifecycleOwner(), adapterRecycleViewOfHomeFragment::setHomeData);

        return view;
    }
}