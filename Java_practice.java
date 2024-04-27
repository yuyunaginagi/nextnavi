// Javaの記述練習

class Main {
  public static void main(String[] args) {
    var radius = 5;
    System.out.println(radius * radius * 3.14);

    System.out.println(((Object)radius).getClass().getSimpleName());
  }
}

// 配列とリスト
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> scores = new ArrayList<Integer>();

      scores.add(1);
      scores.add(5);
      scores.add(10);
      scores.add(15);

    System.out.println(scores.get(0));
    System.out.println(scores.get(1));
    System.out.println(scores.get(2));
    System.out.println(scores.get(3));
  }
}

// 条件文
class Main {
  public static void main(String[] args) {
    int value = 3;

    if (value > 0){
      System.out.println("値は正です");
    }
  }
}