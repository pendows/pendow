package com.type.system.factory;

import com.type.system.constant.BreakWorldConstants;
import com.type.system.dto.Dictionary;
import com.type.system.enums.ResultEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DictinoryFactory {

    public static Dictionary productDictionry(List<String> dicts, String type) throws Exception {
        switch(type){
            case BreakWorldConstants.THREE_DICT:
                check(dicts);
                dicts = mergeDictionary(dicts);
                break;
            case BreakWorldConstants.TWO_DICT:
                check(dicts);
                break;
            default:
                dicts = BreakWorldConstants.DICT.get(BreakWorldConstants.DEFUAL);
                break;
        }
        Dictionary singleton = Dictionary.getSingleton();
        singleton.setDictionarys(dicts);
        return singleton;
    }

    private static List<String> mergeDictionary(List<String> dicts) {
        Set<String> set = new HashSet<>();
        set.addAll(dicts);
        set.addAll(BreakWorldConstants.DICT.get(BreakWorldConstants.DEFUAL));
        return new ArrayList(set);
    }


    public static Dictionary getDictionary(){
        return Dictionary.getSingleton();
    }

    public static void check(List<String> dicts) throws Exception {
        if(dicts == null || dicts.size() <=0){
            throw new Exception(ResultEnum.DIC_NOT_NULL.getMessage(),null);
        }
    }

}
