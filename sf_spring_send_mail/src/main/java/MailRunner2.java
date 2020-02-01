import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

/**
 * 用DI方式实现
 */
@Configuration
@PropertySource("classpath:application.properties")
public class MailRunner2 implements ApplicationContextAware {

    public void sendMail(String sendTo) throws MessagingException {
        //需要配置文件配置，否则返回null
        JavaMailSenderImpl sender = applicationContext.getBean(JavaMailSenderImpl.class);
        sender.setHost(host);//发件邮箱
        sender.setUsername(username);//*1
        sender.setPassword(password);
        sender.setPort(Integer.parseInt(port));
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setFrom(username);//与*1要一致，不配置会报错
        helper.setSubject("TestMail Type I");
        helper.setTo(sendTo);//收件邮箱
        helper.setText("A test mail from me.");//邮件内容
        helper.setSentDate(new Date());
        sender.send(message);

        //report
        String report = String.format("发送成功！\n"
                + "From:  %s\n"
                + "To:  %s", username, sendTo);
        System.out.println(report);
    }

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MailRunner2.class);
        MailRunner2 mr = ac.getBean(MailRunner2.class);
        String sendTo = "xx@163.com";
        try{
            mr.sendMail(sendTo);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    ApplicationContext applicationContext;
    String host;
    String username;
    String password;
    String port;

    @Autowired
    public void setUsername(@Value("${spring.mail.username}") String username) {
        this.username = username;
    }

    @Autowired
    public void setPassword(@Value("${spring.mail.password}") String password) {
        this.password = password;
    }

    @Autowired
    public void setPort(@Value("${spring.mail.port}") String port) {
        this.port = port;
    }

    @Autowired
    public void setHost(@Value("${spring.mail.host}") String host) {
        this.host = host;
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
