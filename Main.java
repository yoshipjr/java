public class Main {
  // クラス名とファイル名は同じにする必要がある
  public static void main(String[] args){
    String s1 = "スッキリわかるjava";
    String s2 = "Java";
    String s3 = "java";

    if(s1.contains("Java")){
      System.out.println("文字列s1はJavaを含んでいます");

    }if(s2.endsWith("Java")){
      System.out.println("文字列S2はjavaが末尾にあります");
    }
    System.out.println("文字列S1で最初にjavaが登場する位置は"+ s1.indexOf("Java"));
    System.out.println();
  
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<1000; i++){
      sb.append("java");
    }
    String s = sb.toString();
    System.out.println(s);
  }
}