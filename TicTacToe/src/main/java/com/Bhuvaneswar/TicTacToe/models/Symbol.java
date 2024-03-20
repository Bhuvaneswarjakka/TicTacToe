package com.Bhuvaneswar.TicTacToe.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Symbol
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private char aChar;
}
