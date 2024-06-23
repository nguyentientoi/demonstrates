/**
 * 
 */
package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Channel;
import com.example.demo.repository.ChannelRepository;
import com.example.demo.service.IChannelService;

/**
 * 
 */
@Service
public class ChannelService implements IChannelService {
	@Autowired
	private ChannelRepository channelRepository;

	@Override
	public List<Channel> getTop10Watched() {
		return channelRepository.selectTop10Watched();
	}
}
