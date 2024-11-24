package org.example.redis.controller;

import org.example.redis.model.RedisModel;
import org.example.redis.services.RedisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class RedisController {

    @Autowired
    private RedisServices redisServices;

    @GetMapping
    public ResponseEntity<List<RedisModel>> getUsers() {
        return ResponseEntity.ok(redisServices.getAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Optional<RedisModel>> getUsers(@PathVariable String userId) {
        return ResponseEntity.ok(redisServices.getUsersById(userId));
    }

    @PostMapping
    public ResponseEntity<String> addUser(@RequestBody RedisModel user) {
        return ResponseEntity.ok(redisServices.addUser(user));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUser(@RequestBody RedisModel user) {
        return ResponseEntity.ok(redisServices.deleteUser(user));
    }
}
