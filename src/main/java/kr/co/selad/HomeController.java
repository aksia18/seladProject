package kr.co.selad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("-----HomeController() 객체 생성됨");
	}
	
	@RequestMapping("/home.do")
	public ModelAndView home() {
		ModelAndView mav=new ModelAndView();
		// redirect : 등록한 명령어를 호출할 수 있다
		mav.setViewName("index");
		return mav;
	}
	
}