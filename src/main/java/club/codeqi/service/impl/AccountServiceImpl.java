package club.codeqi.service.impl;

import club.codeqi.dao.AccountDao;
import club.codeqi.dao.impl.AccountDaoImpl;
import club.codeqi.pojo.Account;
import club.codeqi.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

}
