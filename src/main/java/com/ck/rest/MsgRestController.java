package com.ck.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ck.constants.ApplicationConstants;
import com.ck.props.ApplicationProperties;

@RestController
public class MsgRestController {
    
	/* 2 --- >@Value("${welcomeMsg}")
	private String gWmsg;
	@Value("${greetMsg}")
	private String gGmsg;*/
	
	@Autowired
	private ApplicationProperties appProps;
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
         return appProps.getMessages().get(ApplicationConstants.GREET_MSG_KEY);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return appProps.getMessages().get(ApplicationConstants.WELCOME_MSG_KEY);
	}
}
