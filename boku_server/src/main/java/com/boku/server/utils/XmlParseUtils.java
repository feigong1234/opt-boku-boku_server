package com.boku.server.utils;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.boku.server.common.Constants;
/**
 * 
 * Copyright：2016-Amyway  
 * Project name：boku_server     
 *  
 * Class decription：  用于解析存储sql语句的xml
 * Class name：com.boku.server.utils.XmlParseUtils       
 * Author：Sure-xujian  
 * Create date：2016年3月28日 下午2:27:33
 */
public class XmlParseUtils {
	/**
	 * 
	 * @Title: getSQLContent  
	 * @Description: 获取content节点中的准确sql内容
	 * @param sqlName
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public String getContentValue(String fileName,String sqlName,Map map) throws Exception{
		SAXReader reader = new SAXReader();
		String xmlFilePath = "/xqlFiles/boku.xml";
		File xmlFile = new File(XmlParseUtils.class.getResource(xmlFilePath).getFile());//获取相对于classes目录中的文件
		Document doc = reader.read(xmlFile);
		Element root = doc.getRootElement();
		Element suitedElement = getAssignedElement(root,Constants.name,"queryUser");
		String sqlValue = getPropertyValue(suitedElement,Constants.content);
		return null;
	}
	
	
	/**
	 * 
	 * @Title: getAssignedElement  
	 * @Description: 获取x属性是x值的整个节点
	 * @param element
	 * @param property
	 * @param val
	 * @return
	 */
	public Element getAssignedElement(Element element,String property,String val){
		Element suitedElement = null;
		for(Iterator iter = element.elementIterator();iter.hasNext();){
			Element ele = (Element) iter.next();
			Attribute attribute = ele.attribute(property);
			if(null!=attribute){
				String value = attribute.getValue();
				if(value!=null && val.equals(value)){
					suitedElement = ele;
				}else{
					getAssignedElement(ele,property,val);
				}
			}
		}
		return suitedElement;
	}
	
	/**
	 * 
	 * @Title: getContent  
	 * @Description: 获取property节点中的值
	 * @return
	 */
	public String getPropertyValue(Element element,String property){
		for(Iterator iter = element.elementIterator();iter.hasNext();){
			//Element.ele
		}
		Attribute attribute = element.attribute(property);
		String propertyValue = attribute.getValue();
		return propertyValue;
	}
}
