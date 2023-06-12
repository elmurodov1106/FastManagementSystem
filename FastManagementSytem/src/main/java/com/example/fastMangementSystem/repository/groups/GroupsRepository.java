package com.example.fastMangementSystem.repository.groups;

import com.example.fastMangementSystem.entity.groups.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroupsRepository extends JpaRepository<GroupEntity, UUID> {

}
