package club.codeqi.AOP;

/**
 * @Author: codeqi
 * @Description:
 * @Date: create in 2021/2/21 0021 11:49
 */
public class MyService {

    public String printService(){
        System.out.println("调用了业务逻辑中的 printService 方法");
        return "printService";
    }

}
