import java.util.Calendar;

public class MethodPractice {
    public static boolean isLeapYear(int a){
        boolean bool;

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            bool = true;
            return bool;
        }else{
            bool = false;
            return bool;
        }
    }

    public static int getSum(int num){
        if (num <= 0){
            return 0;
        }
        return num + getSum(num - 1);
    }

    public static boolean isPrime(int num){
        var i = 0;
        for(i = 2; num % i != 0; i++){

        }
        if(i == num){
            var bool = true;
            return bool;
        }else{
            var bool = false;
            return bool;
        }
    }

    public static int factorial(int num){
        if (num == 0){
            return 1;
        }else if(num < 0){
            return 0;
        }
        return num * factorial(num - 1);
    }

    public static int findMax(int[] array){
        int max = array[0];
        for(var i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static boolean isPalindrome(String str){
        var len = str.length();
        var j = len - 1;
        for (var i = 0; i <= j; i++){
            String str1 = str.substring(i, i+1);
            String str2 = str.substring(j, j+1);
            if(str1.equals(str2)){

            }else{
                var bool = false;
                return bool;
            }
            j--;
        }
        var bool = true;
        return bool;
    }

    public static int getAge(int num1, int num2, int num3){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        var age = year - num1;
        if(num2 > month){
            age -= 1;
        }else if(month == num2){
            if(num3 > day){
                age -= 1;
            }else{
                age = age;
            }
        }else{
            age = age;
        }
        return age;
    }

    public static void sortArray(int[] array){
        var len = array.length;
        len -= 1;
        for(var i = 0; i <= len; i++){
            for(var j = len; j >= i+1; j--){
                if(array[j - 1] > array[j]){
                    var temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

        }
    }

    public static int getIndex(int[] array, int low, int high, int b){
        var len = array.length;
        int l = (low + high)/2;
        if(array[low] != b || array[high] != b){
            return -1;
        }
        if(array[l] == b){
            return l;
        }else if(array[l] > b){
            return getIndex(array, low, l-1, b);
        }else{
            return getIndex(array, l+1, high, b);
        }
    }

}
