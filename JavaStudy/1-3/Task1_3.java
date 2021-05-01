/*
 * Task1-3 : 課題内容
 *
 * 本課題では、演算子の使い方を学んでいきましょう。
 * 問1から問7まであります。
 * 指定された数値、式、変数名を守って記述してください。
 *
 * 問③,⑤については、コメントを入れてください。
 * 問⑦については、変数名を使って出力してください。
 *
 */
public class Task1_3 {
  public static void main(String[] args) {

      // 1. 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
    int plus = 5 + 10;

      //2. 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
      int minus = 20 - 7;

      // 3. 下記の処理について、何をしているのかコメントを記入してください。
      // [ここへ記述] 10 と 2 を乗算した値を代入した整数型変数を作成。
      int multiply = 10 * 2;

      // 4. 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
      int remi = 20 % 6;

      // 5. 下記の処理について、何をしているのかコメントを記入してください
      // [ここへ記述] String型変数:townに有楽町を代入。String型変数:lineに線を代入。
      String town = "有楽町";
      String line = "線";

      // 6. 5.で作成した変数を連結させた値を代入する変数 train を作成しなさい。
      String train = town + line ;

      // 7. 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。
      System.out.println(plus);
      System.out.println(minus);
      System.out.println(multiply);
      System.out.println(remi);
      System.out.println(train);

  }
}