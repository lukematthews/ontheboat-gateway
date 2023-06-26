package au.com.ontheboat.gateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfiguration {
    @Value("${au.com.ontheboat.hosts.api}")
    private String apiHost;
    @Value("${au.com.ontheboat.hosts.keycloak}")
    private String authHost;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/api/**").uri(apiHost))
                .route(p -> p.path("/auth/**").uri(authHost))
                .build();
    }
}
