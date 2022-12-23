package com.yida.test.serial;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @Type: SellfoxTokenModel.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/13 16:22
 * @Version:
 */
public class SellfoxTokenModel implements Serializable {

    private static final long serialVersionUID = -4259379153650942436L;

    private Integer code;
    private String msg;
    private SellfoxData data;
    private String requestId;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public SellfoxData getData() {
        return data;
    }

    public void setData(SellfoxData data) {
        this.data = data;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SellfoxTokenModel.class.getSimpleName() + "[", "]")
                .add("code=" + code)
                .add("msg='" + msg + "'")
                .add("data=" + data)
                .add("requestId='" + requestId + "'")
                .toString();
    }
}
