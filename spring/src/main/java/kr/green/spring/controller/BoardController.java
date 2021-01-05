package kr.green.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.service.BoardService;
import kr.green.spring.vo.BoardVo;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public ModelAndView homeGet(ModelAndView mv) {
		//여러개의 게시글을 가져오기 위해 리스트 사용. 
		ArrayList<BoardVo> list = boardService.getBoardList();
		mv.addObject("list", list);
		mv.setViewName("/board/list");
		return mv;
	}
}
