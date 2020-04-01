package com.szboanda.meeting.interceptor;

import com.szboanda.meeting.user.cache.UserCache;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthHandlerInterceptor implements HandlerInterceptor {
    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userId = request.getHeader("userId");
        if (StringUtils.isEmpty(userId)) {
            //未登录,返回登录页面
            response.setContentType("text/html;charset=UTF-8");
            response.setHeader("Cache-Control", "no-cache");
            response.setCharacterEncoding("UTF-8");
//            response.getWriter().print("无权限");
            return true;
        }else {
            //放行
            boolean auth = UserCache.auth(userId);
            if(auth){
                return true;
            }else {
                response.setContentType("text/html;charset=UTF-8");
                response.setHeader("Cache-Control", "no-cache");
                response.setCharacterEncoding("UTF-8");
                response.getWriter().print("无权限");
                return false;
            }

        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
