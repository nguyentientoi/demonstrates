/**
  * Copyright (c) 20021-2023
  * All rights reserved.
  *
  * All copying and conversion without permission
  * Our suggestions are a violation of copyright and property rights laws
  * wisdom
  */
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
