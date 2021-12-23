public class ATM {

    public int countBanknotes(int sum) {
        int quantity = 0;
        int quantityTemp = 0;

        while (sum > 0) {
            if (sum >= 500) {
                quantityTemp += sum / 500;
                quantity += quantityTemp;
                sum = sum - quantityTemp * 500;
                quantityTemp = 0;
            }
            if (sum >= 200) {
                quantityTemp += sum / 200;
                quantity += quantityTemp;
                sum = sum - quantityTemp * 200;
                quantityTemp = 0;
            }
            if (sum >= 100) {
                quantityTemp += sum / 100;
                quantity += quantityTemp;
                sum = sum - quantityTemp * 100;
                quantityTemp = 0;
            }
            if (sum >= 50) {
                quantityTemp += sum / 50;
                quantity += quantityTemp;
                sum = sum - quantityTemp * 50;
                quantityTemp = 0;
            }
            if (sum >= 20) {
                quantityTemp += sum / 20;
                quantity += quantityTemp;
                sum = sum - quantityTemp * 20;
                quantityTemp = 0;
            }
            if (sum >= 10) {
                quantityTemp += sum / 10;
                quantity += quantityTemp;
                sum = sum - quantityTemp * 10;
                quantityTemp = 0;
            }
            if (sum >= 5) {
                quantityTemp += sum / 5;
                quantity += quantityTemp;
                sum = sum - quantityTemp * 5;
                quantityTemp = 0;
            }
            if (sum >= 2) {
                quantityTemp += sum / 2;
                quantity += quantityTemp;
                sum = sum - quantityTemp * 2;
                quantityTemp = 0;
            }
            if (sum >= 1) {
                quantity += sum;
                sum = 0;
            }
        }

        return quantity;
    }

    /*But more effectively we can do through the loop
    public int countBanknotes(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        int quantity = 0;
        int quantityTemp = 0;
        int arrInd = 0;

        for (int i=0; sum > 0; i++) {
            quantityTemp = sum/banknotes[arrInd];
            quantity += quantityTemp;
            sum = sum - quantityTemp*banknotes[arrInd];
            quantityTemp = 0;
            arrInd++;
        }

        return quantity;
    }*/

    /*public static void main(String[] args) {
        ATM counting = new ATM();

        System.out.println("Общее количество купюр: " + counting.countBanknotes(578));
    }*/
}
