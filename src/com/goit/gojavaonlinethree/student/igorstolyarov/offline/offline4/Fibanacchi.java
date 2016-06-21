package com.goit.gojavaonlinethree.student.igorstolyarov.offline.offline4;

public class Fibanacchi {
    private static int calculateRecurse(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } return calculateRecurse (index -1) + calculateRecurse(index -2);
    }

    public static void main(String[] args) {
        long currentTimesMilles = System.nanoTime();
        calculateRecurse(20);
        long currentTimesMilles1 = System.nanoTime();
        long timeRezult = currentTimesMilles1 - currentTimesMilles;
        System.out.println(timeRezult);

        long currentTimesMilles2 = System.nanoTime();
        calculateWhile(20);
        long currentTimesMilles3 = System.nanoTime();
        long rezultWhile = currentTimesMilles3 - currentTimesMilles2;
        System.out.println(rezultWhile);

        int n = 11;
        for (int i = 1; i <= n; i++) {
            System.out.print(calculateRecurse(i) + " ");
        }
    }
    private static int calculateWhile (int index) {
        int a = 1, b = 1;
        System.out.println(a + " " + b);
        int fib = 2, i = 2;
        while (i < index) {
            fib = a+b;
            a = b;
            b = fib;
            System.out.println(" " + fib);
            i++;
        }
        return  fib;
    }
}

