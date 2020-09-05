package com.type.system.utils;

import com.type.system.factory.DictinoryFactory;
import com.type.system.dto.Dictionary;
import java.util.List;

public class WordBreakUtils {
    public static void wordBreak(String word, List<String> contents) throws Exception {
        int len = word.length();
        if(len == 0){
            System.out.println(contents);
            return;
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
    }

}
