class Solution {
    public int subtractProductAndSum(int n) {
        int a= multi(n)-add(n);
        return a;
    }

    int multi(int num){
        int m=1;
        int a=0;
        while(num!=0){
         a= num%10;
        m*=a;
        num=num/10;
        }

        return m;
    }

     int add(int num){
        int s=0;
        int a=0;
        while(num!=0){
         a= num%10;
        s+=a;
        num=num/10;
        }

        return s;
    }
}
