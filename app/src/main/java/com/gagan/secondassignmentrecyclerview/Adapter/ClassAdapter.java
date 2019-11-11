package com.gagan.secondassignmentrecyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gagan.secondassignmentrecyclerview.Activity.SecondActivity;
import com.gagan.secondassignmentrecyclerview.Model.ClassModelPresident;
import com.gagan.secondassignmentrecyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ViewHolder>{

    Context context;
    List<ClassModelPresident> modelList;

    public ClassAdapter(Context context, List<ClassModelPresident> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout, parent, false);

        return new ViewHolder(view, context, modelList);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ClassModelPresident president = modelList.get(position);
        holder.txtName.setText(president.getName());
        holder.imgPresident.setImageResource(president.getImgId());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        CircleImageView imgPresident;
        TextView txtName;
        Context context;
        List<ClassModelPresident> list;

        public ViewHolder(@NonNull View itemView, Context context, List<ClassModelPresident> list) {
            super(itemView);
            imgPresident = itemView.findViewById(R.id.presidentImage);
            txtName = itemView.findViewById(R.id.presidentName);
            itemView.setOnClickListener(this);
            this.context = context;
            this.list = list;
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, SecondActivity.class);
            ClassModelPresident model;
            model = list.get(getAdapterPosition());
            intent.putExtra("image", model.getImgId());
            intent.putExtra("name", model.getName());
            intent.putExtra("detail", model.getDetail());
            context.startActivity(intent);
        }
    }
}
