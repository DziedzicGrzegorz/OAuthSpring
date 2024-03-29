package dziedzic.dev.oauth.controller;

import dziedzic.dev.oauth.entity.UserRole;
import dziedzic.dev.oauth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user/{email}")
    public void changeToAdmin(@PathVariable String email) {
        userService.findByEmail(email).ifPresent(userEntity -> {
            userEntity.setRole(UserRole.ROLE_ADMIN);
            userService.save(userEntity);
        });
    }
}
