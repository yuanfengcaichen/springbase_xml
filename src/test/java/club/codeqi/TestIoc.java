package club.codeqi;


import club.codeqi.AOP.MyService;
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

    //测试延迟加载
    @Test
    public void lazyBeantest(){
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Object lazyBean = ac.getBean("lazyBean");
        System.out.println(lazyBean);
        ac.close();
    }

    //测试factoryBean
    @Test
    public void factoryBeantest(){
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        //获取到的是factoryBean类中的getObject方法返回的对象
        Object AccountBean = ac.getBean("accountFactorybean");
        System.out.println(AccountBean);

        //如果想获取当前这个FactoryBean（一般用不到），在获取Bean对象的时候，在Bean对象名称前加上`&`符合即可
        Object bean = ac.getBean("&accountFactorybean");
        System.out.println(bean);
        ac.close();
    }

    //测试AOP
    @Test
    public void testaop1(){
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        //获取业务逻辑对象
        MyService myService = (MyService) ac.getBean("myService");
        myService.printService();
        ac.close();
    }
}
