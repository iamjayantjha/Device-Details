package com.jayantassignment;

public class ProductsData {
    String manufacturer, modelName, modelNumber, ram, storage, battery, androidVersion, camera, processor, gpu, sensor, imei;

    public ProductsData(String manufacturer, String modelName, String ram, String storage, String battery, String androidVersion, String camera, String processor, String gpu, String sensor, String features, String imei) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
        this.androidVersion = androidVersion;
        this.camera = camera;
        this.processor = processor;
        this.gpu = gpu;
        this.sensor = sensor;
        this.imei = imei;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
