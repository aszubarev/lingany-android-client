package ru.tp.lingany.lingany;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anton on 22.03.18.
 */

public class ReflectionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> items;

    private static final int ITEM_REFLECTION_LANG = R.layout.item_reflection_lang;

    private static final int VIEW_TYPE_NONE = 1;
    private static final int VIEW_TYPE_ITEM = 2;

    public ReflectionAdapter(List<String> itemList) {
        items = itemList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("[adapter]", "onCreateViewHolder");

        Context context = parent.getContext();

        switch (viewType) {
            case VIEW_TYPE_ITEM:
                View titleView = LayoutInflater.from(context).inflate(ITEM_REFLECTION_LANG, parent, false);
                return new LanguageHolder(titleView);

            default:
                throw new IllegalArgumentException("invalid view type");
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.i("[adapter]", "omBindViewHolder");

        switch (getItemViewType(position)) {

            case VIEW_TYPE_ITEM:
                String item = items.get(position);
                Log.i("[adapter] item: ", item);
                ReflectionAdapter.LanguageHolder langHolder = ((ReflectionAdapter.LanguageHolder) holder);

                langHolder.textView.setText(item);
                break;

            default:
                throw new IllegalArgumentException("invalid view type");
        }
    }

    @Override
    public int getItemViewType(int position) {
        Log.i("[adapter]", "getItemViewType");
        return VIEW_TYPE_ITEM;

    }

    @Override
    public int getItemCount() {
        Log.i("[adapter]", "getItemCount");
        return items.size();
    }


    class LanguageHolder extends RecyclerView.ViewHolder {
        TextView textView;

        LanguageHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.reflection_item_id);
        }
    }
}