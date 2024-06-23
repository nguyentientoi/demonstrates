/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Channel;

/**
 * The channel service for apply logic query
 */
public interface IChannelService {
	/**
	 * The channel get top watched (minutes)
	 * 
	 * @return Collection Channel
	 */
	public List<Channel> getTop10Watched();
}
