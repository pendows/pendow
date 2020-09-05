package com.type.system.factory;

import com.type.system.dto.Dictionary;
import com.type.system.service.WordBreakServiceImpl;

/**
 * 断句对象工厂
 *
 * @author pengweidong@ycs168.cn
 * @version 1.00.00
 * @date 2019-04-24
 */
public class WordBreakFactory {
    private volatile static WordBreakServiceImpl WordBreakServiceImpl;

    /**
     * 获取断句业务对象
     * @return
     */
    public static WordBreakServiceImpl getWordBreakService() {
        if (WordBreakServiceImpl == null) {
            synchronized (Dictionary.class) {
                if (WordBreakServiceImpl == null) {
                    WordBreakServiceImpl = new WordBreakServiceImpl();
                }
            }
        }
        return WordBreakServiceImpl;
    }
}
