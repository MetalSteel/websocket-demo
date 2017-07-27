package com.ujeat.pojo;/**
 * Created by wanggang on 2017/7/27.
 */

/**
 * 服务器向浏览器传送消息，用该类进行传送
 * @author wanggang
 * @version 1.0
 * @create 2017-07-27 12:10
 **/
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage(){
        return responseMessage;
    }
}
