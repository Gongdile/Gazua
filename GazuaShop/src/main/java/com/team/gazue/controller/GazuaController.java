package com.team.gazue.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.gazue.service.GazuaService;
import com.team.gazue.vo.BoardVO;

@Controller
public class GazuaController {

	@Inject
	GazuaService gazuaService;

	private static final Logger logger = LoggerFactory.getLogger(GazuaController.class);

	@RequestMapping(value = "/main")
	public String mainUrl(Model model) {

		return "main";
	}

	@RequestMapping(value = "/list")
	public String category(Model model, @RequestParam("category") String category) throws Exception {

		model.addAttribute("list", gazuaService.selectList(category));
		return "list";
	}

	@RequestMapping(value = "/insert")
	public String insert(Model model, BoardVO vo) throws Exception {
		gazuaService.insert(vo);
		return "redirect:/list?category=" + vo.getCategory();
	}

	@RequestMapping(value = "/update")
	public String update(Model model, BoardVO vo) throws Exception {
		gazuaService.update(vo);
		return "redirect:/detailForm?seq=" + vo.getSeq();
	}

	@RequestMapping(value = "/delete")
	public String delete(Model model, @RequestParam int seq) throws Exception {
		gazuaService.delete(seq);
		return "redirect:/main";
	}

	@RequestMapping(value = "/detailForm")
	public String detailForm(Model model, @RequestParam int seq) throws Exception {
		model.addAttribute("list", gazuaService.selectOne(seq));
		return "detailForm";
	}

	@RequestMapping(value = "/insertForm")
	public String insertForm(Model model) throws Exception {
		return "insertForm";
	}

	@RequestMapping(value = "/modifyForm")
	public String modifyForm(Model model, @RequestParam int seq) throws Exception {
		model.addAttribute("list", gazuaService.selectOne(seq));
		return "modifyForm";
	}
	
	@RequestMapping(value = "/mypage")
	public String myPage() {

		return "mypage";
	}
}
