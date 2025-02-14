package bf.tdev.consulting;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info=@Info(
				title = "Accounts microservice REST API Documentation",
				description = "EasyBank Accounts Microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Thierry Tewendé",
						email = "kimathierry@gmail.com",
						url = "https//:tewendekima.web.app"
				),
				license = @License(
						name = "Apache 3.0"
				)
		),
				externalDocs = @ExternalDocumentation(
                      description = "EazyBank Account microservice REST API Documentation",
						url = "https://www.eazybytes.com/swagger-ui.html"

				)

)
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
