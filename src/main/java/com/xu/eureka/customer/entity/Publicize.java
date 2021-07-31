package com.xu.eureka.customer.entity;

import java.io.Serializable;
import java.sql.Date;

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
@ApiModel(value="Publicize对象", description="")
public class Publicize implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "宣传id")
    private String pid;

    @ApiModelProperty(value = "宣传父节点id")
    private String fid;

    @ApiModelProperty(value = "宣传标签")
    private String tag;

    @ApiModelProperty(value = "宣传节点类型")
    private String type;

    @ApiModelProperty(value = "宣传图片名称")
    private String name;

    @ApiModelProperty(value = "宣传标签索引")
    private String index;

    @ApiModelProperty(value = "宣传图片描述")
    private String detail;

    @ApiModelProperty(value = "宣传图片是否可显示")
    private String useable;

    @ApiModelProperty(value = "图片简单介绍")
    private String imgIntroduceShort;

    @ApiModelProperty(value = "图片详细描述")
    private String imgIntroduceLong;

    @ApiModelProperty(value = "宣传图片绝对路径")
    private String imgAbsPath;

    @ApiModelProperty(value = "宣传图片url路径")
    private String imgUrlPath;

    @ApiModelProperty(value = "节点创建时间")
    private Date createDate;

    @ApiModelProperty(value = "节点修改时间")
    private Date updateDate;


}
