package com.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.project.pojo.User;
import com.project.util.Const;
/**
 * 类名称：登录过滤，权限验证
 * @author G50
 *
 */
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		String path = request.getServletPath();
		if(path.matches(Const.NO_INTERCEPTOR_PATH)){
			return true;
		}else{
			User user = (User) request.getSession().getAttribute(Const.SESSION_USER);
			if(null != user){
				return true;
			}
			response.sendRedirect(request.getContextPath() + Const.MAIN_TOLOGIN + ".do");
			return false;
		}
	}
}
