import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    String dirtext = in.nextLine() + " ";
    String d_word, word;
    int pos = 0;
    
    while(dirtext.length()-1 > 0){
    
      if(dirtext.indexOf(" ") == -1){
        break;
      }
      else {
        pos = dirtext.indexOf(" ");
        d_word = dirtext.substring(0,pos);
        
        word = hand_wash(d_word);
        System.out.println(word);
        
        dirtext = dirtext.substring(pos+1);
      }
    } 
  }
  
  public static String hand_wash(String d){
    
    if ((d.indexOf(".") != -1) || (d.indexOf("?") != -1) || (d.indexOf("!") != -1) || (d.indexOf(",") != -1)) {
      String punk = d.substring(d.length()-1);
      return (d.substring(0,d.length()-1) + punk);
      //return (d.substring(0,d.length()-1));
    }
    else {
      return d;
    }
  }
  
  
}
