package com.hpdxay.xmly.fragments;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hpdxay.xmly.BR;
import com.hpdxay.xmly.R;
import com.hpdxay.xmly.adapters.BindingAdapter;
import com.hpdxay.xmly.databinding.FragmentHomeBinding;
import com.hpdxay.xmly.entitis.EditorRecommendAlbumsEntity;
import com.hpdxay.xmly.entitis.HomeEntity;
import com.hpdxay.xmly.utils.NetworkUtil;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements Callback<HomeEntity> {


    private BindingAdapter adapter;
  

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HashMap<Type, BindingAdapter.BindingTool> map = new HashMap<>();
        //注册这个布局
        map.put(EditorRecommendAlbumsEntity.class, new BindingAdapter.BindingTool(R.layout.recommend_item, BR.editorRecommendAlbums));
        adapter = new BindingAdapter(map, new ArrayList<>(), getContext());
        NetworkUtil.getService().getHome().enqueue(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        binding.homeRecycler.setAdapter(adapter);
        return binding.getRoot();
    }


    @Override
    public void onResponse(Response<HomeEntity> response) {
        HomeEntity body = response.body();
        adapter.add(body.getEditorRecommendAlbums());
        //adapter.add(body.getHotRecommends().getList());
    }

    @Override
    public void onFailure(Throwable t) {

    }
}
