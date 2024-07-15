package com.phanit.postfreeapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.phanit.postfreeapp.R;

import java.util.List;

public class TagAdapter extends RecyclerView.Adapter<TagAdapter.TagViewHolder>{

    private List<String> tages;

    private Context context;

    public TagAdapter(List<String> tages, Context context) {
        this.tages = tages;
        this.context = context;
    }

    @NonNull
    @Override
    public TagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tag_post_card_item_layout,null,false);

        return new TagViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TagViewHolder holder, int position) {
        String title = tages.get(position);
        if(!title.isEmpty()){
            holder.title.setText(title);
        }
    }

    @Override
    public int getItemCount() {
        return tages.size();
    }

    public static class TagViewHolder extends RecyclerView.ViewHolder{

        private TextView title;

        public TagViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tvTagTitle);
        }
    }
}
