package com.yida.word_t;

import lombok.Data;

import java.util.List;

@Data
public class WordTable {

    private List<WordTableCell> wordTableCellList;

    private Float width;

    private Float height;
}
