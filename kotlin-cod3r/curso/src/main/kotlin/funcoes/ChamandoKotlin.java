package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoKotlin {
  public static void main(String[] args) {
    ArrayList<String> list = CollectionsKt.arrayListOf("Ana", "Bia", "Gui");
    System.out.println(SegundoElementoListKt.secondOrNull(list));
  }
}
