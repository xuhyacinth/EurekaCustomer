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
@ApiModel(value="Logs对象", description="")
public class Logs implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "日志id")
    private String lid;

    @ApiModelProperty(value = "操作用户ip地址")
    private String ip;

    @ApiModelProperty(value = "操作用户id")
    private String uid;

    @ApiModelProperty(value = "操作类型")
    private String type;

    @ApiModelProperty(value = "操作详情")
    private String detail;

    @ApiModelProperty(value = "操作时间")
    private Date operationData;


}
