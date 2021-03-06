package com.memories.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义用户登录过滤器，未登录的用户访问资源会被跳转到登录页面
 * @author zzh
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/**
		//System.out.println("LoginInterceptor拦截成功-------");
	
		//获取请求的url 
		String url = request.getRequestURI();
		//判断url是否是公开地址（实际使用时将公开地址配置在配置文件中
		//这里公开地址是登录提交的网站
		if(url.indexOf("login.action")>=0) {
			//如果进行登录提交，放行
			return true;
		}
		
		//判断session
		HttpSession session  = request.getSession();
		//从session中取出用户的身份信息
		String username =(String) session.getAttribute("username");
		
		if(username != null) {
			//身份存在，放行
			return true;
		}
		
		//执行到了这里表示用户身份需要认证，挑战到登录页面
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

		return false;
			 
		 **/
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	
}
