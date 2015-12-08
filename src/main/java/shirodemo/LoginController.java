//package shirodemo;
//
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///**
// * Created by juxinli on 2015/12/01.
// */
//@Controller
//public class LoginController {
//
//    @RequestMapping(value="/login", method= RequestMethod.GET)
//    public String view(HttpServletRequest request, Model model) throws IOException {
//        return "/login";
//    }
//
//    @RequestMapping(value="/login", method= RequestMethod.POST)
//    public String doLogin(HttpServletRequest request, Model model) throws IOException {
//        String userName = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
//        try {
//            subject.login(token);
//            //登录成功，调到主页面
//            model.addAttribute("account", subject.getPrincipals().oneByType(java.util.Map.class));
//            return "/home";
//        } catch (AuthenticationException e) {
//            //登录不成功，跳回登录页面
//            return "/login";
//        }
//    }
//}
