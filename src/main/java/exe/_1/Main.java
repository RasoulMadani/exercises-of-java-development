package exe._1;

/*
* . 1
برنامه ای بنویسید که
با تعریف دو متغیر عددی، حاصل جمع آن ها را در خروجی نمایش دهد.

* */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PlusNumbers number = new PlusNumbers();
        int com =  number.add(1,2);
        System.out.println(com);
    }
}