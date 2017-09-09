package cn.gson.oasys.controller.system;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gson.oasys.model.dao.BlogDao;
import cn.gson.oasys.model.entity.Blog;


@Controller
@RequestMapping("/")
public class TypeSysController {
	
	@RequestMapping("testsystype")
	public String testsystype(){
		return "systemcontrol/typemanage";
	}
	
	@RequestMapping("typeedit")
	public String typeEdit(){
		return "systemcontrol/typeedit";
	}

}
