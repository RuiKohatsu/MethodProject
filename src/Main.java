import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean result;
        int result2;
        boolean result3;
        int result4;
        int result5;
        boolean result6;
        int result7;
        //result8はif(select == 8)内で宣言しています
        int result9;

        var sc = new Scanner(System.in);
        System.out.print("実行したい演習を選んでください：");
        var s1 = sc.nextLine();
        var select = Integer.parseInt(s1);


        if(select == 1){
            System.out.print("数値を入力してください：");
            var s2 = sc.nextLine();
            var num = Integer.parseInt(s2);
            result = MethodPractice. isLeapYear(num);
            System.out.println(result);

        }else if(select == 2){
            System.out.print("数値を入力してください：");

            var s2 = sc.nextLine();
            var num = Integer.parseInt(s2);
            result2 = MethodPractice.getSum(num);
            System.out.println(result2);

        }else if(select == 3){
            System.out.print("数値を入力してください：");
            var s2 = sc.nextLine();
            var num = Integer.parseInt(s2);
            result3 = MethodPractice.isPrime(num);
            System.out.println(result3);

        }else if(select == 4){
            System.out.print("数値を入力してください：");
            var s2 = sc.nextLine();
            var num = Integer.parseInt(s2);
            result4 = MethodPractice.factorial(num);
            System.out.println(result4);

        }else if(select == 5){
            var array = new int[5];
            for(var i = 0; i <= 4; i++){
                System.out.print("数値を入力してください：");
                var s2 = sc.nextLine();
                var num = Integer.parseInt(s2);
                array[i] = num;
            }
            result5 = MethodPractice.findMax(array);
            System.out.println(result5);

        }else if(select == 6){
            System.out.print("文字列を入力してください：");
            var s2 = sc.nextLine();
            result6 = MethodPractice.isPalindrome(s2);
            System.out.println(result6);

        }else if(select == 7){
            System.out.print("年を入力してください：");
            var year = sc.nextLine();
            var num1 = Integer.parseInt(year);

            System.out.print("月を入力してください：");
            var month = sc.nextLine();
            var num2 = Integer.parseInt(month);

            System.out.print("日を入力してください：");
            var day = sc.nextLine();
            var num3 = Integer.parseInt(day);

            result7 = MethodPractice.getAge(num1, num2, num3);
            System.out.println(result7);

        }else if(select == 8){
            System.out.print("要素数を入力してください：");
            var s2 = sc.nextLine();
            var num = Integer.parseInt(s2);
            var array = new int[num];
            for(var j = 0; j < num; j++){
                System.out.print("数値を入力してください：");
                var s3 = sc.nextLine();
                var num1 = Integer.parseInt(s3);
                array[j] = num1;
            }
            MethodPractice.sortArray(array);
            System.out.println(Arrays.toString(array));

        }else if(select == 9){
            System.out.print("要素数を入力してください：");
            var s2 = sc.nextLine();
            var num = Integer.parseInt(s2);
            var array = new int[num];
            for(var j = 0; j < num; j++){
                System.out.print("数値を入力してください：");
                var s3 = sc.nextLine();
                var num1 = Integer.parseInt(s3);
                array[j] = num1;
            }
            System.out.print("整数を入力してください：");
            var s4 = sc.nextLine();
            var num2 = Integer.parseInt(s4);
            var len = array.length;
            var low = 0;
            var high = len - 1;
            MethodPractice.sortArray(array);
            result9 = MethodPractice.getIndex(array, low, high,  num2);
            if(result9 == -1){
                System.out.println(num2 + "は配列の中にありませんでした。");
            }else {
                System.out.println(num2 + "は配列の" + (result9 + 1) + "番目にあります。");
            }


        }




    }
}