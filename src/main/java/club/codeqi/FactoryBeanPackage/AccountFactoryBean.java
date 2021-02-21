package club.codeqi.FactoryBeanPackage;

import club.codeqi.pojo.Account;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: codeqi
 * @Description:
 * @Date: create in 2021/2/21 0021 11:12
 */
public class AccountFactoryBean implements FactoryBean<Account> {

    private String Accountinfo;

    public void setAccountinfo(String accountinfo) {
        Accountinfo = accountinfo;
    }

    @Override
    public Account getObject() throws Exception {
        Account account = new Account();
        String[] split = Accountinfo.split(",");
        account.setName(split[0]);
        account.setMoney(Integer.valueOf(split[1]));
        account.setCardNo(split[2]);
        return account;
    }

    @Override
    public Class<?> getObjectType() {
        return Account.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
