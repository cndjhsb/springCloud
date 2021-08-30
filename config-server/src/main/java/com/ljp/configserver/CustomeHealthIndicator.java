package com.ljp.configserver;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;

/**
 * @author: liujinping
 * @createDate: 2021/8/25
 **/
public class CustomeHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return new Health.Builder(Status.UP).build();
    }
}
