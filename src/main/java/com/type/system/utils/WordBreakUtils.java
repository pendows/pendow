package com.type.system.utils;

import com.type.system.factory.DictinoryFactory;
import com.type.system.dto.Dictionary;

import java.util.List;

/**
 * 断句工具类
 * { i, like, sam, sung, samsung, mobile, ice, cream, man go}
 * Input: "ilikesamsungmobile"
 * Output: i like sam sung mobile
 *         i like samsung mobile
 * @author pengweidong@ycs168.cn
 * @version 1.00.00
 * @date 2019-04-24
 */
public class WordBreakUtils {
    public volatile static String contentStr = "";
    public static String wordBreak(String word, List<String> contents) throws Exception {
        int len = word.length();
        if(len == 0){
            System.out.println(contents);
            contentStr += "," + contents.toString();
            return contentStr;
        }
        Dictionary dictionary = DictinoryFactory.getDictionary();
        for(int i=1; i<=len; i++){
            String substr = word.substring(0, i);
            if(dictionary.dictionaryContains(substr)){
                contents.add(substr);
                wordBreak(word.substring(i), contents);
                contents.remove(contents.size()-1);
            }
        }
        return contentStr;
    }

}
