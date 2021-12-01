package com.example.codeclan.frameDataPunishOptimiser.Repository;

import com.example.codeclan.frameDataPunishOptimiser.Models.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualRepository extends JpaRepository<Individual, Long> {
}
