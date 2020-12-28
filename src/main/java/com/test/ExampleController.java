package com.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	public Map<String, String> init(){
		Map<String, String> map = new HashMap<>();
		map.put("id", "test1");
		map.put("name", "ев╫╨ем1");
		map.put("message", "Hello~~");
		map.put("message2", "Hello2~~");
		map.put("message3", "Hello3~~");
		
		return map;
	}
}
