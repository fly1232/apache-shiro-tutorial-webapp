package shirodemo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by juxinli on 2015/12/01.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String index(HttpServletRequest request, Model model) throws IOException {
        Subject subject = SecurityUtils.getSubject();
        if (subject!=null&&subject.isAuthenticated()) {
            model.addAttribute("account", subject.getPrincipals().oneByType(java.util.Map.class));
        }
        return "/home";
    }


}
