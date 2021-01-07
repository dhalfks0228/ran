package kr.green.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.service.UserService;
import kr.green.test.vo.UserVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public  ModelAndView home(ModelAndView mv) {
		
		//abcd1234의 이메일을 가져옴
		String id = "abcd1234";
		UserVo user = userService.getUser(id);
		System.out.println(user);
		mv.setViewName("/main/home");
		
		return mv;
	}
	// localhost:8080/test까지 기본지정.
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public  ModelAndView loginGet(ModelAndView mv) {
		mv.setViewName("/main/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public  ModelAndView loginPost(ModelAndView mv, String id, String pw) {
		
		//boolean isUser = userService.isUser(id, pw);
		UserVo isUser = userService.isUser(id, pw);
		mv.addObject("user", isUser);
		System.out.println(id);
		System.out.println(pw);
		System.out.println("결과 : " + isUser);
		
		if(isUser != null ) {
			mv.setViewName("redirect:/"); // 로그인 성공
		}else {
			mv.setViewName("redirect:/login");//로그인 실패
		}
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public  ModelAndView signupGet(ModelAndView mv) {
		mv.setViewName("/main/signup");
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public  ModelAndView signupPost(ModelAndView mv, UserVo user ) {
		System.out.println(user);
		boolean signup = userService.signup(user);
		
		if(signup) {
			mv.setViewName("redirect:/");
		}else {
			mv.setViewName("redirect:/signup");
		}
		
		return mv;
	}
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public  ModelAndView signoutGet(ModelAndView mv, HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
	
}
