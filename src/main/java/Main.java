import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    //初級理解度チェック課題３
    //正規表現を使用して、ハイフン付きの国内携帯電話番号の有効性をチェックするプログラムを作成。
    //有効な携帯電話番号の条件を自分で定義し、その条件に合致するかどうかを判定。
    /*定義
    　[090][080][070]から始まる3桁-4桁-4桁の計11桁の番号*/

    //フラグを立てる
    boolean flag = true;
    while (flag) {
      //オブジェクトのインスタンス化
      Scanner scanner = new Scanner(System.in);
      //入力処理
      System.out.println("携帯電話番号を入力してください。");
      String cellPhoneNumber = scanner.nextLine();
      if (cellPhoneNumber == "") {
        System.out.println("入力がありません。");
      } else {
        //判定定義
        String regex = "^0[789]0-[0-9]{4}-[0-9]{4}$";
        //patternとmatcherオブジェクトの作成
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(cellPhoneNumber);
        //判定処理
        if (m.find()) {
          System.out.println(cellPhoneNumber + "は有効な携帯電話番号です。");
        } else {
          System.out.println(cellPhoneNumber + "は無効な携帯電話番号です。");
        }
        //scannerを閉じる
        scanner.close();
        //フラグを折る
        flag = false;
      }
    }
  }
}
