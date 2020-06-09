package com.capstone.donghang.PlanFragments;

import java.util.List;

public class DetailInfo_Section {
    private String date;
    private List<DetailInfo_Item> item;

    public DetailInfo_Section(String date, List<DetailInfo_Item> item) {
        this.date = date;
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<DetailInfo_Item> getItem() {
        return item;
    }

    public void setItem(List<DetailInfo_Item> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "DetailInfo_Section{" +
                "date='" + date + '\'' +
                ", item=" + item +
                '}';
    }
}
