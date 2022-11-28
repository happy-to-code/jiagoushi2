package com.yida.self.import_d;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Type: BoyTest.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/28 10:17
 * @Version:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BoyTest {
    @Autowired
    Boy boy;

    @Autowired
    Girl girl;

    @Test
   public void getId() {
        // Boy b = new Boy();
        // b.like();

        boy.like();

        girl.like();
    }
}