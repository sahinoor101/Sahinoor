class HarshadCouplet {

    public boolean isHarshad(int num) {
        int digits, sod = 0, temp = num;
        do {
            digits = temp % 10;
            sod += digits;
            temp /= 10;
        } while (temp > 0);
        return (num%sod==0);
    }

    public static void main(String[] args) {
        int i, j=1;

        HarshadCouplet ob = new HarshadCouplet();
        for (i = 10; i < 100000; i++) {
            if (ob.isHarshad(i)) {
                if (ob.isHarshad(i + 1)) {
                    System.out.println(j+") " +i + " And " + (i + 1) + " are HarshadCouplet");
                    j++;
                }
            }
        }
    }
}
