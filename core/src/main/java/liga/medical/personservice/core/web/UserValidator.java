package liga.medical.personservice.core.web;

import liga.medical.personservice.core.mapping.UserMapper;
import liga.medical.personservice.core.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {
    private UserMapper userMapper;

    public UserValidator(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean isUserValid(User user) {
        if (user.getLogin() == null || user.getPassword() == null) {
            return false;
        }
        if (user.getLogin().length() < 9 || user.getPassword().length() < 9) {
            return false;
        }
        return true;
    }

    public boolean isUserNotValid(User user) {
        return userMapper.getUserByLogin(user.getLogin()) != null;
    }
}
