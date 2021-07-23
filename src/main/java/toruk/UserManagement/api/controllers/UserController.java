package toruk.UserManagement.api.controllers;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import toruk.UserManagement.business.abstracts.UserService;
import toruk.UserManagement.core.utilities.results.DataResult;
import toruk.UserManagement.core.utilities.results.Result;
import toruk.UserManagement.dataAccess.abstracts.UserDao;
import toruk.UserManagement.entities.concretes.User;

import javax.security.auth.Subject;
import javax.security.auth.callback.*;
import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public DataResult<List<User>> getAll(){
//        return
        return this.userService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user){
        return this.userService.add(user);
    }
    @PostMapping("/registerNewUserAccount")
    public Result registerNewUserAccount(@RequestBody User user){
        return  this.userService.registerNewUserAccount(user);
    }

    @PostMapping("/loginAccount")
    public Result loginAccount(String un, String password){
        return  this.userService.loginAccount(un, password);
    }

}
