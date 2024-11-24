package org.example.redis.services;

import org.example.redis.model.RedisModel;
import org.example.redis.repository.RedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RedisServices {

    @Autowired
    private RedisRepository redisRepository;


    public List<RedisModel> getAllUsers() {
        return redisRepository.findAll();
    }


    public String addUser(RedisModel user) {
        user.setId(UUID.randomUUID().toString());
        redisRepository.save(user);
        return "success";
    }


    public String deleteUser(RedisModel user) {
        redisRepository.delete(user);
        return "success";
    }

    @Cacheable(value = "getOneUser",key = "#userId")
    public Optional<RedisModel> getUsersById(String userId) {
        return redisRepository.findById(userId);
    }
}
