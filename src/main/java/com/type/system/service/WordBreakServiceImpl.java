package com.type.system.service;

import com.type.system.utils.WordBreakUtils;

import java.util.ArrayList;

public class WordBreakServiceImpl implements com.type.system.itf.WordBreakService {
    @Override
    public void wordBreakService(String word) throws Exception {
         doWordBreak(word);
    }

    private void doWordBreak(String word) throws Exception {
       WordBreakUtils.wordBreak(word,new ArrayList<>());
    }
}
