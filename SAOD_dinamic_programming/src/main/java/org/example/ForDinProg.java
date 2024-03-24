package org.example;

public class ForDinProg {

    public static int JumpBool(int N){
        int a = 1,b = 2,c = 4;
        if (N < 4){
            switch (N){
                case 0 : return 0;
                case 1 : return a;
                case 2 : return b;
                case 3 : return c;
            }
        }
        int i = 3; int between;
        while (i < N){
            between = c;
            c = a + b + c;
            a = b;
            b = between;
            i++;
        }
        return c;
    }
/*def jump(N):
    a, b, c = 1, 2, 4
    if N < 4:
        return [0, a, b, c][N]
    i = 3
    while i < N:
        a, b, c = b, c, a + b + c
        i += 1
    return c*/
}
