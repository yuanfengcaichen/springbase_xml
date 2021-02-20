package club.codeqi.Controller;

import club.codeqi.pojo.Account;
import club.codeqi.service.AccountService;

import java.util.List;

public class AccountController {
    private AccountService accountService;
    public List<Account> findAll(){
        return accountService.findAll();
    }
}
