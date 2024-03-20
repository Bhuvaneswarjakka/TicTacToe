package com.Bhuvaneswar.TicTacToe.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity(name = "Player")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Player
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Symbol symbol;
    private String name;
    private String email;
    private PlayerType playerType;
}
