package com.type.system.enums;


/**
 * 存货异常定义枚举
 *
 * @author pengweidong@ycs168.cn
 * @version 1.00.00
 * @date 2019-04-24
 */
public enum ResultEnum {

    /**
     * 异常代码，及异常描述
     */
    SUCCESS("0000", "SUCCESS"),
    DIC_NOT_NULL("0001", "输入的词典为空,请重新输入..."),
    WORD_NOT_NULL("0002", "输入的单词长度为0，请重写输入...");

    private String code;
    private String message;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
