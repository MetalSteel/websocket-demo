package com.ujeat.controller;/**
 * Created by wanggang on 2017/7/27.
 */

import com.ujeat.pojo.WiselyMessage;
import com.ujeat.pojo.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * WebSocket控制器
 * @author wanggang
 * @version 1.0
 * @create 2017-07-27 12:44
 **/
@Controller
public class WsController {
    /**
     * 服务器向浏览器发送消息
     * @param message
     * @return
     * @throws Exception
     */
    @MessageMapping("/welcome") // 和RequestMapping功能类型,用于设置URL映射地址,浏览器向服务器发送请求,需要通过该地址
    @SendTo("/topic/getResponse") // 如果服务器收到了消息就会对订阅了@SendTo括号中的地址传送消息
    public WiselyResponse say(WiselyMessage message) throws Exception {
        return new WiselyResponse("Welcome, " + message.getName() + "!");
    }
}
