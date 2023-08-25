package com.hu.hono.common.result;

import java.io.Serializable;

/**
 * @author <wangjian>
 * @version v1.0
 * @title CommonResult
 * @projectName integration
 * @description
 * @date 2021/4/22 9:46
 */
@SuppressWarnings({"unused"})
public class CommonResult<T> implements Serializable {

	private static final long serialVersionUID = -3997475445483489667L;

	private Integer code;
	private String message;
	private T data;

	public CommonResult() {

	}

	// 不返回数据构造方法
	public CommonResult(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	//不返回数据构造方法
	public CommonResult(CommonCode codeEnum) {
		this.code = codeEnum.getCode();
		this.message = codeEnum.getMessage();
	}

	//返回数据构造方法
	public CommonResult(CommonCode codeEnum, T data) {
		this(codeEnum);
		this.data = data;
	}

	public CommonResult(Integer code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * @Author <wangjian>
	 * @Description 请求成功
	 * @Date: 21/12/22 11:43
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> success() {
		return new CommonResult<T>(CommonCode.RESULT_SUCCESS);
	}

	/**
	 * @param data 返回数据
	 * @Author <wangjian>
	 * @Description 请求成功，返回数据
	 * @Date: 21/12/22 11:43
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> success(T data) {
		return new CommonResult<T>(CommonCode.RESULT_SUCCESS, data);
	}

	/**
	 * @param message 提示消息
	 * @param data    返回数据
	 * @Author <wangjian>
	 * @Description 请求成功，返回结果以及消息
	 * @Date: 21/12/22 11:44
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> success(String message, T data) {
		return new CommonResult<T>(CommonCode.RESULT_SUCCESS.getCode(), message, data);
	}

	/**
	 * @param errorCode
	 * @Author <wangjian>
	 * @Description 请求失败
	 * @Date: 21/12/22 11:44
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> error(CommonCode errorCode) {
		return new CommonResult<T>(errorCode);
	}

	/**
	 * @param errorCode 错误码
	 * @param message   错误消息
	 * @Author <wangjian>
	 * @Description 请求失败，返回自定义错误码以及消息
	 * @Date: 21/12/22 11:44
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> error(int errorCode, String message) {
		return new CommonResult<T>(errorCode, message);
	}

	/**
	 * @param message
	 * @Author <wangjian>
	 * @Description 自定义失败消息
	 * @Date: 21/12/22 11:53
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> error(String message) {
		return new CommonResult<T>(CommonCode.RESULT_ERROR.getCode(), message);
	}

	/**
	 * @Author <wangjian>
	 * @Description 请求失败
	 * @Date: 21/12/22 11:53
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> error() {
		return new CommonResult<T>(CommonCode.RESULT_ERROR);
	}


	/**
	 * @Author <wangjian>
	 * @Description 请求参数验证失败返回结果
	 * @Date: 21/12/22 11:54
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> validateFailed() {
		return error(CommonCode.RESULT_VALIDATE_FAILED);
	}

	/**
	 * @param message
	 * @Author <wangjian>
	 * @Description 请求参数验证失败返回结果
	 * @Date: 21/12/22 11:54
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> validateFailed(String message) {
		return new CommonResult<T>(CommonCode.RESULT_VALIDATE_FAILED.getCode(), message);
	}

	/**
	 * @Author <wangjian>
	 * @Description 未登录
	 * @Date: 21/12/22 11:54
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> noLogin() {
		return new CommonResult<T>(CommonCode.RESULT_UNAUTHORIZED);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 未登录返回结果
	 * @Date: 21/12/22 11:55
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> noLogin(T data) {
		return new CommonResult<T>(CommonCode.RESULT_UNAUTHORIZED, data);
	}

	/**
	 * @param data
	 * @param message
	 * @Author <wangjian>
	 * @Description 未登录，自定义提示信息
	 * @Date: 21/11/24 15:38
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> noLogin(T data, String message) {
		return new CommonResult<T>(CommonCode.RESULT_UNAUTHORIZED.getCode(), message, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 未授权
	 * @Date: 21/12/22 11:55
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> forbidden() {
		return new CommonResult<T>(CommonCode.RESULT_FORBIDDEN);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 未授权，返回结果集
	 * @Date: 21/12/22 11:55
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> forbidden(T data) {
		return new CommonResult<T>(CommonCode.RESULT_FORBIDDEN, data);
	}

	/**
	 * @param message
	 * @param data
	 * @Author <wangjian>
	 * @Description 未授权
	 * @Date: 2021/8/25 16:52
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> forbidden(String message, T data) {
		return new CommonResult<T>(CommonCode.RESULT_FORBIDDEN.getCode(), message, data);
	}

	/**
	 * @Description 未注册应用
	 * @Author <wangjian>
	 * @Date: 2021/8/10 14:12
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> unRegisterApplication() {
		return new CommonResult<T>(CommonCode.RESULT_UNREGISTER);
	}

	/**
	 * @param data
	 * @Description 未注册应用
	 * @Author <wangjian>
	 * @Date: 2021/8/10 14:15
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> unRegisterApplication(T data) {
		return new CommonResult<T>(CommonCode.RESULT_UNREGISTER, data);
	}

	/**
	 * @param message
	 * @param data
	 * @Author <wangjian>
	 * @Description 未注册应用
	 * @Date: 2021/8/25 16:53
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> unRegisterApplication(String message, T data) {
		return new CommonResult<T>(CommonCode.RESULT_UNREGISTER.getCode(), message, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 签名错误
	 * @Date: 2021/8/20 9:56
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> signatureError() {
		return new CommonResult<T>(CommonCode.RESULT_SIGNATURE);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 签名错误
	 * @Date: 2021/8/20 9:56
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> signatureError(T data) {
		return new CommonResult<T>(CommonCode.RESULT_SIGNATURE, data);
	}

	/**
	 * @param message
	 * @param data
	 * @Author <wangjian>
	 * @Description 签名错误
	 * @Date: 2021/8/25 16:54
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> signatureError(String message, T data) {
		return new CommonResult<T>(CommonCode.RESULT_SIGNATURE.getCode(), message, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 服务限流
	 * @Date: 2021/8/25 16:41
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> blockHandler() {
		return new CommonResult<T>(CommonCode.RESULT_BLOCKHANDLER);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 服务限流
	 * @Date: 2021/8/25 16:43
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> blockHandler(T data) {
		return new CommonResult<T>(CommonCode.RESULT_BLOCKHANDLER, data);
	}

	/**
	 * @param message
	 * @param data
	 * @Author <wangjian>
	 * @Description 服务限流
	 * @Date: 2021/8/25 16:44
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> blockHandler(String message, T data) {
		return new CommonResult<T>(CommonCode.RESULT_BLOCKHANDLER.getCode(), message, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 服务熔断
	 * @Date: 2021/8/25 16:45
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> fallBack() {
		return new CommonResult<T>(CommonCode.RESULT_FALLBACK);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 服务熔断
	 * @Date: 2021/8/25 16:47
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> fallBack(T data) {
		return new CommonResult<T>(CommonCode.RESULT_FALLBACK, data);
	}

	/**
	 * @param message
	 * @param data
	 * @Author <wangjian>
	 * @Description 服务熔断
	 * @Date: 2021/8/25 16:48
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> fallBack(String message, T data) {
		return new CommonResult<T>(CommonCode.RESULT_FALLBACK.getCode(), message, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 发送RocketMQ消息错误
	 * @Date: 2021/9/18 17:55
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> sendMQError() {
		return new CommonResult<T>(CommonCode.RESULT_MQERROR);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 发送RocketMQ消息错误
	 * @Date: 2021/9/18 17:56
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> sendMQError(T data) {
		return new CommonResult<T>(CommonCode.RESULT_MQERROR, data);
	}

	/**
	 * @param message
	 * @param data
	 * @Author <wangjian>
	 * @Description 发送RocketMQ消息错误
	 * @Date: 2021/9/18 17:57
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> sendMQError(String message, T data) {
		return new CommonResult<T>(CommonCode.RESULT_MQERROR.getCode(), message, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 资源不存在
	 * @Date: 21/12/22 11:56
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> notExist() {
		return new CommonResult<T>(CommonCode.RESULT_NOTHINGNESS);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 资源不存在，返回结果集
	 * @Date: 21/12/22 11:56
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> notExist(T data) {
		return new CommonResult<T>(CommonCode.RESULT_NOTHINGNESS, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 其他错误
	 * @Date: 21/12/22 11:56
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> otherError() {
		return new CommonResult<T>(CommonCode.RESULT_OTHER);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 其他错误
	 * @Date: 21/12/22 11:56
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> otherError(T data) {
		return new CommonResult<T>(CommonCode.RESULT_OTHER, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 密码不符合安全策略
	 * @Date: 21/12/22 11:42
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> securityPoliryError() {
		return new CommonResult<T>(CommonCode.RESULT_SECURITY_POLICY_ERROR);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 密码不符合安全策略
	 * @Date: 21/12/22 11:42
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> securityPoliryError(T data) {
		return new CommonResult<T>(CommonCode.RESULT_SECURITY_POLICY_ERROR, data);
	}

	/**
	 * @param data
	 * @param message
	 * @Author <wangjian>
	 * @Description 密码不符合安全策略
	 * @Date: 21/12/22 11:43
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> securityPoliryError(T data, String message) {
		return new CommonResult<T>(CommonCode.RESULT_SECURITY_POLICY_ERROR.getCode(), message, data);
	}

	/**
	 * @Author <wangjian>
	 * @Description 密码到期，更换密码
	 * @Date: 21/12/22 12:04
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> passwordExpiration() {
		return new CommonResult<T>(CommonCode.RESULT_PASSWORD_EXPIRATION);
	}

	/**
	 * @param data
	 * @Author <wangjian>
	 * @Description 密码到期，更换密码
	 * @Date: 21/12/22 12:04
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> passwordExpiration(T data) {
		return new CommonResult<T>(CommonCode.RESULT_PASSWORD_EXPIRATION, data);
	}

	/**
	 * @param data
	 * @param message
	 * @Author <wangjian>
	 * @Description 密码到期，更换密码
	 * @Date: 21/12/22 12:04
	 * @return: com.yz.integration.framework.common.CommonResult<T>
	 */
	public static <T> CommonResult<T> passwordExpiration(T data, String message) {
		return new CommonResult<T>(CommonCode.RESULT_PASSWORD_EXPIRATION.getCode(), message, data);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
