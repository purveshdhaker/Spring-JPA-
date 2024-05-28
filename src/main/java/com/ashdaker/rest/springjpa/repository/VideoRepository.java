package com.ashdaker.rest.springjpa.repository;

import com.ashdaker.rest.springjpa.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {

}
