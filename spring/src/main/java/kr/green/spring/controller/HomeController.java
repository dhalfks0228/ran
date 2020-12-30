package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.vo.UserVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homeGet(String name) {
		System.out.println("이름(get) : " + name);
		//http://localhost:8080/spring/?name=임꺽정
		return "main/home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String homePost(String name, String fruit) {
		System.out.println("이름(post) : " + name);
		System.out.println("과일(post) : " + fruit);
		return "main/home";
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testGet(Model model) {
		//model.addAttribute("변수명", 값);
		//값으로 문자열, 정수, 실수, 객체 등 다양한 값들을 보낼 수 있다.
		model.addAttribute("name", "홍길동");
		return "main/test";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupGet() {

		return "main/signup";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(Model model, UserVo user) {
		System.out.println(user);
		model.addAttribute("user", user);
		return "redirect:/";
	}
	@RequestMapping(value = "/tiles", method = RequestMethod.GET)
	public ModelAndView tilesGet(ModelAndView mv) {
		mv.setViewName("/main/tiles");
		return mv;
	}
}
