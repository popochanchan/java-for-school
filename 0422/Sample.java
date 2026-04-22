public class Sample {
    public static void main(String[] args){
        char c1 = 'a'; // char型：一文字しか入らない,必ず''で囲む
        char c2 = 'あ';
        char c3 = '漢';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        boolean b1 = true; //　trueは文字列ではなく、値1として読み込まれる
        boolean b2 = false; // falseは、値0として
        System.out.println(b1);
        System.out.println(b2);
    }
}
