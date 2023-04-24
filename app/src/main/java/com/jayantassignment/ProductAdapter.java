package com.jayantassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>{

    ProductsData[] productsData;

    public ProductAdapter(ProductsData[] productsData) {
        this.productsData = productsData;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.card_item, parent, false);
        ProductViewHolder viewHolder = new ProductViewHolder(listItem);
        parent.getContext();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.manufacturer.setText("Manufacturer: "+productsData[position].getManufacturer());
        holder.modelName.setText("Model Name: "+productsData[position].getModelName());
        holder.modelNumber.setText("Model Number: "+productsData[position].getModelNumber());
        holder.ram.setText("Ram: "+productsData[position].getRam());
        holder.storage.setText("Storage: "+productsData[position].getStorage());
        holder.battery.setText("Battery: "+productsData[position].getBattery());
        holder.androidVersion.setText("Android Version: "+productsData[position].getAndroidVersion());
        holder.camera.setText("Camera: "+productsData[position].getCamera());
        holder.processor.setText("Processor: "+productsData[position].getProcessor());
        holder.gpu.setText("GPU: "+productsData[position].getGpu());
        holder.sensor.setText("Sensor: "+productsData[position].getSensor());
        holder.imei.setText("IMEI: "+productsData[position].getImei());

    }

    @Override
    public int getItemCount() {
        return productsData.length;
    }
}
