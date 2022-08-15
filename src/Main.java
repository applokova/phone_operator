package src;

public class Main {
    public static void main(String[] args) {

        int initialAmount = 125;
        int replenishment = 1245;
        int sum = initialAmount + replenishment;

        if (replenishment >= 1000){
            int bonus = replenishment / 100 + sum;
            System.out.println(bonus);
        }
        else{
            System.out.println(sum);
        }
    }
}