import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=scanner.nextInt();
        String response="";
        if(age==18){
            response="Wow! You're 18! Go get your license or something.";
        }
        else if(age<18 && age>=10){
            response="You're not a kid anymore, but don't stop having fun!";
        }
        else if(age>18){
            response="You're "+ age+".All grown up now. Congrats!";
        }
        else if(age<10){
            response="Aww :) You're so young!";
        }
        System.out.println(response);
        System.exit(0);        
    }
}

