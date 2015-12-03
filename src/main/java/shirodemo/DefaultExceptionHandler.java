package shirodemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by juxinli on 2015/12/02.
 *
 */
@ControllerAdvice
public class DefaultExceptionHandler  {

    private static final Log logger = LogFactory.getLog(DefaultExceptionHandler .class);

//    @ExceptionHandler({UnauthenticatedException.class})
//    @ResponseStatus(HttpStatus.FORBIDDEN)
//    public String handleUnauthenticatedException(HttpServletRequest request, Model model, Exception ex) {
//        model.addAttribute("code", HttpStatus.FORBIDDEN);
//        model.addAttribute("Requested", request.getRequestURL());
//        model.addAttribute("message", ex.toString());
//        return "/unauthenticated";
//    }

    @ExceptionHandler({UnauthorizedException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ModelAndView handleUnauthorizedException(NativeWebRequest request, UnauthorizedException ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("code",HttpStatus.UNAUTHORIZED);
//        mv.addObject("Requested", request.getNativeRequest());
        mv.addObject("exception", ex.toString());
        mv.setViewName("/unauthorized");
        return mv;
    }

//    public String handleUnauthorizedException(HttpServletRequest request, Model model, UnauthorizedException ex) {
//        model.addAttribute("code", HttpStatus.UNAUTHORIZED);
//        model.addAttribute("message", ex.toString());
//        return "/unauthrized";
//    }

}
