package com.type.system.service;

import com.type.system.itf.WordBreakService;
import com.type.system.utils.WordBreakUtils;

import java.util.ArrayList;

/**
 * 断句业务类
 * @author pengweidong@ycs168.cn
 * @version 1.00.00
 * @date 2019-04-24
 */
public class WordBreakServiceImpl implements WordBreakService {
    @Override
    public void wordBreakService(String word) throws Exception {
        //开始处理断句
         doWordBreak(word);
    }

    private void doWordBreak(String word) throws Exception {
       WordBreakUtils.wordBreak(word,new ArrayList<>());
    }
}
