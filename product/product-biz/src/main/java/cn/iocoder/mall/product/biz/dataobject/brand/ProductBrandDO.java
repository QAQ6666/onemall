package cn.iocoder.mall.product.biz.dataobject.brand;

import cn.iocoder.mall.mybatis.core.dataobject.DeletableDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Product 品牌
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ProductBrandDO extends DeletableDO {

    /**
     * 规格编号
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片地址
     */
    private String picUrl;

    /**
     * 状态
     * <p>
     * 1-开启
     * 2-禁用
     */
    private Integer status;

}
