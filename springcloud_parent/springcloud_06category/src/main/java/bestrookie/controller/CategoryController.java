package bestrookie.controller;

import bestrookie.feignconfig.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.ProductPojo;

import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/8/6 10:33 上午
 */
@RestController
public class CategoryController {
    @Autowired
    private ProductClient productClient;
    @GetMapping("/category")
    public String categoryServer(){
        System.out.println("进入category");
//        String product = productClient.getProduct();
//        String info = productClient.getInfo("张三", 18);
//        String info = productClient.getAll("张三", 199);
        String info = productClient.product(new ProductPojo(1, "摸鱼", 2.0, new Date()));
        return "category"+info;
    }
}
