import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Enter  = sc.nextLine();
    //     String a[] = Enter.split(" ");
    //     System.out.println("No of word : "+a.length);

    int count =1;
    for(int i=0;i<Enter.length()-1;i++)
    {
        if ((Enter.charAt(i)==' ') && (Enter.charAt(i+1)!=' '))
         {
            count++;
        }
    }
    System.out.println("No of word : "+ count);
    
}
    
}
