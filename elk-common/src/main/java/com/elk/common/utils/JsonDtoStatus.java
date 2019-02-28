package com.elk.common.utils;

/**
 * 返回信息状态码
 */
public interface JsonDtoStatus {
	// 未登陆
	public static final Integer NO_LOGGIN = -1;
	public static final String NO_LOGGIN_INFO = "请登录后重试";

	// 成功
	public static final Integer OK = 200;
	public static final String OK_INFO = "操作成功";

	// 失败
	public static final Integer FAILE = 201;
	public static final String FAILE_INFO = "操作失败";
	
	// 数据操作失败
	public static final Integer DATA_FILE = 300;
	public static final String DATA_FILE_INFO = "数据操作失败";
	
	// 获取token失败
	public static final Integer TOKEN_FILE = 202;
	public static final String TOKEN_FILE_INFO = "获取token失败";

	// 缺少参数的错误
	public static final Integer PARAM_MISSING = 101;
	public static final String PARAM_MISSING_INFO = "缺少参数";

	public static final Integer INVALID_PARAM = 102;
	public static final String INVALID_PARAM_INFO = "参数{0}值错误";

	// 分页
	public static final Integer PAGE_UNKNOW_OPER = 110;
	public static final String PAGE_UNKNOW_OPER_INFO = "未知的翻页类型";

	public static final Integer PAGE_UNKNOW_TARGET = 111;
	public static final String PAGE_UNKNOW_TARGET_INFO = "无法获得分页页数信息";

	// 未归类的错误
	public static final Integer UNCLASSIFIED_ERROR = 998;

	// 未知错误
	public static final Integer ERROR_UNKNOW = 500;
	public static final String ERROR_UNKNOW_INFO = "服务内部错误";
	
	public static final String INFO_HAVE_EXIST = "信息已存在，不可重复添加！";
	
	public static final String EXCEPT_SPLIT = "requestException";

}
