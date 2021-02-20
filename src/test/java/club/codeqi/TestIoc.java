package club.codeqi;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    @Test
    public void testAccountService(){
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Object accountService = ac.getBean("accountService");
        System.out.println(accountService);
        ac.close();
    }
}
