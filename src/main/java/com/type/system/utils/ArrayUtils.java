package com.type.system.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static List<String> arrayToList(String[] strs){
        List<String> stringList = new ArrayList<>();
        for (String str : strs) {
            stringList.add(str);
        }
        return stringList;
    }
}
