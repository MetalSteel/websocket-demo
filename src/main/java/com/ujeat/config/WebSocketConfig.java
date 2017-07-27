package com.ujeat.config;/**
 * Created by wanggang on 2017/7/27.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @author wanggang
 * @version 1.0
 * @create 2017-07-27 11:59
 **/
@Configuration
@EnableWebSocketMessageBroker // 开启使用STOMP协议来传输基于代理(MessageBroker)的消息,这时候控制器支持@MessageMapping就像是@RequestMapping
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
    /**
     * 注册STOMP(Simple Text Orientated Messaging Protocol 简单文本定向消息协议)节点,并指定使用SockJS协议
     * @param stompEndpointRegistry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        stompEndpointRegistry.addEndpoint("/endpointWisely").withSockJS();
    }

    /**
     * 配置STOMP消息代理
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
    }
}
