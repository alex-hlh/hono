package com.hu.hono.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表;
 * @author : http://www.chiner.pro
 * @date : 2023-8-24
 */
@ApiModel(value = "用户信息表",description = "")
@TableName("sys_user")
public class SysUser implements Serializable,Cloneable{
	/** 用户ID */
	@ApiModelProperty(name = "用户ID",notes = "")
	@TableId
	private Long userId ;
	/** 部门ID */
	@ApiModelProperty(name = "部门ID",notes = "")
	private Long deptId ;
	/** 登录账号 */
	@ApiModelProperty(name = "登录账号",notes = "")
	private String loginName ;
	/** 用户昵称 */
	@ApiModelProperty(name = "用户昵称",notes = "")
	private String userName ;
	/** 用户类型（00系统用户 01注册用户） */
	@ApiModelProperty(name = "用户类型（00系统用户 01注册用户）",notes = "")
	private String userType ;
	/** 用户邮箱 */
	@ApiModelProperty(name = "用户邮箱",notes = "")
	private String email ;
	/** 手机号码 */
	@ApiModelProperty(name = "手机号码",notes = "")
	private String phoneNumber ;
	/** 用户性别（0男 1女 2未知） */
	@ApiModelProperty(name = "用户性别（0男 1女 2未知）",notes = "")
	private Integer sex ;
	/** 头像路径 */
	@ApiModelProperty(name = "头像路径",notes = "")
	private String avatar ;
	/** 密码 */
	@ApiModelProperty(name = "密码",notes = "")
	private String password ;
	/** 盐加密 */
	@ApiModelProperty(name = "盐加密",notes = "")
	private String salt ;
	/** 帐号状态（0正常 1停用） */
	@ApiModelProperty(name = "帐号状态（0正常 1停用）",notes = "")
	private Integer status ;
	/** 删除标志（0代表存在 2代表删除） */
	@ApiModelProperty(name = "删除标志（0代表存在 2代表删除）",notes = "")
	private Integer delFlag ;
	/** 最后登录IP */
	@ApiModelProperty(name = "最后登录IP",notes = "")
	private String loginIp ;
	/** 最后登录时间 */
	@ApiModelProperty(name = "最后登录时间",notes = "")
	private Date loginDate ;
	/** 密码最后更新时间 */
	@ApiModelProperty(name = "密码最后更新时间",notes = "")
	private Date pwdUpdateDate ;
	/** 创建者 */
	@ApiModelProperty(name = "创建者",notes = "")
	private String createBy ;
	/** 创建时间 */
	@ApiModelProperty(name = "创建时间",notes = "")
	private Date createTime ;
	/** 更新者 */
	@ApiModelProperty(name = "更新者",notes = "")
	private String updateBy ;
	/** 更新时间 */
	@ApiModelProperty(name = "更新时间",notes = "")
	private Date updateTime ;
	/** 备注 */
	@ApiModelProperty(name = "备注",notes = "")
	private String remark ;

	/** 用户ID */
	public Long getUserId(){
		return this.userId;
	}
	/** 用户ID */
	public void setUserId(Long userId){
		this.userId=userId;
	}
	/** 部门ID */
	public Long getDeptId(){
		return this.deptId;
	}
	/** 部门ID */
	public void setDeptId(Long deptId){
		this.deptId=deptId;
	}
	/** 登录账号 */
	public String getLoginName(){
		return this.loginName;
	}
	/** 登录账号 */
	public void setLoginName(String loginName){
		this.loginName=loginName;
	}
	/** 用户昵称 */
	public String getUserName(){
		return this.userName;
	}
	/** 用户昵称 */
	public void setUserName(String userName){
		this.userName=userName;
	}
	/** 用户类型（00系统用户 01注册用户） */
	public String getUserType(){
		return this.userType;
	}
	/** 用户类型（00系统用户 01注册用户） */
	public void setUserType(String userType){
		this.userType=userType;
	}
	/** 用户邮箱 */
	public String getEmail(){
		return this.email;
	}
	/** 用户邮箱 */
	public void setEmail(String email){
		this.email=email;
	}
	/** 手机号码 */
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	/** 手机号码 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	/** 用户性别（0男 1女 2未知） */
	public Integer getSex(){
		return this.sex;
	}
	/** 用户性别（0男 1女 2未知） */
	public void setSex(Integer sex){
		this.sex=sex;
	}
	/** 头像路径 */
	public String getAvatar(){
		return this.avatar;
	}
	/** 头像路径 */
	public void setAvatar(String avatar){
		this.avatar=avatar;
	}
	/** 密码 */
	public String getPassword(){
		return this.password;
	}
	/** 密码 */
	public void setPassword(String password){
		this.password=password;
	}
	/** 盐加密 */
	public String getSalt(){
		return this.salt;
	}
	/** 盐加密 */
	public void setSalt(String salt){
		this.salt=salt;
	}
	/** 帐号状态（0正常 1停用） */
	public Integer getStatus(){
		return this.status;
	}
	/** 帐号状态（0正常 1停用） */
	public void setStatus(Integer status){
		this.status=status;
	}
	/** 删除标志（0代表存在 2代表删除） */
	public Integer getDelFlag(){
		return this.delFlag;
	}
	/** 删除标志（0代表存在 2代表删除） */
	public void setDelFlag(Integer delFlag){
		this.delFlag=delFlag;
	}
	/** 最后登录IP */
	public String getLoginIp(){
		return this.loginIp;
	}
	/** 最后登录IP */
	public void setLoginIp(String loginIp){
		this.loginIp=loginIp;
	}
	/** 最后登录时间 */
	public Date getLoginDate(){
		return this.loginDate;
	}
	/** 最后登录时间 */
	public void setLoginDate(Date loginDate){
		this.loginDate=loginDate;
	}
	/** 密码最后更新时间 */
	public Date getPwdUpdateDate(){
		return this.pwdUpdateDate;
	}
	/** 密码最后更新时间 */
	public void setPwdUpdateDate(Date pwdUpdateDate){
		this.pwdUpdateDate=pwdUpdateDate;
	}
	/** 创建者 */
	public String getCreateBy(){
		return this.createBy;
	}
	/** 创建者 */
	public void setCreateBy(String createBy){
		this.createBy=createBy;
	}
	/** 创建时间 */
	public Date getCreateTime(){
		return this.createTime;
	}
	/** 创建时间 */
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	/** 更新者 */
	public String getUpdateBy(){
		return this.updateBy;
	}
	/** 更新者 */
	public void setUpdateBy(String updateBy){
		this.updateBy=updateBy;
	}
	/** 更新时间 */
	public Date getUpdateTime(){
		return this.updateTime;
	}
	/** 更新时间 */
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	/** 备注 */
	public String getRemark(){
		return this.remark;
	}
	/** 备注 */
	public void setRemark(String remark){
		this.remark=remark;
	}
}
