package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List<List<String>> boxingMethod(String name) {



        ArrayList<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<String> secondList = new ArrayList<>();
        secondList.add(String.valueOf(firstList));
        return Collections.singletonList(secondList);
    }

    //TODO: Refactor Method-2
    public <Object> java.lang.Object genericMethod(Object data) {
        return data;
    }

    //TODO: Refactor Method-3
    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {

        consumer.addAll(producer);
    }

}
