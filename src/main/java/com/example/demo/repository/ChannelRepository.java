package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Channel;

/**
 * 
 */
@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

}
