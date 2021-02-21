package club.codeqi.AOP;

/**
 * @Author: codeqi
 * @Description:
 * @Date: create in 2021/2/21 0021 11:48
 */
public class Enhance {
    public void beforeMethod(){
        System.out.println("this is before method");
    }
    public void afterMethod(){
        System.out.println("this is after method");
    }
}
