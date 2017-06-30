package apprentices.service;

import apprentices.repository.DefaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultService {

    DefaultRepository defaultRepository;

    @Autowired
    public DefaultService(DefaultRepository defaultRepository) {
        this.defaultRepository = defaultRepository;
    }

    public String getResponse() {
        return "This is a default response from the Service";
    }
}
