package hello;

import hello.config.MyDataSourceEnvConfig;
import hello.config.MyDataSourceValueConfig;
import hello.datasource.MyDataSourcePropertiesV2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(MyDataSourceEnvConfig.class)
//@Import(MyDataSourceValueConfig.class)
@Import(MyDataSourcePropertiesV2.class)
@SpringBootApplication(scanBasePackages = "hello.datasource")
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}
