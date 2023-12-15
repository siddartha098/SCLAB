import java.util.Scanner;
public class Decryption {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("enter the message:");
        String msg = s.nextLine();
        msg = msg.toUpperCase();
        String c = "";
        String t = " ";
        System.out.print("original message:" + msg + "\n");
        for(int n=1;n<=26;n++){
            for(int i=0;i<msg.length();i++){
                for(int j=0;j<txt.length();j++){
                    if(msg.charAt(i)==txt.charAt(j)){
                        int k = (j+n)%26;
                        c = c + txt.charAt(k);
                    }
                    else if(msg.charAt(i)==t.charAt(0)){
                        c = c + " ";
                    }
                }
            }
            System.out.print((n)+"." + c + "\n\n");
            c = "";
        }
        
        
    }
}
