package exe._2;

/*
*
* . 2
برنامه ای بنویسید که
با تعریف دو متغیر از نوع اعشاری، حاصل تقسیم آن ها را در خروجی نمایش دهد.
* */


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DividingDecimalNumbers divition = new DividingDecimalNumbers();
        double divied =  divition.divid(2.2,2.3);
        System.out.println(divied);
    }
}