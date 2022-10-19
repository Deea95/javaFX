package com.company;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class FXCollectionsExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(Change<? extends String> c) {
                System.out.println(c);
            }
        });
        observableList.add("a");
        list.add("b");
    }
}
