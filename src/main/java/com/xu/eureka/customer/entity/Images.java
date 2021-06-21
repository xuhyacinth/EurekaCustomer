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
@ApiModel(value="Images对象", description="")
public class Images implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "图片id")
    private String iid;

    @ApiModelProperty(value = "图片父节点id")
    private String fid;

    @ApiModelProperty(value = "图片类型")
    private String tag;

    @ApiModelProperty(value = "图片类型")
    private String type;

    @ApiModelProperty(value = "图片名称")
    private String name;

    @ApiModelProperty(value = "图片节点是否可用")
    private String useable;

    @ApiModelProperty(value = "图片简单介绍")
    private String imgIntroduceShort;

    @ApiModelProperty(value = "图片详细描述")
    private String imgIntroduceLong;

    @ApiModelProperty(value = "图片图详情片绝对路径")
    private String imgAbsPath;

    @ApiModelProperty(value = "图片图详情片url路径(以,分割)")
    private String imgUrlPath;

    @ApiModelProperty(value = "节点创建时间")
    private Date imgCreateDate;

    @ApiModelProperty(value = "节点修改时间")
    private Date imgUpdateDate;


}
