package com.app.server.resource.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public Map<String, Object> admin(Principal user) {
		Map<String, Object> hasil = new HashMap<String, Object>();
		hasil.put("response", Boolean.TRUE);
		hasil.put("user", user.getName());
		return hasil;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public Map<String, Object> test() {
		Map<String, Object> hasil = new HashMap<String, Object>();
		hasil.put("response", Boolean.TRUE);
		hasil.put("message", "test unprotected api");
		return hasil;
	}
}
