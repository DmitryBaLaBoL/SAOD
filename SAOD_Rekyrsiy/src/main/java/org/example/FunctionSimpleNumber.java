package org.example;

public class FunctionSimpleNumber {

    // Проверка простое ли число a итерацией
    public static boolean IsSimpleNumber(int a){
        if (a == 1) return false;
        if (a == 2) return true;
        for (int i = 2; i <= (a / 2) + 1; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }

    // Проверка простое ли число a рекурсией
    public static boolean IsSimpleNumberRekyrsiy(int a){
        if (a == 1) return false;
        if (a == 2) return true;
        int div = a / 2 + 1;
        if (div >= 2) {
            if (a % div == 0) {
                return false;
            } else {
                return SimpleNumberRekyrsiy(a, div - 1);
            }
        }
        else{
            return true;
        }
    }

    public static boolean SimpleNumberRekyrsiy(int a,int div){
        if (div >= 2) {
            if (a % div == 0) {
                return false;
            } else {
                return SimpleNumberRekyrsiy(a, div - 1);
            }
        }
        else{
            return true;
        }
    }
    /*def check(n, div = None):
    if div is None:
        div = n - 1
    while div >= 2:
        if n % div == 0:
            print("Число не является простым")
            return False
        else:
            return check(n, div-1)
    else:
        print("Число является простым")
        return True
n = int(input("Введите число: "))
check(n)*/
}
