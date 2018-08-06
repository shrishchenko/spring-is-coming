package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import requests.Authorization;

@RestController
public class AuthorizationController {

    private int id;

    @RequestMapping("/hello")
        public Authorization authorization(@RequestParam(value="id") int id) {
            return new Authorization(id);
        }

}
