package com.jayantassignment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder{

    TextView  manufacturer, modelName, modelNumber, ram, storage, battery, androidVersion, camera, processor, gpu, sensor, imei;
    View view;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        manufacturer = itemView.findViewById(R.id.manufacturer);
        modelName = itemView.findViewById(R.id.modelName);
        modelNumber = itemView.findViewById(R.id.modelNumber);
        ram = itemView.findViewById(R.id.ram);
        storage = itemView.findViewById(R.id.storage);
        battery = itemView.findViewById(R.id.battery);
        androidVersion = itemView.findViewById(R.id.androidVersion);
        camera = itemView.findViewById(R.id.camera);
        processor = itemView.findViewById(R.id.processor);
        gpu = itemView.findViewById(R.id.gpu);
        sensor = itemView.findViewById(R.id.sensor);
        imei = itemView.findViewById(R.id.imei);
        view = itemView;
    }
}
