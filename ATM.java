public class ATM{
    public final int[] banknotesNominals={500,200,100,50,20,10,5,2,1};

    public int countBanknotes(int sum){
        int i = 0, counter=0;
        while (sum>=1) {
            counter+= sum/banknotesNominals[i];
            sum=sum%banknotesNominals[i++];
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(2403));
    }
}