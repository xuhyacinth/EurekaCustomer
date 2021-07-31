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
@ApiModel(value="Article对象", description="")
public class Article implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "文章id")
    private String aid;

    @ApiModelProperty(value = "文章标签")
    private String tag;

    @ApiModelProperty(value = "文章节点类型")
    private String type;

    @ApiModelProperty(value = "文章名称")
    private String name;

    @ApiModelProperty(value = "文章描述")
    private String detail;

    @ApiModelProperty(value = "纯文字文章")
    private String article;

    @ApiModelProperty(value = "文章是否可显示")
    private String useable;

    @ApiModelProperty(value = "文章文件绝对路径")
    private String articleAbsPath;

    @ApiModelProperty(value = "文章文件访问路径")
    private String articleUrlPath;

    @ApiModelProperty(value = "文章创建时间")
    private Date createDate;

    @ApiModelProperty(value = "文章修改时间")
    private Date updateDate;


}
