package bestrookie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bestrookie
 * @date 2021/8/4 2:23 下午
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UsersApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class,args);
    }
}
