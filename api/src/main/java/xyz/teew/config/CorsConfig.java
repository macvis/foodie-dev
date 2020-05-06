package xyz.teew.config;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 跨域配置
 * @author youchao.wen
 * @date 2020/5/3.
 */
@Configuration
@NoArgsConstructor
public class CorsConfig {

    @Bean
    public CorsFilter init(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://localhost:8080");
        //是否发送cookie信息
        corsConfiguration.setAllowCredentials(true);
        //设置允许请求的方式
        corsConfiguration.addAllowedMethod("*");
        //允许的请求头
        corsConfiguration.addAllowedHeader("*");

        //添加跨域路径
        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
        corsConfigurationSource.registerCorsConfiguration("/*", corsConfiguration);

        return new CorsFilter(corsConfigurationSource);
    }
}
