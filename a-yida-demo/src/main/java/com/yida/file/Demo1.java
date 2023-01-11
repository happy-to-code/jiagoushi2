package com.yida.file;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Type: Demo1.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/11 13:47
 * @Version:
 */
@NoArgsConstructor
@Data
public class Demo1 {

    private Integer code;
    private String msg;
    private DataDTO data;

    private String requestId;

    @NoArgsConstructor
    @Data
    public static class DataDTO {
        private Integer pageNo;
        private Integer pageSize;
        private Integer totalPage;
        private Integer totalSize;
        private List<RowsDTO> rows;


        public static class RowsDTO {
            private String id;
            private String taskName;
            private List<String> shopId;
            private String adTypeCode;
            private String reportTypeCode;
            private String reportState;
            private String downloadUrl;
            private String createTime;
            private String reportCycle;
            private String timeUnit;
        }
    }
}
