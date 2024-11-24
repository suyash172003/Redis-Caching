package org.example.redis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class RedisModel implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
}
