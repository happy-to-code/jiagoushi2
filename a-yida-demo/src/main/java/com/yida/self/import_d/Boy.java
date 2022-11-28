package com.yida.self.import_d;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Type: Boy.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/28 9:50
 * @Version:
 */
@Data
@Import({Girl.class})
@Configuration
public class Boy {
    private String id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Boy{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public void like() {
        System.out.println("like:basketball");
    }
}
