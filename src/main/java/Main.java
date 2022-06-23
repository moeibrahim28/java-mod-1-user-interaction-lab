import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you?");
        String inputString=scanner.nextLine();
        int age=input(inputString);
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
        else if(age<10 && age>0){
            response="Aww :) You're so young!";
        }
        else {
            System.out.println("Thats not a valid response.");
        }
        System.out.println(response);
        System.exit(0);        
    }

    private static int input(String sampleString) {
        try {
            return Integer.parseInt(sampleString);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}

