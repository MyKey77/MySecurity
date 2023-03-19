package com.example.mysecurity.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface User_Repository extends JpaRepository <Game_User, Long> {
Optional<Game_User> findByName(String name);
}
