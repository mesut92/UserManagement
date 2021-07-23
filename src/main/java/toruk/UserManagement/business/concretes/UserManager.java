package toruk.UserManagement.business.concretes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import toruk.UserManagement.core.utilities.results.*;
import org.springframework.beans.factory.annotation.Autowired;
import toruk.UserManagement.business.abstracts.UserService;
import toruk.UserManagement.dataAccess.abstracts.UserDao;
import toruk.UserManagement.entities.concretes.User;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Kullanıcı Listelendi");
    }
    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı Eklendi");
    }

    @Override
    public Result registerNewUserAccount(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı Eklendi");
    }

    @Override
    public Result loginAccount(String un, String password){
        User user1 = this.userDao.findByUserName(un);
        if (user1.getPassword().equals(password)){
            return new SuccessResult("Giriş yapıldı");
        }
        else{
            return new ErrorResult("Giriş yapılamadı");
        }
    }
}

