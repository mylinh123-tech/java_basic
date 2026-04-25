package SwitchCase;

import If_Else.CauLen_If_ElseIf;

public class CauLenhSwitchCase {
    public static void main(String[] args) {
      String browser ="Safari"  ;
      switch (browser){
          case "Chrome":
              System.out.println("Start with Chrome browser");
              // WebDriver driver = new ChromeDriver():
              break;
          case "Edge":
              System.out.println("Start with Edge browser");
              // WebDriver driver = new EdgeDriver():
              break;
          case "FireBox":
              System.out.println("Start with FireBox browser");
              // WebDriver driver = new FireBoxDriver():
              break;
          default:
          System.out.println("Start with Default browser");
    //Neu ko co Break thi van tiep tuc chay sau khi gap case dung


      }


    }


}
