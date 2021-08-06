package bestrookie.controller;

import com.netflix.loadbalancer.IRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author bestrookie
 * @date 2021/8/4 3:40 下午
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("user")
    public String invokeUser(){
        String forObject = restTemplate.getForObject("http://ORDERS/order", String.class);
        return "结果为:"+forObject;
    }
}
