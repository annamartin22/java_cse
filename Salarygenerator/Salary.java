import java.util.*;
public class Salary
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n1.Developer\n2.Manager");
        System.out.println("entetr the choice:");
        int i=sc.nextInt();
        System.out.println("enter the salary");
        int salary=sc.nextInt();
        if(i==1)
        {
            double percent=salary*0.1;
            double salary1=salary+percent;
            System.out.println("the salary is:"+ salary1);
        }
        else if(1==2)
        {
            double percent2=salary*0.2;
            double salary2=salary+percent2;
            System.out.println("the salary is:"+ salary2);
        }
}
}
