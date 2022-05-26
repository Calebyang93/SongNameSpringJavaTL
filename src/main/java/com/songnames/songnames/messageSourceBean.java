package com.songnames.songnames

@Bean
@Description("Spring Message Resolver")
public ResourceBundleMessageSource messageSource() {
	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	messageSource.setBaseName("songname");
	return messageSource;
}
}
<span th:text="#{welcome.songname}" />




