package com.lovecoding.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lovecoding.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    /**
     * @Reference ：从配置的dubbo对应的注册中心中进行初始化操作！
     */
    @Reference
    TicketService ticketService;

    @GetMapping("/buyTicket")
    public String buyTicket(String name){
        return name + "购买了" + ticketService.getTicket();
    }
}
