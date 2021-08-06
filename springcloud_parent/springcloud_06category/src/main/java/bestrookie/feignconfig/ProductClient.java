package bestrookie.feignconfig;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pojo.ProductPojo;

/**
 * @author bestrookie
 * @date 2021/8/6 11:00 上午
 */
@FeignClient(value = "PRODUCT")
public interface ProductClient {
    @GetMapping("/product")
    String getProduct();
    @PostMapping("/get")
    String getInfo(@RequestParam String name, @RequestParam Integer age);
    @GetMapping("test/{name}/{age}")
    String getAll(@PathVariable(value = "name") String name, @PathVariable(value = "age") Integer age);
    @PostMapping("post")
    String product(@RequestBody ProductPojo productPojo);

}
