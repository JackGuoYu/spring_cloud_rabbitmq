package io.ymq.example.feign.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述: 指定这个接口所要调用的 提供者服务名称 "config-client"
 *
 * @author yanpenglei
 * @create 2017-12-06 15:13
 **/
@FeignClient("config-client")
public interface  HomeClient {

    @GetMapping("/hello")
    String consumer();
}
