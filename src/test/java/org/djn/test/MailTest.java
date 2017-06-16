package org.djn.test;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.mail.util.MailSSLSocketFactory;



@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
public class MailTest {
	@Autowired 
	JavaMailSender mailSender;
	@Test
	public void mail163Test() {
		try {
			MimeMessage msg = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
			helper.setFrom("ezeduyun@163.com");
			helper.setTo("327803131@qq.com");
			helper.setText("tets this is a spring mvc email");
			helper.setSubject("邮件测试");
			mailSender.send(msg);
			System.out.println("email send ok");

		} catch (MessagingException e) {
			System.out.println("send fail");
			e.printStackTrace();
		}
	}
	@Test
	public void mailSinaTest() {
		try {
			MimeMessage msg = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
			helper.setFrom("changyanjx2@sina.com");
			helper.setTo("327803131@qq.com");
			helper.setText("tets this is a spring mvc email2222");
			helper.setSubject("邮件测试");
			mailSender.send(msg);
			System.out.println("email send ok");
			
		} catch (MessagingException e) {
			System.out.println("send fail");
			e.printStackTrace();
		}
	}
	@Test
	public void mailQQTest() {
//		try {
////			Properties props = new Properties();
////			// 开启debug调试
////		    props.setProperty("mail.debug", "true");
////		    // 发送服务器需要身份验证
////		    props.setProperty("mail.smtp.auth", "true");
////		    // 设置邮件服务器主机名
////		    props.setProperty("mail.host", "smtp.qq.com");
////		    // 发送邮件协议名称
////		    props.setProperty("mail.transport.protocol", "smtp");
////			
////			MailSSLSocketFactory sf = new MailSSLSocketFactory();
////		    sf.setTrustAllHosts(true);
////		    props.put("mail.smtp.ssl.enable", "true");
////		    props.put("mail.smtp.ssl.socketFactory", sf);
////		 
////		    Session session = Session.getInstance(props);
//			
//	
//			MimeMessage msg = mailSender.createMimeMessage();
//			MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
//			helper.setFrom("468084221@qq.com");
//			helper.setTo("327803131@qq.com");
//			helper.setText("tets this is a spring mvc email");
//			helper.setSubject("邮件测试");
//			mailSender.send(msg);
//			System.out.println("email send ok");
//			
//		} catch (Exception e) {
//			System.out.println("send fail");
//			e.printStackTrace();
//		}
		
		try {
			Properties props = new Properties();
			  
		    // 开启debug调试
		    props.setProperty("mail.debug", "true");
		    // 发送服务器需要身份验证
		    props.setProperty("mail.smtp.auth", "true");
		    // 设置邮件服务器主机名
		    props.setProperty("mail.host", "smtp.qq.com");
		    // 发送邮件协议名称
		    props.setProperty("mail.transport.protocol", "smtp");
		 
		    MailSSLSocketFactory sf = new MailSSLSocketFactory();
		    sf.setTrustAllHosts(true);
		    props.put("mail.smtp.ssl.enable", "true");
		    props.put("mail.smtp.ssl.socketFactory", sf);
		 
		    Session session = Session.getInstance(props);
		 
		    Message msg = new MimeMessage(session);
		    msg.setSubject("seenews 错误");
		    StringBuilder builder = new StringBuilder();
		    builder.append("url = " + "http://blog.csdn.net/never_cxb/article/details/50524571");
		    builder.append("\n页面爬虫错误");
//		    builder.append("\n时间 " + TimeTool.getCurrentTime());
		    msg.setText(builder.toString());
//		    msg.setFrom(new InternetAddress("**发送人的邮箱地址**"));
		    msg.setFrom(new InternetAddress("468084221@qq.com"));
		 
		    Transport transport = session.getTransport();
//		    transport.connect("smtp.qq.com", "**发送人的邮箱地址**", "**你的邮箱密码或者授权码**");
		    transport.connect("smtp.qq.com", "468084221@qq.com", "hdjrwfxfydzxcaaf");
		 
		    transport.sendMessage(msg, new Address[] { new InternetAddress("327803131@qq.com") });
		    transport.close();
		
		} catch (Exception e){
			System.out.println("send fail");
		}
		
	}
	@Test
	public void mailQQSSLTest() {
		try {
			MimeMessage msg = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
			helper.setFrom("468084221@qq.com");
			helper.setTo("327803131@qq.com");
			helper.setText("tets this is a spring mvc email2222");
			helper.setSubject("邮件测试QQ22");
			mailSender.send(msg);
			
			System.out.println("email send ok");
			
		} catch (MessagingException e) {
			System.out.println("send fail");
			e.printStackTrace();
		}
	}

}
