package com.type.system.constant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 断句常量类
 *
 * @author pengweidong@ycs168.cn
 * @version 1.00.00
 * @date 2019-04-24
 */
public class BreakWorldConstants {

    //字典容器，包含默认的，自定义的，自定义+默认
    public static final Map<String, List<String>> DICT = new HashMap(3);

    //默认字典
    public static final String[] DEFUAL_DICT = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go", "and","mango"};
    //默认标志 当标志是这个时候，则字典用DEFUAL_DICT
    public static final String DEFUAL ="defalut";
    //题目第三道题标志 当标志是这个时候，则字典用DEFUAL_DICT+自定义的
    public static final String THREE_DICT ="three";
    //题目第二道题标志 当标志是这个时候，则字典用自定义的
    public static final String TWO_DICT ="two";
    static {
        //初始化默认字典到容器
        DICT.put(DEFUAL, Arrays.asList(DEFUAL_DICT));
    }
}
