//: jdbc.config.AppConfig.java


package jdbc.config;


import jdbc.domain.model.Purchase;
import jdbc.repository.PurchaseRowMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.core.RowMapper;


@Configuration
@ComponentScan(basePackages = {"jdbc.repository", "jdbc.service"})
class AppConfig {

    @Bean
    RowMapper<Purchase> purchaseRowMapper() {
        return new PurchaseRowMapper();
    }

}///:~