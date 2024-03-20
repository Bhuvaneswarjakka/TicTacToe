package com.Bhuvaneswar.TicTacToe.models;

import com.Bhuvaneswar.TicTacToe.Strategies.WinningStrategies;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity(name = "Game")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Game
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private List<Moves> moves;
    private Board board;
    private List<Player> players;
    private String CurrentPlayer;
    private List<WinningStrategies> winningStrategies;
    private GameStatus gameStatus;
    private Player winner;


}
