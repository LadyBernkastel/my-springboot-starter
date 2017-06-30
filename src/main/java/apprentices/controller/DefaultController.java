package apprentices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import apprentices.service.DefaultService;

@RestController
@RequestMapping("/")
public class DefaultController {

    DefaultService defaultService;

    @Autowired
    public DefaultController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    @GetMapping
    public String getDefault() {
        return defaultService.getResponse();
    }

}
