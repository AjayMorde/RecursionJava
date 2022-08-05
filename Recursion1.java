

public class Recursion1 {

    public static void printArrayElementReverse(int arr[],int idx){

        if(idx==arr.length){
            return;
        }
       
        printArrayElementReverse(arr,idx+1);
        System.out.println(arr[idx]);
        


    }

    public static void printArrayElement(int arr[],int idx){

        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printArrayElement(arr,idx+1);



    }


    public static int power(int x,int y){
    if(y==1){
        return 1;
    }
    int pow= power(x,y-1);
    int ans=x*pow;
    return ans;
}

    public static int fact(int f){
        if(f==1){
            return 1;
        }
        int factorial=fact(f-1);           
        int ans=factorial*f;   
        return ans;


    }
    
    public static void  naturalNum(int i ,int p ,int sum){
        if(i==p){
            sum=sum+i;
            System.out.println(sum);
            return;
        }

        sum=sum+i;
        naturalNum( i+1, p, sum);  
        // System.out.println(i);



    }

    public static void  printNumber2(int m){
       
        if(m==0){
            return;
        }
        System.out.println(m);               
        printNumber2(m-1);






    }
    public static void  printNumber1(int n){

        if(n==6)
        {
            return;
        }
        System.out.println(n);
         printNumber1((n+1));
        
    }


    public static void main(String[] args) {
        int n=1;
        int m=5;
        printNumber1(n);
        System.out.println("Printing Number in reverse Order");
        printNumber2(m);
        System.out.println("All the Natural number printing");
        naturalNum(1,5,0);
        System.out.println("Printing factorial number");
       int factorail_number= fact(5);
       System.out.println(factorail_number); 
       System.out.println("Raise the power");
       int ans=power(2 ,4);
       System.out.println(ans);
       System.out.println("Print All array Element");
       int arr[]={1,2,3,4,5,6};
       printArrayElement(arr,0);
       System.out.println("Printing array element in reverse");
       printArrayElementReverse(arr,0);
       


        
    }
    
}
