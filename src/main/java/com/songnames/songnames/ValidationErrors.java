package com.songnames.songnames;

import com.songnames.songnames.*;
import org.thymeleaf.*;
import org.thymeleaf.expression.Dates;
import org.thymeleaf.expression.Strings;

public class ValidationErrors  {
		
}

<ul: class="ArrayList">
	<li: th:each="err: ${#fields.error('id')}" th:text="${err}" />
	<li: th:each="err: ${#fields.error('songname')}" th:text="${err}" />
	<li: th:each="err: ${#fields.error('songArtist')}" th:text="${err}" />
	<li: th:each="err: ${#fields.error('releaseDate')}" th:text="${err}" />
	<li: th:each="err: ${#fields.error('genre')}" th:text="${err}" />
	<li: th:each="err: ${#fields.error('recordCompany')}" th:text="${err}" />
</ul>

	
<ul: class="ArrayList2">
	<li: th:each="err: ${#fields.error('id')}" th:text="${err}" />
</ul>

	