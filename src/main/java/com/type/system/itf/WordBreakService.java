package com.type.system.itf;

/**
 * 断句业务对象接口
 *
 * @author pengweidong@ycs168.cn
 * @version 1.00.00
 * @date 2019-04-24
 */
public interface WordBreakService {

    /**
     * 处理断句业务
     * @param word
     * @throws Exception
     */
    void wordBreakService(String word) throws Exception;
}
