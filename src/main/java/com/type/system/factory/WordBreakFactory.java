package com.type.system.factory;

import com.type.system.dto.Dictionary;
import com.type.system.itf.WordBreakService;
import com.type.system.service.WordBreakServiceImpl;

public class WordBreakFactory {
    private volatile static WordBreakServiceImpl WordBreakServiceImpl;
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
