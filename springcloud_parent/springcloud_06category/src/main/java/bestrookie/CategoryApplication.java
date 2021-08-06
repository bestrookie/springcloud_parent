package bestrookie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author bestrookie
 * @date 2021/8/6 10:23 上午
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CategoryApplication {
    public static void main(String[] args) {
            SpringApplication.run(CategoryApplication.class,args);
    }
}
