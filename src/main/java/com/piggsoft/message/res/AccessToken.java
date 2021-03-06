package com.piggsoft.message.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <br>Created by user on 2015/11/24.
 * @author piggsoft@163.com
 */
public class AccessToken {
    /**
     * 全局唯一票据
     */
    @JSONField(name = "access_token")
    private String accessToken;
    /**
     * 有效时长
     */
    @JSONField(name = "expires_in")
    private int expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}
