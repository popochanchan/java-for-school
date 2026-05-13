public class TypeExample {
    public static void main(String args[]){
        int num = 100;   //整数値（小数点がない値.-も含む）
        double d = 9.9;  //実数値（小数点がある値. 3.14など）
        boolean bool = true;   //真偽値.  true(真)/false(偽)
        String str = "こんにちは世界";   //文字列（複数の文字）
        char c = 'ほ'; //文字（1文字だけ）
        byte b = 81;

        System.out.println("dの値は" + d);
        System.out.println("cの値は" + c);
        System.out.println("bの値は" + b);
        System.out.println("boolの値は" + bool);
        System.out.println("strの値は" + str);
        System.out.println("numの値は" + num);
    }
}
