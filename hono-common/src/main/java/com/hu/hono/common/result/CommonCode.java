package com.hu.hono.common.result;

/**
 * @author <wangjian>
 * @version v1.0
 * @title CommonCode
 * @projectName integration
 * @description 公共错误码
 * @date 2021/4/22 9:52
 */
@SuppressWarnings({"unused"})
public enum CommonCode {

	/**
	 * 前后端约定相应状态码
	 */
	RESULT_SUCCESS(10000, "操作成功"),
	RESULT_ERROR(10001,"操作失败"),
	RESULT_UNAUTHORIZED(10002,"未登录或token过期"),
	RESULT_FORBIDDEN(10003,"未授权"),
	RESULT_VALIDATE_FAILED(10004,"参数不齐全或参数错误"),
	RESULT_NOTHINGNESS(10005,"您访问的资源不存在或已销毁"),
	RESULT_UNREGISTER(10006, "未注册应用"),
	RESULT_SIGNATURE(10007, "签名错误"),
	RESULT_BLOCKHANDLER(10008, "服务限流"),
	RESULT_FALLBACK(10009, "服务熔断"),
	RESULT_MQERROR(10010, "发送MQ消息错误"),
	RESULT_SECURITY_POLICY_ERROR(10011, "密码安全策略不符合"),
	RESULT_PASSWORD_EXPIRATION(10012, "密码到期，更换密码"),
	RESULT_OTHER(99999,"其它错误");

	private Integer code;
	private String message;

	CommonCode(Integer code, String message) {
		this.setCode(code);
		this.setMessage(message);
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

	@Override
	public String toString() {
		return "CommonCode{" + "code=" + code + ", message='" + message + '\'' + '}';
	}

}
