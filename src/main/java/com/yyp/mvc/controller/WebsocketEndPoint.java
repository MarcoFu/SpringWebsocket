package com.yyp.mvc.controller;



import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


/**
 * 用户通讯聊天控制器类
 * @author yyp
 *2014年12月27日下午6:56:46
 */
@RequestMapping("websocket")
public class WebsocketEndPoint extends TextWebSocketHandler {

		
	@Override
	protected void handleTextMessage(WebSocketSession session,
			TextMessage message) throws Exception {
		super.handleTextMessage(session, message);
		session.sendMessage(message);
	}
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("Connection Establied!");
	}
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("Connection Closed！");
	}
	

}
