package com.used.apple.handlers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.used.apple.service.AdminLoginService;


@Controller
public class AdminLoginHandler {
	
	@Autowired
	private AdminLoginService adminLoginService;
	final Logger logger=LoggerFactory.getLogger(this.getClass());
	@RequestMapping("login.do")
	public String login(HttpServletRequest request,HttpServletResponse response) throws IOException {

		String username = request.getParameter("username");  
		String password = request.getParameter("password"); 
		PrintWriter pw = response.getWriter();  
         
        if(username!=null && password!=null && !password.equals("") && !username.equals("")) {
			String returnPassword = adminLoginService.getPassord(username);			
			if(password.equals(returnPassword)) {
				pw.print("Welcome!");
				logger.info("密码输入正确！用户："+username);
				return "manager";
				}			
			pw.print("用户名或密码不正确！");
			return "admin_login";
			}
        pw.print("请输入用户名和密码！");
        return "admin_login";
        }
        

	
	@RequestMapping("admin_login")
	public String admin_login() {
		
		return "admin_login";
	}

}
