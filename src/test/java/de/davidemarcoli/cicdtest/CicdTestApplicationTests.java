package de.davidemarcoli.cicdtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.objenesis.SpringObjenesis;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@SpringBootTest
class CicdTestApplicationTests {

//    @Value("${PORT}")
//    Integer port;
//
//    RestTemplate restTemplate = new RestTemplate();
//
//    @Test
//    void testEndpoint() {
//        String url = "http://localhost:" + port + "/";
//        String result = restTemplate.getForObject(url, String.class);
//        assert Objects.equals(result, "Hello World!");
//    }
}
