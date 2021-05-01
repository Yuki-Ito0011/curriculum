/**
 * Task1-2 : 課題内容
 *
 * 本課題では、配列の使い方を学んでいきましょう。
 * 問①から問⑥まであります。
 * 指定された値と変数名を守って記述してください。
 *
 * 問⑤,⑥については、コメントを入れてください。
 *
 */
public class Task1_2 {

  public static void main(String[] args) {

      // 1.「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
      String country[] = {"JAPAN","AMERICA","KOREA"};

      // 2. 1.で作成した配列の要素数を出力してください。
      System.out.println(country[0]+" "+country[1]+" "+country[2]+" ");
      
      // for(String str : country){
      //   System.out.print(str + " ");
      // }
      // System.out.println(); //改行

      
      

      /* 3.下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
       *   1番目（先頭）の要素に 「りんご」 を代入
       *   2番目の要素に 「もも」 を代入
       *   3番目の要素に 「ぶどう」 を代入
       */
      String strArray[]={"りんご","もも","ぶどう"};
      
      // 4. 3.で作成した配列の2番目の要素を出力しなさい。
      System.out.println(strArray[1]);
      
      /* 5.下記の処理について、何をしているのかコメントを記入してください。
       *  [ここへ記述]整数型の配列変数名「intArray」を宣言し、各要素値に10, 20, 30, 40, 50に初期値とする。
       */
      int[] intArray = { 10, 20, 30, 40, 50 };

      // 6.下記の処理について、何をしているのかコメントを記入してください。
      // [ここへ記述]整数型の配列変数名intArrayのインデックス1（20）にインデックス4（50）の値を加算し、70を出力。
      System.out.println(intArray[1] + intArray[4]);

  }
}