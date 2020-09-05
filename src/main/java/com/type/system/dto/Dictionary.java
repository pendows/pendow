package com.type.system.dto;

import java.util.List;

/**
 * 字典实体类
 *
 * @author pengweidong@ycs168.cn
 * @version 1.00.00
 * @date 2019-04-24
 */
public class Dictionary {
    //字典
    private List<String> dictionarys;
    //字典对象
    private volatile static Dictionary dictionary;

    /**
     * 单例模式获取字典对象
     */
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

    /**
     * 判断字典是否包含某字符
     * @param word
     * @return
     */
    public boolean dictionaryContains(String word){
        if(dictionarys!=null && dictionarys.size() !=0){
            return dictionarys.contains(word);
        }
        return false;
    }

}
