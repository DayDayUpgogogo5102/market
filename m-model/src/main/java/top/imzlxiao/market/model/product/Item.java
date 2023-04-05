package top.imzlxiao.market.model.product;

import lombok.Data;

import java.io.Serializable;

@Data
public class Item  {
    private Integer id;
    private String name;
    private Long price;
}
