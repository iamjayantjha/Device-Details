package com.jayantassignment.Samsung;

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

public class SamsungFragment extends Fragment {
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_samsung, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        ProductsData[] productsData = new ProductsData[]{
                new ProductsData("Galaxy M31", "SM-M315FZKINS", "6 GB", "128 GB", "6000 mAh", "Android 10", "64 MP + 8 MP + 5 MP + 5 MP", "Exynos 9611", "Mali-G72 MP3", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy M21", "SM-M215FZKINS", "4 GB", "64 GB", "6000 mAh", "Android 10", "48 MP + 8 MP + 5 MP + 5 MP", "Exynos 9611", "Mali-G72 MP3", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy M11", "SM-M115FZKINS", "3 GB", "32 GB", "5000 mAh", "Android 10", "13 MP + 5 MP + 2 MP + 2 MP", "Exynos 7 Octa 7884B", "Mali-G71 MP2", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy M01", "SM-M015FZKINS", "2 GB", "32 GB", "4000 mAh", "Android 10", "13 MP + 2 MP + 2 MP", "Exynos 7 Octa 7884B", "Mali-G71 MP2", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A51", "SM-A515FZKINS", "6 GB", "128 GB", "4000 mAh", "Android 10", "48 MP + 12 MP + 5 MP + 5 MP", "Exynos 9611", "Mali-G72 MP3", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A71", "SM-A715FZKINS", "6 GB", "128 GB", "4500 mAh", "Android 10", "64 MP + 12 MP + 5 MP + 5 MP", "Exynos 9611", "Mali-G72 MP3", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A31", "SM-A315FZKINS", "6 GB", "128 GB", "5000 mAh", "Android 10", "48 MP + 8 MP + 5 MP + 5 MP", "Exynos 9611", "Mali-G72 MP3", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A21s", "SM-A217FZKINS", "4 GB", "64 GB", "5000 mAh", "Android 10", "48 MP + 8 MP + 2 MP + 2 MP", "Exynos 850", "Mali-G52 MP1", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A20s", "SM-A207FZKINS", "3 GB", "32 GB", "4000 mAh", "Android 9.0 (Pie)", "13 MP + 8 MP + 5 MP + 5 MP", "Exynos 7884B", "Mali-G71 MP2", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A10s", "SM-A107FZKINS", "2 GB", "32 GB", "4000 mAh", "Android 9.0 (Pie)", "13 MP + 2 MP + 2 MP", "Exynos 7884B", "Mali-G71 MP2", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A01", "SM-A015FZKINS", "2 GB", "32 GB", "3000 mAh", "Android 10", "13 MP + 2 MP + 2 MP", "Exynos 7 Octa 7884B", "Mali-G71 MP2", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A01 Core", "SM-A013FZKINS", "1 GB", "16 GB", "3000 mAh", "Android 10", "5 MP + 2 MP", "Exynos 7 Octa 7884B", "Mali-G71 MP2", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A80", "SM-A805FZKINS", "8 GB", "128 GB", "3700 mAh", "Android 9.0 (Pie)", "48 MP + 8 MP + 3 MP + 3 MP", "Exynos 9611", "Mali-G72 MP3", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A70", "SM-A705FZKINS", "6 GB", "128 GB", "4500 mAh", "Android 9.0 (Pie)", "32 MP + 8 MP + 5 MP + 5 MP", "Exynos 9610", "Mali-G72 MP3", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A50", "SM-A505FZKINS", "4 GB", "64 GB", "4000 mAh", "Android 9.0 (Pie)", "25 MP + 5 MP + 8 MP", "Exynos 9610", "Mali-G72 MP3", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A30", "SM-A305FZKINS", "4 GB", "64 GB", "4000 mAh", "Android 9.0 (Pie)", "16 MP + 5 MP + 5 MP", "Exynos 7904", "Mali-G71 MP2", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
                new ProductsData("Galaxy A20", "SM-A205FZKINS", "3 GB", "32 GB", "4000 mAh", "Android 9.0 (Pie)", "13 MP + 5 MP + 5 MP", "Exynos 7884B", "Mali-G71 MP2", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Dual SIM (Nano-SIM, dual stand-by)","NA"),
        };
        ProductAdapter productsAdapter = new ProductAdapter(productsData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(productsAdapter);
        return view;
    }
}