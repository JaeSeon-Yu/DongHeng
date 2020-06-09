package com.capstone.donghang.PlanFragments;

public class DetailInfo_Item {
    private String item;
    private String address;

    public DetailInfo_Item(String item, String address) {
        this.item = item;
        this.address = address;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
