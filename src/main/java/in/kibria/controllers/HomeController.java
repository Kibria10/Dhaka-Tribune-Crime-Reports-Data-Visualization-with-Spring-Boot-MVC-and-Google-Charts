package in.kibria.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(path={"/","chart"})
public class HomeController  {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {

        return "logs/index";
    }
}
