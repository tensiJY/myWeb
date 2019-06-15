package com.web.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.web.domain.BoardVO;
import com.web.service.BoardService;
import com.web.util.WebUtil;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService bs;
	
	@RequestMapping(value="/list", method={RequestMethod.GET})
	public String list(@RequestParam(value="nowPage", defaultValue="1")int nowPage, Model model) throws Exception{
		logger.info("/board/list");
		
		
		
		List<BoardVO> list = bs.getBoardList();
		
		model.addAttribute("nowPage", nowPage);
		model.addAttribute("Board", list);
		return "board/list";
	}
	
	@RequestMapping(value="/form" )
	public String writeForm(HttpSession session)throws Exception{
		session.setAttribute("UID", "admin");
		return WebUtil.idIsNull(session, "UID")==true? "redirect:./list.do" : "board/writeForm";	
	}
	

}// class end
