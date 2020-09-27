import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//описываем класс сканер, чтобы считывать введённую информацию
        System.out.println("Введите строку");
        String str = in.nextLine();//считываем введённую строку
        String revstr = reverseString(str);//заносим полученную строку в функцию реверсирования строки
        System.out.println("Введенная строка: " + str);
        System.out.println("Строка наоборот: " + revstr);
        //если функция проверки возвращает true, выводим, что введённая строка является палиндромом
        if (CheckStr(str, revstr) == true){System.out.println(str+ " является палиндромом");}
        else {System.out.println(str + " не является палиндромом");}
    }

    public static String reverseString(String instr){
        String outstr = "";
        for (int i =instr.length()-1; i>=0; i=i-1)//цикл создания реверсивной строки
        {outstr += instr.charAt(i);}
        return outstr;

    }

    public static boolean CheckStr(String firststr, String newstr){
        //Если реверсивная строка посимвольно соответствует начальной строки, то возвращаем true
        //иначе false
        if (firststr.equals(newstr) == true) {return true;}
        else {return false;}

    }
}