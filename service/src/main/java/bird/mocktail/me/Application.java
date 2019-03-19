package bird.mocktail.me;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("Starting the MockTail Bird.....");
	}
	
//	@Bean
//	UndertowEmbeddedServletContainerFactory embeddedServletContainerFactory() {
//		UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
//		factory.addBuilderCustomizers(
//				builder -> builder.setServerOption(UndertowOptions.ENABLE_HTTP2, true));
//		return factory;
//	}
	
}
