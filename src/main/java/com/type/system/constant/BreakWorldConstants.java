package com.type.system.constant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreakWorldConstants {
    public static final Map<String, List<String>> DICT = new HashMap(3);
    public static final String[] DEFUAL_DICT = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go", "and","mango"};
    public static final String DEFUAL ="defalut";
    public static final String THREE_DICT ="three";
    public static final String TWO_DICT ="two";
    static {
        DICT.put(DEFUAL, Arrays.asList(DEFUAL_DICT));
    }
}
