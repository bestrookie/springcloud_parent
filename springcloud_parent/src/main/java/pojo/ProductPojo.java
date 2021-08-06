package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/8/6 3:46 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPojo {
    private Integer id;
    private String name;
    private Double price;
    private Date bir;
}
