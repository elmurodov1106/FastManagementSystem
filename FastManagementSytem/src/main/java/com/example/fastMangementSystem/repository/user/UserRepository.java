package com.example.fastMangementSystem.repository.user;

import com.example.fastMangementSystem.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findUserEntitiesByPhoneNumber(String phoneNumber);

    Optional<UserEntity> findUserEntitiesById(UUID userId);
}
