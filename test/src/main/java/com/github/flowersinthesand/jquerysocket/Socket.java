package com.github.flowersinthesand.jquerysocket;

import java.util.Map;

//TODO move to jquery-socket-servlet
public interface Socket {

	String id();

	Socket on(String type, EventHandler<?> handler);

	Socket off(String type, EventHandler<?> handler);

	Socket one(String type, EventHandler<?> handler);

	Socket fire(String type, Object data);

	Socket open();

	Socket send(Object data);

	Socket send(String type, Object data);

	Socket close();
	
	Map<String, Object> data();

	interface EventHandler<T> {
		void handle(T data);
	}

}