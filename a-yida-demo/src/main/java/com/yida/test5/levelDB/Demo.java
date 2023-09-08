package com.yida.test5.levelDB;

import org.iq80.leveldb.DB;
import org.iq80.leveldb.DBFactory;
import org.iq80.leveldb.Options;
import org.iq80.leveldb.impl.Iq80DBFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author zhangyifei
 * @Date 2023/7/26 13:37
 * @Version 1.0
 */
public class Demo {
    private static final String PATH = "/data/leveldb";
    private static final Charset CHARSET = Charset.forName("utf-8");
    private static final File FILE = new File(PATH);

    public static void main(String[] args) {
        DBFactory factory = new Iq80DBFactory();
        // 默认如果没有则创建
        Options options = new Options();
        File file = new File(PATH);
        DB db = null;
        try {
            db = factory.open(file, options);
            byte[] keyByte1 = "key-01".getBytes(CHARSET);
            byte[] keyByte2 = "key-02".getBytes(CHARSET);
            // 会写入磁盘中
            db.put(keyByte1, "value-01".getBytes(CHARSET));
            db.put(keyByte2, "value-02".getBytes(CHARSET));
            String value1 = new String(db.get(keyByte1), CHARSET);
            System.out.println(value1);
            System.out.println(new String(db.get(keyByte2), CHARSET));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (db != null) {
                try {
                    db.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
