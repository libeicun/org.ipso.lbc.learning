package main.java.org.ipso.lbc.learning.singleton;

/**
 * ��Ϣ����� ������ 2016/01/21 19:10������ 1174751315@qq.com��<br>
 * ˵����
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
