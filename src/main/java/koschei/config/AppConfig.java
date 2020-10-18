package koschei.config;

import koschei.business.components.impl.Island;
import koschei.business.components.impl.Wood;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei.business")
public class AppConfig {

    @Bean
    public static Island getIsland(Wood wood) {
        return new Island(wood);
    }
}
