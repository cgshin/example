package com.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	public Map<String, String> init(){
		Map<String, String> map = new HashMap<>();
		map.put("id", "test1");
		map.put("name", "�׽���1");
		map.put("message", "Hello~~");
		
		return map;
	}
}
