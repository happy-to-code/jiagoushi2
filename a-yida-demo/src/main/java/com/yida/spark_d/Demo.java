package com.yida.spark_d;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

/**
 * @author zhangyifei
 * @Date 2023/9/8 16:55
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String readme = "C:\\mydata\\project\\java_test\\jiagoushi\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\spark_d\\111.txt";
        SparkConf conf = new SparkConf().setAppName("tiger's first spark app");

        // local 本地单线程
        // local[K] 本地多线程（指定K个内核）
        // local[*] 本地多线程（指定所有可用内核）
        conf.setMaster("local[2]");

        JavaSparkContext sc = new JavaSparkContext(conf);

        // 从指定的文件中读取数据到RDD
        JavaRDD<String> logData = sc.textFile(readme).cache();

        // 过滤包含h的字符串，然后在获取数量
        long num = logData.filter(new Function<String, Boolean>() {
            public Boolean call(String s) {
                return s.contains("h");
            }

        }).count();

        System.out.println("the count of word a is " + num);
    }
}
