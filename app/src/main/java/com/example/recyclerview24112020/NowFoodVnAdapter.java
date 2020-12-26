package com.example.recyclerview24112020;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class NowFoodVnAdapter {


    class NowFoodVnViewHolder extends RecyclerView.ViewHolder{

        ImageView imgStatus,imgNowFood;
        TextView txtName,txtAddress,txtDetailAddress,txtMinPrice,txtPrice,txtSaleOff,txtCategory;
        LinearLayout containerSaleOff;
        public NowFoodVnViewHolder(@NonNull View itemView) {
            super(itemView);
            imgStatus = itemView.findViewById(R.id.imageStatus);
            imgNowFood = itemView.findViewById(R.id.imageNowFood);
            txtName = itemView.findViewById(R.id.textViewName);
            txtAddress = itemView.findViewById(R.id.textViewAddress);
            txtDetailAddress = itemView.findViewById(R.id.textViewDetailAddress);
            txtMinPrice = itemView.findViewById(R.id.textViewMinPrice);
            txtPrice = itemView.findViewById(R.id.textViewPrice);
            txtSaleOff = itemView.findViewById(R.id.textViewSaleOff);
            txtCategory = itemView.findViewById(R.id.textViewCategory);
            containerSaleOff = itemView.findViewById(R.id.linearContainerSaleOff);
        }
    }
}
