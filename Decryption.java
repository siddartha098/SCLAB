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






import java.util.*;
public class Cipher{
    public static String txt  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public static String Encrypt(String msg,int n){
        String c = "";
        for(int i=0;i<msg.length();i++){
            for(int j=0;j<txt.length();j++){
                if(msg.charAt(i)==txt.charAt(j)){
                    int k = (j+n)%26;
                    c = c + txt.charAt(k);
                }
            }
        }
        System.out.println("Decrypting the message:");
        System.out.print("original message:" + msg+"\n");
        System.out.println("encrypted message:" + c);
        return c;
    }
    
    public static String Decrypt(String en,String msg,Hashtable<String,String> list){
        System.out.println("Decryption analysis:");
        String d = "";
        String t = " ";
        for(int n=1;n<=26;n++){
            for(int i=0;i<en.length();i++){
                for(int j=0;j<txt.length();j++){
                    if(en.charAt(i)==txt.charAt(j)){
                        int k = (j+n)%26;
                        d = d + txt.charAt(k);
                    }
                    else if(en.charAt(i)==t.charAt(0)){
                        d = d + " ";
                    }
                }
            }
            list.put(""+n ,""+d);
            d = "";
        }
        for(int i=1;i<=list.size();i++){
            String m = list.get(Integer.toString(i));
            System.out.println(i+". "+m+"\n");
            
            /*if(msg == m){
                System.out.println("key value is +"+i);
                System.out.print("decrypted msg:"+msg);
            }*/
        }
        for(int i=1;i<=list.size();i++){
            if(list.containsValue(msg)){
                System.out.println("yes");
            }
        }
        return msg;
    }
    
    public static void main(String[] args) {
        Hashtable<String,String> list = new Hashtable<>();
        Scanner s = new Scanner(System.in);
        System.out.print("enter the message:");
        String msg = s.nextLine();
        msg = msg.toUpperCase();
        System.out.print("enter the shift value:");
        int n = s.nextInt();
        String en = Encrypt(msg,n);
        Decrypt(en,msg,list);
        
        
    }
}
