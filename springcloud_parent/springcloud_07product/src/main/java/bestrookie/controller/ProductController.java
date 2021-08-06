package bestrookie.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import pojo.ProductPojo;


/**
 * @author bestrookie
 * @date 2021/8/6 10:35 上午
 */
@RestController
public class ProductController {
    @Value("${server.port}")
    private int port;
    @GetMapping("/product")
    public String getProduct(){
        System.out.println("进入product服务");
        return "product ok"+port;
    }
    @PostMapping("/get")
    public String getInfo(String name,Integer age){
        return name+" "+age+" "+ port;
    }
    @GetMapping("test/{name}/{age}")
    public String getAll(@PathVariable("name") String name, @PathVariable(value = "age") Integer age){
        return  name+" "+age+" "+port;
    }
    @PostMapping("post")
    public String product(@RequestBody ProductPojo productPojo){
        System.out.println(productPojo.toString());
        return "ok";
    }
}
