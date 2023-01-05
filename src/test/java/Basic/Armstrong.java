package Basic;

public class Armstrong {

    public static boolean checkArmstrong(int number){
        int temp = number, sum = 0, remainder;
        boolean isArmstrong = false;
        int length = String.valueOf(number).length();
        for(int i = 0; i < length; i++){
            remainder = temp%10;
            sum += (int) Math.pow(remainder, length);
            temp = temp/10;
        }
        if(sum == number){
            isArmstrong = true;
        }
        return isArmstrong;
    }

    public static void main(String[] args) {
        System.out.println(checkArmstrong(1634));
    }
}
