package com.care.root;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MailComtroller {
	@Autowired MailService ms;
	
	@GetMapping("send_mail")
	public void sendMail(HttpServletResponse res) throws IOException {
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print("메일을 전송헀습니다");
	}
}
