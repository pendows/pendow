package com.type.system.factory;

import com.type.system.constant.BreakWorldConstants;
import com.type.system.dto.Dictionary;
import com.type.system.enums.ResultEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 字典工产类
 * 根据不同类型生成对应字典
 * @author pengweidong@ycs168.cn
 * @version 1.00.00
 * @date 2019-04-24
 */
public class DictinoryFactory {

    /**
     * 专门生产字典，根据类型
     * @param dicts
     * @param type
     * @return
     * @throws Exception
     */
    public static Dictionary productDictionry(List<String> dicts, String type) throws Exception {
        switch(type){
            case BreakWorldConstants.THREE_DICT:
                check(dicts);
                //合并字典 对应题目第三题
                dicts = mergeDictionary(dicts);
                break;
            case BreakWorldConstants.TWO_DICT:
                check(dicts);
                break;
            default:
                //用默认字典，对应题目第一题
                dicts = BreakWorldConstants.DICT.get(BreakWorldConstants.DEFUAL);
                break;
        }
        Dictionary singleton = Dictionary.getSingleton();
        singleton.setDictionarys(dicts);
        return singleton;
    }

    /**
     * 合并字典 自定义字典和默认字典合并
     * @param dicts
     * @return
     */
    private static List<String> mergeDictionary(List<String> dicts) {
        Set<String> set = new HashSet<>();
        set.addAll(dicts);
        set.addAll(BreakWorldConstants.DICT.get(BreakWorldConstants.DEFUAL));
        return new ArrayList(set);
    }


    public static Dictionary getDictionary(){
        return Dictionary.getSingleton();
    }

    /**
     * 校验字符为空
     * @param dicts
     * @throws Exception
     */
    public static void check(List<String> dicts) throws Exception {
        if(dicts == null || dicts.size() <=0){
            throw new Exception(ResultEnum.DIC_NOT_NULL.getMessage(),null);
        }
    }

}
