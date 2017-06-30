package apprentices.service;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultServiceTest {

    private DefaultService defaultService;

    @Before
    public void beforeEachTest() throws Exception {
        defaultService = new DefaultService(null);
    }

    @Test
    public void shouldReturnExpectedResponse() throws Exception {
        assertThat(defaultService.getResponse()).isEqualTo("This is a default response from the Service");
    }
}