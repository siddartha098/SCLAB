import java.util.Scanner;
public class Cipher{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("enter the message:");
        String msg = s.nextLine();
        msg = msg.toUpperCase();
        System.out.print("enter the shift value:");
        int n = s.nextInt();
        String c = "";
        for(int i=0;i<msg.length();i++){
            for(int j=0;j<txt.length();j++){
                if(msg.charAt(i)==txt.charAt(j)){
                    int k = (j+n)%26;
                    c = c + txt.charAt(k);
                }
            }
        }
        System.out.print("original message:" + msg + "\n");
        System.out.print("encrypted message:" + c);
    }
}