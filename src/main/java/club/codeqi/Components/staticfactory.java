package club.codeqi.Components;

import club.codeqi.pojo.Account;

/**
 * @Author: codeqi
 * @Description:
 * @Date: create in 2021/2/20 0020 21:02
 */
public class staticfactory {
    public static Account getAccount() {
        Account account = new Account();
        account.setName("zhangsan");
        account.setCardNo("cartno");
        account.setMoney(1000);
        return account;
    }
}
