package dziedzic.dev.oauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/secret")
    public ResponseEntity<?> getSecretPage() {
        Map<String, String> secretData = new HashMap<>();
        secretData.put("data", "secret data");
        return ResponseEntity.ok(secretData);
    }
    @GetMapping("/free")
    public ResponseEntity<?> getFreePage() {
        Map<String, String> secretData = new HashMap<>();
        secretData.put("data", "free data");
        return ResponseEntity.ok(secretData);
    }
}
