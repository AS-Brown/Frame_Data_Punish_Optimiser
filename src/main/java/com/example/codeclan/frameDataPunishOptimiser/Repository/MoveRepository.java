package com.example.codeclan.frameDataPunishOptimiser.Repository;

import com.example.codeclan.frameDataPunishOptimiser.Models.Move;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveRepository extends JpaRepository<Move, Long> {

}
