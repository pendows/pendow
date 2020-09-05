package com.type.system.dto;

import java.util.List;

public class Dictionary {
    private List<String> dictionarys;
    private volatile static Dictionary dictionary;
    public static Dictionary getSingleton() {
        if (dictionary == null) {
            synchronized (Dictionary.class) {
                if (dictionary == null) {
                    dictionary = new Dictionary();
                }
            }
        }
        return dictionary;
    }

    public void setDictionarys(List<String> dictionary) {
        this.dictionarys = dictionary;
    }

    public List<String> getDictionarys() {
        return dictionarys;
    }

    public boolean dictionaryContains(String word){
        if(dictionarys!=null && dictionarys.size() !=0){
            return dictionarys.contains(word);
        }
        return false;
    }

}
