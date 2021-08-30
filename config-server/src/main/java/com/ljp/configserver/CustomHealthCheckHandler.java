package com.ljp.configserver;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;

import java.time.LocalDateTime;

/**
 * @author: liujinping
 * @createDate: 2021/8/25
 **/
public class CustomHealthCheckHandler implements HealthCheckHandler {

    @Autowired
    private CustomeHealthIndicator healthIndicator;

    @Override
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
        System.err.println(LocalDateTime.now() + " :开始向注册中心发送心跳 ====================================");
        Status s = healthIndicator.health().getStatus();
        if (s.equals(Status.UP)) {
            System.out.println("服务状态为UP");
            return InstanceInfo.InstanceStatus.UP;
        } else {
            System.out.println("服务状态为DOWN");
            return InstanceInfo.InstanceStatus.DOWN;
        }

    }

}
