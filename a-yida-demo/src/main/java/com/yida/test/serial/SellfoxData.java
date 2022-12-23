package com.yida.test.serial;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @Type: Data.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/13 16:23
 * @Version:
 */
public class SellfoxData implements Serializable {

    private static final long serialVersionUID = -7423141598920441644L;

    private String access_token;
    private Integer expires_in;


    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SellfoxData.class.getSimpleName() + "[", "]")
                .add("access_token='" + access_token + "'")
                .add("expires_in=" + expires_in)
                .toString();
    }
}
