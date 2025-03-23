import java.util.*;


class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int age = sc.nextInt();
        
        int ans = checkValue(age);
        System.out.println("The result is: "+ ans);
        
        
       
    }
    
    static int checkValue(int age){
        if(age<0){
            return -1;
            
        }
        else if(age==0){
            return 0;
        }
        else{
            return 1;
        }
    }
}