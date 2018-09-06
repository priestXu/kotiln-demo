package com.goodsogood.ows.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author xuliduo
 * @date 2018/9/6
 * @description class UserEntity
 */
@Table(name = "t_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserEntity {
    @ApiModelProperty(value = "id")
    @Id
    @Column(name = "user_id")
    @JsonProperty("user_id")
    @GeneratedValue(generator = "JDBC")
    private Long userId;

    @NotNull(message = "用户名称不能为空")
    @ApiModelProperty(value = "用户名")
    private String name;

    @NotNull
    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "用户手机号")
    private String phone;

    @ApiModelProperty(value = "性别")
    private Short gender;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "出生日期")
    private String birthday;

    @ApiModelProperty(value = "最后修改人")
    @Column(name = "last_change_user")
    @JsonProperty("last_change_user")
    private Long lastChangeUser;

    @ApiModelProperty(value = "创建时间")
    @Column(name = "create_time")
    @JsonProperty("create_time")
    private Date createTim;

    @ApiModelProperty(value = "更新时间")
    @Column(name = "update_time")
    @JsonProperty("update_time")
    private Date updateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Long getLastChangeUser() {
        return lastChangeUser;
    }

    public void setLastChangeUser(Long lastChangeUser) {
        this.lastChangeUser = lastChangeUser;
    }

    public Date getCreateTim() {
        return createTim;
    }

    public void setCreateTim(Date createTim) {
        this.createTim = createTim;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
