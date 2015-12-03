package shirodemo;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by juxinli on 2015/12/01.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @RequiresAuthentication
    @RequestMapping("/authenticated")
    public String authenticatedIndex(HttpServletRequest request, Model model) {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject!=null&&subject.isAuthenticated()) {
//            return "/account/index";
//        }
//        else {
//            return "/login";
//        }

        return "/account/onlyForAuthenticated";
    }

    @RequiresPermissions(value={"user:update"}, logical= Logical.AND)
    @RequestMapping("/authorized")
    public String authorizedIndex(HttpServletRequest request, Model model) {
        return "/account/onlyForAuthorized";
    }


}
