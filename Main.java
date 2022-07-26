public class Main {
    public static void main(String[] args) {

        int a = 125;
        int b = 1245;
        int c = a + b;

        if (b >= 1000){
            int d = b / 100 + c;
            System.out.println(d);
        }
        else{
            System.out.println(c);
        }
    }
}