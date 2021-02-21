package club.codeqi.Components;

import club.codeqi.pojo.Account;

/**
 * @Author: codeqi
 * @Description:
 * @Date: create in 2021/2/20 0020 21:09
 */
public class targetfactory {
    public Account getAccount() {
        Account account = new Account();
        account.setName("wangwu");
        account.setCardNo("cartno");
        account.setMoney(9999);
        return account;
    }
}
