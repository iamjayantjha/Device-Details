package com.jayantassignment.Oppo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jayantassignment.ProductAdapter;
import com.jayantassignment.ProductsData;
import com.jayantassignment.R;

public class OppoFragment extends Fragment {
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_oppo, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        ProductsData[] productsData = new ProductsData[]{
                new ProductsData("Oppo Reno 4 Pro", "CPH2083", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 8 MP + 2 MP + 2 MP", "Qualcomm SM8250 Snapdragon 865", "Adreno 650", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 4", "CPH2085", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 8 MP + 2 MP + 2 MP", "Qualcomm SM8250 Snapdragon 865", "Adreno 650", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 4 Pro 5G", "CPH2087", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 8 MP + 2 MP + 2 MP", "Qualcomm SM8250 Snapdragon 865", "Adreno 650", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 4 5G", "CPH2089", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 8 MP + 2 MP + 2 MP", "Qualcomm SM8250 Snapdragon 865", "Adreno 650", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 3 Pro", "CPH2033", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 3", "CPH2035", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 3 5G", "CPH2037", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 3 Pro 5G", "CPH2039", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 2", "CPH1907", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 2Z", "CPH1909", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 2F", "CPH1911", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 2 5G", "CPH1913", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno Ace", "CPH1917", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 10x Zoom", "CPH1919", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 10x Zoom 5G", "CPH1921", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 5G", "CPH1923", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Oppo Reno 5G", "CPH1925", "8 GB", "128 GB", "4025 mAh", "Android 10", "48 MP + 13 MP + 8 MP + 2 MP", "Qualcomm SM7125 Snapdragon 720G", "Adreno 618", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
        };
        ProductAdapter productsAdapter = new ProductAdapter(productsData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(productsAdapter);
        return view;
    }
}