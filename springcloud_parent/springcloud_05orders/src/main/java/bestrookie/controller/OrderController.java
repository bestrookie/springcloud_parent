package bestrookie.controller;

import com.oracle.tools.packager.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bestrookie
 * @date 2021/8/4 3:35 下午
 */
@RestController
public class OrderController {
    @GetMapping("order")
    public String invokeOrder(){
        Log.info("order demo>>>>>>>");
        return "order 服务";
    }
}
