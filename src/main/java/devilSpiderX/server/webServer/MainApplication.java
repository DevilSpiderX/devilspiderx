package devilSpiderX.server.webServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@ServletComponentScan
public class MainApplication {
    private static ConfigurableApplicationContext context = null;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MainApplication.class);
        context = app.run(args);
    }

    public static void close() {
        close(0);
    }

    public static void close(int Code) {
        int code = SpringApplication.exit(context, () -> Code);
        System.exit(code);
    }
}
