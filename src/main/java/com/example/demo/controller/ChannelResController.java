package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Channel;
import com.example.demo.service.IChannelService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "api/channel", produces = "application/json;charset=UTF-8")
public class ChannelResController {

	@Autowired
	private IChannelService channelService;

	/**
	 * Get top 10 watched channel
	 * 
	 * @return List channel
	 */
	@GetMapping("/getTop10Watched")
	public ResponseEntity<?> getTop10Watched() {
		List<Channel> top10Watched = channelService.getTop10Watched();

		return ResponseEntity.ok(top10Watched);
	}

}
