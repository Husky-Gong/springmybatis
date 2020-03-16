package com.zx;

import com.zx.domain.Room;
import com.zx.service.IRoomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        IRoomService roomService = context.getBean(IRoomService.class);
        Room room = roomService.queryRoom(6);
        System.out.println(room);
    }
}
