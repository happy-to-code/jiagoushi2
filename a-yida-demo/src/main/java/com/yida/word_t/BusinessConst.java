package com.yida.word_t;

/**
 * @author zhangyifei
 * @Date 2023/11/6 9:41
 * @Version 1.0
 */
public class BusinessConst {
    /**
     * word表格默认高度
     */
    private static final int DEFAULT_HEIGHT = 500;

    /**
     * word表格默认宽度
     */
    private static final int DEFAULT_WIDTH = 1000;

    /**
     * word表格转换参数 默认为/1 可以根据需求调整
     */
    private static final int DEFAULT_DIV = 1;

    /**
     * 目前没有提取word的字体大小 默认为12
     */
    private static final Float DEFAULT_FONT_SIZE = 12.0F;

    /**
     * word的全角空格 以及\t 制表符
     */
    private static final String WORD_BLANK = "[\u00a0|\u3000|\u0020|\b|\t]";

    /**
     * word的它自己造换行符 要换成string的换行符
     */
    private static final String WORD_LINE_BREAK = "[\u000B|\r]";

    /**
     * word table中的换行符和空格
     */
    private static final String WORD_TABLE_FILTER = "[\\t|\\n|\\r|\\s+| +]";

    /**
     * 计算表格行列信息时设置的偏移值
     */
    private static final Float TABLE_EXCURSION = 5F;

    /**
     * 抽取文字时去掉不必须字符正则
     */
    private static final String splitter = "[\\t|\\n|\\r|\\s+|\u00a0+]";

    private static final String regexClearBeginBlank = "^" + splitter + "*|" + splitter + "*$";

}
