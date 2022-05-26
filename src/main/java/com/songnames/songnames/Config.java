
@Bean
@Description("Thymeleaf Template Resolver")
public ServletContextTemplateResolver templateResolver() {
	ServletContextTemplateResolver templateresolver = new ServletContextTemplateResolver();
	templateResolver.setPrefix("/WEB-INF/views/");
	templateResolver.setSuffix(".html");
	templateResolver.setTemplateMode("HTML5");
	return templateResolver;
}


@Bean
@Description("Thymeleaf Template Engine")
public SpringTemplateEngine templateEngine() {
	SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	templateEngine.setTemplateResolver(templateResolver());
	templateEngine.setTemplateEngineMessageSource(messageSource());
	return templateEngnine;
}


@Bean
@Description("Thymeleaf View Resolver")
public ThymeleafViewResolver viewResolver() {
	ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	viewResolver.setTemplateEngine(templateEngine());
	viewResolver.setOrder(1);
	return viewResolver;
	}
}