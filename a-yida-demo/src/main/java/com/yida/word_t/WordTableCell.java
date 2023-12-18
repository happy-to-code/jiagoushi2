package com.yida.word_t;

import lombok.Data;

/**
 * @author zhangyifei
 * @Date 2023/11/6 9:40
 * @Version 1.0
 */
@Data
public class WordTableCell {

    private Float x;

    private Float y;

    private Float width;

    private Float height;

    private String text;

    /**
     * 默认为12
     */
    private Float fontSize;

    /**
     * 行号 0开始
     */
    private Integer row;

    /**
     * 列号 0开始
     */
    private Integer col;

    /**
     * 行跨度 从1开始
     */
    private Integer rowspan;

    /**
     * 列跨度 从1开始
     */
    private Integer colspan;
}
