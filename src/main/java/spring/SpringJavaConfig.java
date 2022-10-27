package spring;

import javafx.fxml.FXMLLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfig {

    @Bean
    public FXMLLoader rootLayout() {
        return new FXMLLoader(getClass().getResource("/fxml/RootLayout.fxml"));
    }
}
