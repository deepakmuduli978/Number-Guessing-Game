import java.util.Scanner;
import java.util.Random;
class NumberGuess{
    public static void main(String[] args){
        Random rmd=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER GUESSING GAME<HELLO USER>");
        int attempt=0;
        int guess=rmd.nextInt(500-100+1)+100;
        while(true){
        System.out.println("Guess a number between 100 to 500 :");
        int num=sc.nextInt();
        
        if(num==guess){
            attempt++;
            System.out.println("Congratullation!! you guess the number in "+attempt+"attempt");
            break;
        }
        if(num>guess){
            System.out.println("Not correct! please guess lower number");
            attempt++;
        }
        else if(num<guess){
            System.out.println("Not correct! please guess higher number");
            attempt++;
        }
    
    }
            
    }
}