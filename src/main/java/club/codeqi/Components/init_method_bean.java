package club.codeqi.Components;

public class init_method_bean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "init_method_bean{" +
                "name='" + name + '\'' +
                '}';
    }
    public void initBean(){
        System.out.println(" init_method_bean 对象创建了");
        this.name = "username";
        System.out.println(this.toString());
    }
    public void destoryBean(){
        System.out.println(" init_method_bean 对象销毁了");
    }
}
