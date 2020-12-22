package cn.itcast.web.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 统一异常处理类
 *      HandlerExceptionResolver:只要实现该接口，控制器只要抛出异常，就会跳转到该接口的resolveException方法
 */
@Component
public class CustomExceptionResolver implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //把错误信息转换到error.jsp页面
        ModelAndView modelAndView = new ModelAndView();
        //设置错误信息
        modelAndView.addObject("errorMsg","发生错误啦："+ex.getMessage());
        //设置页面
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
