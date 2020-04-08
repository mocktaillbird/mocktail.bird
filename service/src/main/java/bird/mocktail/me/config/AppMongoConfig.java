package bird.mocktail.me.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@Configuration
public class AppMongoConfig {
  @Autowired 
  private MongoDbFactory mongoDbFactory;
 
  @Autowired 
  private MongoMappingContext mongoMappingContext;
 
  @Bean
  public MappingMongoConverter mappingMongoConverter() {
 
    DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);
    MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, mongoMappingContext);
    converter.setTypeMapper(new DefaultMongoTypeMapper(null));
 
    return converter;
  }
}