class Toss {
    static int[] arr = new int[100];
    public static void main(String[] args) {
        int i , c=100 , t=1;
        Toss obj=new Toss();
        for (int j = 0; j < 100; j++) {  
            for(i=0;i<10;i++)
            {
                c = obj.randomize(c);
                // System.out.println(c);
            }
            if (c!=0) {
                System.out.println(t++);
            }
        }
        
    }
    public int numberOfHeads(int[] array)
    {
        int c=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==1)
            {
                c++;
            }
        }
        return c;
    }
    public int randomize(int count)
    {
        int i;
        int[] arr=new int[count];
        for(i=0;i<count;i++)
        {
            arr[i] = (int)(Math.random()*2);
        }
        return numberOfHeads(arr);
    }

}
