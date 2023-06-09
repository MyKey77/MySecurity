package com.example.mysecurity.model.database;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository <GameUser, Long> {
Optional<GameUser> findByName(String name);
}
