package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Channel;

/**
 * 
 */
@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {
	@Query(value = "select a.* from channel a order by a.watch_time desc limit 10 offset 0", nativeQuery = true)
	List<Channel> selectTop10Watched();
}
