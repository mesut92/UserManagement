package toruk.UserManagement.business.abstracts;

import toruk.UserManagement.core.utilities.results.DataResult;
import toruk.UserManagement.core.utilities.results.Result;
import toruk.UserManagement.entities.concretes.User;

import javax.security.auth.Subject;
import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();
    Result add(User user);
    Result registerNewUserAccount(User user);
    Result loginAccount(String un, String password);
}
