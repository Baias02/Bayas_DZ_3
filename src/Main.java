public class Main {
    public static void main(String[] args) {
        double[] star = {-1.2,2.3,-3.5,7.3,-21.2,11.4,23.6,-23.8,8.4,-3.34,18.5,91.2,-19.7,-9.1,11.2};
        double num = 0;
        int amount = 0;
        boolean proverka = false;
            for (double maps : star) {
                if (maps<0){
                    proverka = true;
            } else if (maps>0 && proverka) {
                    num= num + maps;
                    amount++;
                }
            }
        System.out.println("Cреднее число: " + num/amount);



    }
}
