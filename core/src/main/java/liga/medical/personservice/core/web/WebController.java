package liga.medical.personservice.core.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String mainPage() {
        return "main_page";
    }

    @GetMapping("/admin_page")
    public String getAdminPage() {
        return "admin_page";
    }

    @GetMapping("/user_page")
    public String getUserPage() {
        return "user_page";
    }
}
