package com.hpdxay.xmly.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by hpd on 2016/1/22.
 */
//第三步：继承Adapter
public class BindingAdapter extends RecyclerView.Adapter<BindingAdapter.BingdingViewHolder> {

    private Map<Type, BindingTool> map;
    private List<Object> list;
    private Context context;

    //第四步：构造方法
    public BindingAdapter(Map<Type, BindingTool> map, List<Object> list, Context context) {
        this.map = map;
        this.list = list;
        this.context = context;
    }

    @Override
    public BingdingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), viewType, parent, false);
        return new BingdingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(BingdingViewHolder holder, int position) {
        Object o = list.get(position);
        int variableId = map.get(o.getClass()).variableId;
        holder.binding.setVariable(variableId, o);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //第五步
    public void add(Object o) {
        int size = list.size();
        list.add(o);
        notifyItemInserted(size);
    }

    public void addAll(Collection<?> collection) {
        int size = list.size();
        list.addAll(collection);
        notifyItemRangeInserted(size, collection.size());
    }


    //由于是多布局复用，要有这个方法
    @Override
    public int getItemViewType(int position) {
        return map.get(list.get(position).getClass()).layoutId;
    }

    //第二步，ViewHolder
    public static class BingdingViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding;

        public BingdingViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    //第一步
    //不同的数据需要展示在不同的View上，不同的View，又有不同的ViewID,用这类来记录
    public static class BindingTool {

        private int layoutId;
        private int variableId;

        public BindingTool(int layoutId, int variableId) {
            this.layoutId = layoutId;
            this.variableId = variableId;
        }
    }


}
