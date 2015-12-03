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
public class LogoutController {

    @RequestMapping(value="/logout")
    public String doLogin(HttpServletRequest request, Model model) throws IOException {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "/home";
    }
}
