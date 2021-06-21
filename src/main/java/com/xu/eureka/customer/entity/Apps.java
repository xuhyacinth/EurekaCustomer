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
@ApiModel(value="Apps对象", description="")
public class Apps implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "软件id")
    private String aid;

    @ApiModelProperty(value = "软件标签")
    private String tag;

    @ApiModelProperty(value = "软件类型")
    private String type;

    @ApiModelProperty(value = "软件名称")
    private String name;

    @ApiModelProperty(value = "软件版本")
    private String version;

    @ApiModelProperty(value = "软件是否可下载")
    private String useable;

    @ApiModelProperty(value = "软件绝对路径")
    private String appAbsPath;

    @ApiModelProperty(value = "软件url路径")
    private String appUrlPath;

    @ApiModelProperty(value = "软件图标绝对路径")
    private String iconAbsPath;

    @ApiModelProperty(value = "软件图标url路径")
    private String iconUrlPath;

    @ApiModelProperty(value = "节点创建时间")
    private Date createDate;

    @ApiModelProperty(value = "节点修改时间")
    private Date updateDate;


}
