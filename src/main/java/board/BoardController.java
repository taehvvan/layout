package board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@RequestMapping("index")
	public String index(Model model) {
		model.addAttribute("page", "board/" + "index");
		return "index";		// 기본 경로에 return 문자열이 합쳐져서 jsp 호출
							// views/index.jsp를 실행
	}
}
