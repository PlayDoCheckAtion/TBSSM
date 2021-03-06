package com.tbSSMDemo.exception;

import com.tbSSMDemo.enums.ResultEnum;

public class DemoException extends RuntimeException {
    private Integer code;

    public DemoException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
