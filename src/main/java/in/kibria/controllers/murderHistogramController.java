package in.kibria.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(path={"murder/histogram"})
public class murderHistogramController  {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "logs/chartb1";
    }
}
