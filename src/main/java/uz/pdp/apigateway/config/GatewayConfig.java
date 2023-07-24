//package uz.pdp.apigateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayConfig {
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("USER-SERVICE", r -> r
//                        .path("/user/**")  // Path pattern to match
//                        .uri("http://localhost:8080")) // Backend service URL
//                .build();
//    }
//}
