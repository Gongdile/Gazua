package com.team.gazue.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.team.gazue.service.GazuaService;
import com.team.gazue.vo.MemberVO;

@Controller
public class GazuaController {

	@Autowired
	GazuaService gazuaService;

	private static final Logger logger = LoggerFactory.getLogger(GazuaController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {

		// TO DO make logic

		return "login";
	}

	@RequestMapping(value = "/select")
	public List<MemberVO> select() {
		List<MemberVO> list = null;
		try {
			list = gazuaService.selectList();
			System.out.println(list.get(0).getUser_addr());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
