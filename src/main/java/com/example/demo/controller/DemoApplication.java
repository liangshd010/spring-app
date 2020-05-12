package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.service.MailService;
import com.example.demo.service.StudentServerImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@MapperScan("com.example.demo")
@RestController
@SpringBootApplication
@ComponentScan(value="com.example.demo")
public class DemoApplication {

	@Autowired
	private StudentServerImpl studentServer;

	@Autowired
	private MailService mailService;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("application is started");
	}

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/getStudentList")
	public List<Student> getStudentList() {
		return studentServer.getStudentList();
	}

	@RequestMapping("/sendEmail")
	public String sendEmail() {
		String TO = "xxx@qq.com";
		String SUBJECT = "测试邮件";
		String CONTENT = "test content";
		mailService.sendSimpleMailMessage(TO,SUBJECT,CONTENT);
		return "Sending message";
	}

}
