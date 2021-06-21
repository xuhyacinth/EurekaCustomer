package com.xu.eureka.customer.entity;

import java.sql.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Goods对象", description="")
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "商品id")
    private String gid;

    @ApiModelProperty(value = "商品父节点id")
    private String fid;

    @ApiModelProperty(value = "商品类型")
    private String tag;

    @ApiModelProperty(value = "商品类型")
    private String type;

    @ApiModelProperty(value = "商品节点是否可用")
    private String useable;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "商品价格")
    private String price;

    @ApiModelProperty(value = "商品折扣")
    private String discount;

    @ApiModelProperty(value = "商品生产日期")
    private Date goodsDateGeneration;

    @ApiModelProperty(value = "商品保质期")
    private String goodsDateGuarantee;

    @ApiModelProperty(value = "商品简单介绍")
    private String goodsIntroduceShort;

    @ApiModelProperty(value = "商品详细描述")
    private String goodsIntroduceLong;

    @ApiModelProperty(value = "网站主页商品图片绝对路径")
    private String pubImgAbsPath;

    @ApiModelProperty(value = "网站主页商品图片url路径")
    private String pubImgUrlPath;

    @ApiModelProperty(value = "商品图详情片绝对路径")
    private String imgsAbsPath;

    @ApiModelProperty(value = "商品图详情片url路径(以,分割)")
    private String imgsUrlPath;

    @ApiModelProperty(value = "节点创建时间")
    private Date createDate;

    @ApiModelProperty(value = "节点修改时间")
    private Date updateDate;


}
