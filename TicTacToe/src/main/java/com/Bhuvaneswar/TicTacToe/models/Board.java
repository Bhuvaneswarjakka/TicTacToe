package com.Bhuvaneswar.TicTacToe.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "Board")
public class Board
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private int size;
    private List<List<Cells>> board;

    //Creating Board
    public Board(int size)
    {
        this.size=size;
        this.board=new ArrayList<>();
        for(int i=0;i<size;++i)
        {
            board.add(new ArrayList<>());
            for(int j=0;j<size;++j)
            {
                board.get(i).add(new Cells(i, j));
            }
        }
    }
}

/*
All attributes private
Getters and Setters
 */
