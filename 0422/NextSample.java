public class NextSample {
    public static void main(String[] args){
        //phpの場合は、↓
        // $i = 10;
        // $i = "aiueo";

        //10(数値)を保存する場合
        // intは絶対に整数だけしか入らない！
        int i =5; //int型：整数値専用の変数を作る宣言
        double j = 3.14;  //double型：小数点がある値の専用の変数を作る宣言
        String k = "こんにちは"; //String型：文字列専用の変数を作る宣言
        int l = 0;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        l = 100;
        System.out.println(l);
    }
}
