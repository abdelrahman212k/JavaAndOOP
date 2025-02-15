package Methods;

public class Summation {
    // Method that takes dynamic number or integers and return their summation
    public static int Sum(int...number){
        int result = 0;
        //this way is called for each, and it's used to loop on arrays or variable number or arguments
        for(int counter: number){
            result += counter;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Sum(1, 5, 60));
    }
}
