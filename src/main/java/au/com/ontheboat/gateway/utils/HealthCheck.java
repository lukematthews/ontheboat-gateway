package au.com.ontheboat.gateway.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class HealthCheck {
    public static void main(String... args) {
        try {
            Map status = new ObjectMapper().readValue(new URL("http://localhost:8001/actuator/health"), Map.class);
            System.out.println(status.get("status"));
        } catch (IOException e) {
            System.out.println("DOWN");
            System.exit(1);
        }
    }
}
