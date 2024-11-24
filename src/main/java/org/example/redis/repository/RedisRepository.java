package org.example.redis.repository;

import org.example.redis.model.RedisModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepository extends JpaRepository<RedisModel, String> {

}
