package com.lovecoding.ticket.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lovecoding.ticket.service.TicketService;
import org.springframework.stereotype.Component;

/**
 * @Service : dubbo下面的标记业务类的注解 ，只有使用了此注解才可以将实现了扫描接口的类注册到zk中
 * @Component : 将类添加到Spring容器中，这样调用的时候，才可以使用注解直接从容器中读取
 */
@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《阿凡达》";
    }
}
