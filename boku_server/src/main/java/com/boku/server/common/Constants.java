package com.boku.server.common;
/**
 * 
 * Copyright：2016-Amyway  
 * Project name：boku_server     
 *  
 * Class decription：  定义boku_server中常用的一些常量
 * Class name：com.boku.server.common.Constants       
 * Author：Sure-xujian  
 * Create date：2016年3月28日 下午5:09:48
 */
public class Constants {
	//定义存储sql的xml文件中的节点名称
	/**
	 * xml文件根节点
	 */
	public static final String rootElement = "xqls";
	
	/**
	 * sql语句属性节点
	 */
	public static final String secondLevelElement = "xql";
	
	/**
	 * sql语句名称属性
	 */
	public static final String name = "name";
	
	/**
	 * 节点存储内容的类型
	 */
	public static final String type = "type";
	
	/**
	 * sql语句的参数节点
	 */
	public static final String param = "param";
	
	/**
	 * 参数别名
	 */
	public static final String alias = "alias";
	
	/**
	 * 相关的java类
	 */
	public static final String defClass = "defClass";
	
	/**
	 * 查询结果返回节点
	 */
	public static final String returnType = "return";
	
	/**
	 * sql语句内容存放节点
	 */
	public static final String content = "content";
}
