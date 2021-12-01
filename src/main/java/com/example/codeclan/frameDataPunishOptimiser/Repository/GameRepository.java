package com.example.codeclan.frameDataPunishOptimiser.Repository;

import com.example.codeclan.frameDataPunishOptimiser.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
