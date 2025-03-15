public class Str{
    public int multiply(int numOne,int numTwo){
        int numThree=numOne*numTwo;
        return numThree;
    }
    
    public static void main(String args[]){
        Str obj=new Str();
        int c=obj.multiply(10,20);
        System.out.println(c);
        
        
        
    }
}