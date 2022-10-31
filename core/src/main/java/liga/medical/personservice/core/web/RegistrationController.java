package liga.medical.personservice.core.web;

import liga.medical.personservice.core.model.User;
import liga.medical.personservice.core.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class RegistrationController {
    private UserValidator userValidator;

    private UserService userService;

    public RegistrationController(UserValidator userValidator, UserService userService) {
        this.userValidator = userValidator;
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String getRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration_page";
    }

    @PostMapping("/registration")
    public String processRegistrationForm(@ModelAttribute User user, Model model) {
        if (!userValidator.isUserValid(user)) {
            model.addAttribute("error", "Кол-во символов в Логине и Пароле должно быть больше 8");
            return "registration_page";
        }
        if (userValidator.isUserNotValid(user)) {
            model.addAttribute("error", "Данный Логин занят. Пожалуйста, придумайте другой логин");
            return "registration_page";
        }
        userService.addUser(user);
        return "redirect:/login";
    }
}
