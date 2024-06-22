package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "api/channel", produces = "application/json;charset=UTF-8")
public class ChannelResController {

	@GetMapping("/getTop10Watched")
	public ResponseEntity<?> getTop10Watched() {
		return ResponseEntity.ok("ok");
	}

}
