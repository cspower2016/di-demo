package br.com.cs.didemo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import br.com.cs.didemo.examplesbeans.FakeDataSource;
import br.com.cs.didemo.examplesbeans.JmsDataSource;

@Configuration
@PropertySource({ "classpath:cs.properties", "classpath:jms.properties" })
public class PropertyConfig {

	@Autowired
	Environment env;

	// Somehow exporting CS_USERNAME AS ENV VARIABLR CAN OVERRIDE THIS ;)

	@Value("${cs.username}")
	private String userName;

	@Value("${cs.password}")
	private String password;

	@Value("${cs.url}")
	private String url;

	// WE CAN ALSO ACESS ANY ENV VAR JUST INCLUDING THE VALUE ANNOTION
	@Value("${CS_USERNAME}")
	private String userNameFromEnv;

	@Value("${jms.username}")
	private String jmsUserName;

	@Value("${jms.password}")
	private String jmsPassword;

	@Value("${jms.url}")
	private String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUserName(userName);
		// OR WE CAN GET IT FROM ENV OBJECT
		System.out.println("FROM ENV" + userNameFromEnv);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}

	@Bean
	public JmsDataSource jmsDataSource() {
		JmsDataSource jmsDataSource = new JmsDataSource();
		jmsDataSource.setJmsUserName(jmsUserName);
		jmsDataSource.setJmsPassword(jmsPassword);
		jmsDataSource.setJmsUrl(jmsUrl);
		return jmsDataSource;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}

}
