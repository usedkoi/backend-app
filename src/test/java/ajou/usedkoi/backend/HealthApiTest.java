package ajou.usedkoi.backend;

import ajou.usedkoi.backend.presentation.api.HealthApi;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
public class HealthApiTest {

    @Test
    public void testHealthOK(){
        var api = new HealthApi();
        var health = api.getHealth();
        assertThat(health.getStatus()).isEqualTo("OK");
    }
}
