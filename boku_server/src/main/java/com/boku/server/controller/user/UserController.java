package com.boku.server.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boku.server.dao.DBAccessor;
import com.boku.server.entity.User;
import com.boku.server.utils.XmlParseUtils;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	DBAccessor accessor;
	@RequestMapping(value="/addUser",method=RequestMethod.POST)	
	public @ResponseBody JSONObject addUser() throws Exception{
		Map<String,Object> map = new HashMap<>();
		User user = new User();
		user.setUsername("景秀");
		user.setPassword("lovely");
		accessor.init();
		XmlParseUtils xmlPathUtils = new XmlParseUtils();
		xmlPathUtils.getContentValue(null, null, null);
		accessor.begin();
		accessor.insert(user);
		accessor.commit();
		map.put("isSuc","成功");
		
		return JSONObject.fromObject(map);
	}
}
