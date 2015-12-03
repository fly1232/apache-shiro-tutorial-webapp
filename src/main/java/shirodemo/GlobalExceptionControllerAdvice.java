package shirodemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * Created by juxinli on 2015/12/02.
 *
 */
@ControllerAdvice
public class GlobalExceptionControllerAdvice {

    private static final Log logger = LogFactory
            .getLog(GlobalExceptionControllerAdvice.class);

    @ExceptionHandler({UnauthenticatedException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String handleUnauthenticatedException(HttpServletRequest request, Model model, SQLException ex) {
        model.addAttribute("code", HttpStatus.FORBIDDEN);
        model.addAttribute("Requested", request.getRequestURL());
        model.addAttribute("message", ex.toString());
        return "/unauthenticated";
    }

    @ExceptionHandler({UnauthorizedException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String handleUnauthorizedException(HttpServletRequest request, Model model, SQLException ex) {
        model.addAttribute("code", HttpStatus.UNAUTHORIZED);
        model.addAttribute("Requested", request.getRequestURL());
        model.addAttribute("message", ex.toString());
        return "/unauthrized";
    }

}
