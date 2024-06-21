package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/channel")
public class ChannelResController {

	@GetMapping("/list")
	public ResponseEntity<?> getTop10() {
		return ResponseEntity.ok("ok");
	}

}
