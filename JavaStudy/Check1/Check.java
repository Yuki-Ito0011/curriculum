/*     バブルソート
    チェックテスト-Java1章
 */
    public class Check{
    public static void main(String[] args){
    /*
    * 問1
    * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
    */
    
    int data[] = { 3, 1, 2, 7, 5};
    //要素初期化完了確認
    // for(int i=0; i < data.length; i++){
    //     System.out.println(data[i]);
    // }
    for(int out : data){
        System.out.println(out/* + "\n"*/);
    }
    /*
    * 問2
    * 以下のfor文を完成させなさい
    */
    
    for(int i = 0; i < data.length; i++){
        System.out.print(data[i] + " ");
        }
        System.out.println(); //改行

        for (int i = 1;  i < data.length /*ここに記述*/; i++) {
            for (int j = 1; j < data.length; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[i-1] > data[i]){
                    int box = data[ i ];
                    data[i] = data[i-1];
                    data[ i-1 ] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    
    }


}