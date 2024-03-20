package com.Bhuvaneswar.TicTacToe.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Move")
public class Moves
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Player player;
    private Cells cells;
}
