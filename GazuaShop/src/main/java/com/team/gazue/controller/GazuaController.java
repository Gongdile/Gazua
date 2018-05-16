package com.team.gazue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.gazue.service.GazuaService;
import com.team.gazue.vo.MemberVO;

@Controller
public class GazuaController {

	@Autowired
	GazuaService gazuaService;

	private static final Logger logger = LoggerFactory.getLogger(GazuaController.class);

	@RequestMapping(value = "/main")
	public String mainUrl(Model model) {
		
		return "main";
	}
	
	@RequestMapping(value = "/list")
  public String category(Model model,
      @RequestParam String parameter) throws Exception {
    
	  List<MemberVO> resultList = gazuaService.selectList(parameter);
	  
	  model.addAttribute(resultList);
	  
    return "list";
  }
	
	@RequestMapping(value = "/mypage")
	public String myPage() {
	  
	  return "mypage";
	}
}
