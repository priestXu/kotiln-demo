package com.goodsogood.ows.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table


@ApiModel
@Table(name = "t_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
data class UserEntity(
        @ApiModelProperty(value = "id")
        @Id
        @Column(name = "user_id")
        @JsonProperty("user_id")
        @GeneratedValue(generator = "JDBC")
        var userId: Long? = null,

        @ApiModelProperty(value = "用户名")
        var name: String? = null,

        @ApiModelProperty(value = "密码")
        var password: String? = null,

        @ApiModelProperty(value = "用户手机号")
        var phone: String? = null,

        @ApiModelProperty(value = "性别")
        var gender: Short? = null,

        @ApiModelProperty(value = "年龄")
        var age: Int? = null,

        @ApiModelProperty(value = "出生日期")
        var birthday: String? = null,

        @ApiModelProperty(value = "最后修改人")
        @Column(name = "last_change_user")
        @JsonProperty("last_change_user")
        var lastChangeUser: Long? = null,

        @ApiModelProperty(value = "创建时间")
        @Column(name = "create_time")
        @JsonProperty("create_time")
        var createTime: Date? = null,

        @ApiModelProperty(value = "更新时间")
        @Column(name = "update_time")
        @JsonProperty("update_time")
        var updateTime: Date? = null
)
