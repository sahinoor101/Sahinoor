import java.util.*;

class OddOneOut {

    int[] arr;
    int size;
    int[] prime;
    int[] perfect;
    int[] abundant;
    int[] deficient;

    public OddOneOut(int size) {
        this.size = size;
        arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        prime = new int[size];
        perfect = new int[size];
        abundant = new int[size];
        deficient = new int[size];
        sc.close();
    }

    public void checkAllNumber() {
        int i;
        for (i = 0; i < size; i++) {
            prime[i] = isPrime(arr[i]);
            perfect[i] = isPerfect(arr[i]);
            abundant[i] = isAbundant(arr[i]);
            deficient[i] = isDeficient(arr[i]);
        }
        int index = checkOddByIndex();
        checkTypeOfNumber(arr[index]);
    }

    public int isPrime(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public void checkTypeOfNumber(int num) {
        int sof = sumOfFactors(num);
        if (sof == num)
            System.out.println(num + " is the odd among the numbers and its a PERFECT NUMBER");
        else if (sof > num)
            System.out.println(num + " is the odd among the numbers and its a ABUNDANT NUMBER");
        else
            System.out.println(num + " is the odd among the numbers and its a DEFICIENT NUMBER");

    }

    public int sumOfFactors(int num) {
        int sof = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sof += i;
            }
        }
        return sof;
    }

    public int isPerfect(int num) {
        return (sumOfFactors(num) == num) ? 1 : 0;
    }

    public int isAbundant(int num) {
        return (sumOfFactors(num) > num) ? 1 : 0;
    }

    public int isDeficient(int num) {
        return (sumOfFactors(num) < num) ? 1 : 0;
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Original Numbers");
        for (int i = 0; i < size; i++) {
            System.out.print(prime[i] + " ");
        }
        System.out.println("Prime");
        for (int i = 0; i < size; i++) {
            System.out.print(perfect[i] + " ");
        }
        System.out.println("Perfect");
        for (int i = 0; i < size; i++) {
            System.out.print(abundant[i] + " ");
        }
        System.out.println("abundant");
        for (int i = 0; i < size; i++) {
            System.out.print(deficient[i] + " ");
        }
        System.out.println("Deficient");
    }

    public int checkOddByIndex() {
        int i;
        int first = prime[0];
        int second = prime[1];
        if (first != second)
            return (first == prime[2]) ? 1 : 0;
        else {
            for (i = 2; i < size; i++) {
                if (prime[i] != first) {
                    return i;
                }
            }
        }
        first = perfect[0];
        second = perfect[1];
        if (first != second)
            return (first == perfect[2]) ? 1 : 0;
        else {
            for (i = 2; i < size; i++) {
                if (perfect[i] != first) {
                    return i;
                }
            }
        }
        first = abundant[0];
        second = abundant[1];
        if (first != second)
            return (first == abundant[2]) ? 1 : 0;
        else {
            for (i = 2; i < size; i++) {
                if (abundant[i] != first) {
                    return i;
                }
            }
        }
        first = deficient[0];
        second = deficient[1];
        if (first != second)
            return (first == deficient[2]) ? 1 : 0;
        else {
            for (i = 2; i < size; i++) {
                if (deficient[i] != first) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        size=sc.nextInt();
        OddOneOut obj = new OddOneOut(size);
        obj.checkAllNumber();
    }
}