package com.boku.server.dao.impl;

public interface IDBAccessor<K,V> {
	/**
	 * 
	 * @Title: 初始化数据库链接 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @throws Exception
	 */
	public void init() throws Exception;
	
	/**
	 * 
	 * @Title: begin  
	 * @Description: 开启事务
	 * @throws Exception
	 */
	public void begin() throws Exception;
	
	/**
	 * 
	 * @Title: commit  
	 * @Description: 提交事务
	 * @throws Exception
	 */
	public void commit() throws Exception;
	
	/**
	 * 
	 * @Title: roolback  
	 * @Description: 事务提交异常时回滚事务 
	 * @throws Exception
	 */
	public void roolback() throws Exception;
	
	/**
	 * 
	 * @Title: insert  
	 * @Description: 向数据库中插入一个对象
	 * @param vo 一个javabean对象
	 * @return
	 * @throws Exception
	 */
	public boolean insert(V vo) throws Exception;
}
