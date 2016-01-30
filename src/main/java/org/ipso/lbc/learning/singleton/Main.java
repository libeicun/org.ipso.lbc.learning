package main.java.org.ipso.lbc.learning.singleton;

/**
 * 信息：李倍存 创建于 2016/01/21 19:10。电邮 1174751315@qq.com。<br>
 * 说明：
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args){

        Configuration configuration = Configuration.INSTANCE;

        System.out.println(configuration.getConfiguration("cfg1"));
        System.out.println(configuration.getConfiguration("cfg2"));

    }
}
