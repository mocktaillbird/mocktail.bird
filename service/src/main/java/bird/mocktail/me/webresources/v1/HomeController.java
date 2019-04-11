package bird.mocktail.me.webresources.v1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = "/")
    public String index(Model model) {
		System.out.println("opening index page");
        return "index.html";
    }

}
