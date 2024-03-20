package com.Bhuvaneswar.TicTacToe.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity(name = "Cell")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Cells
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private int row;
    private int col;
    private CellsStatus cellsStatus;

    private Player player;

    public Cells(int row, int col)
    {
        this.row=row;
        this.col=col;
        this.cellsStatus=CellsStatus.EMPTY;
    }
}
