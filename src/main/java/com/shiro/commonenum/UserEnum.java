package com.shiro.commonenum;

public enum UserEnum {

	NO_LOGIN(1001, "用户未登录"),
	NO_REGISTERED(1002, "用户未注册");

	private int code;
	private String info;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * 构造方法
	 * @param code 代码
	 * @param info  信息
	 */
	UserEnum(int code, String info) {
		this.code = code;
		this.info = info;
	}

	/**
	 * 根据code的值来获取相应的枚举对象
	 * @param code
	 * @return
	 */
	public static UserEnum getByCode (int code) {
		for (UserEnum item : values()) {
			if (item.code == code) {
				return item;
			}
		}
		return null;
	}


}
