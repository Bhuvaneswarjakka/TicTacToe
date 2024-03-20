package com.Bhuvaneswar.TicTacToe.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity(name = "Bot")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Bot extends Player
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private DifficultyLevelsInBot difficultyLevelsInBot;

}
