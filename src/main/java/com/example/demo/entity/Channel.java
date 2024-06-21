package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Channel Table
 */
@Entity
//@Data
@Table(name = "channel")
public class Channel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "channel")
	private String channel;

	@Column(name = "watch_time")
	private Long watchTime;

	@Column(name = "stream_time")
	private Long streamTime;

	@Column(name = "peak_viewers")
	private Long peakViewers;

	@Column(name = "average_viewers")
	private Long averageViewers;

	@Column(name = "followers")
	private Long followers;

	@Column(name = "followers_gained")
	private Long followersGained;

	@Column(name = "views_gained")
	private Long viewsGained;

	@Column(name = "partnered")
	private String partnered;

	@Column(name = "mature")
	private String mature;

	@Column(name = "language")
	private String language;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getWatchTime() {
		return watchTime;
	}

	public void setWatchTime(Long watchTime) {
		this.watchTime = watchTime;
	}

	public Long getStreamTime() {
		return streamTime;
	}

	public void setStreamTime(Long streamTime) {
		this.streamTime = streamTime;
	}

	public Long getPeakViewers() {
		return peakViewers;
	}

	public void setPeakViewers(Long peakViewers) {
		this.peakViewers = peakViewers;
	}

	public Long getAverageViewers() {
		return averageViewers;
	}

	public void setAverageViewers(Long averageViewers) {
		this.averageViewers = averageViewers;
	}

	public Long getFollowers() {
		return followers;
	}

	public void setFollowers(Long followers) {
		this.followers = followers;
	}

	public Long getFollowersGained() {
		return followersGained;
	}

	public void setFollowersGained(Long followersGained) {
		this.followersGained = followersGained;
	}

	public Long getViewsGained() {
		return viewsGained;
	}

	public void setViewsGained(Long viewsGained) {
		this.viewsGained = viewsGained;
	}

	public String getPartnered() {
		return partnered;
	}

	public void setPartnered(String partnered) {
		this.partnered = partnered;
	}

	public String getMature() {
		return mature;
	}

	public void setMature(String mature) {
		this.mature = mature;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
