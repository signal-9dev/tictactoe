import java.util.Scanner;

public class Field {

    static char[][] field = new char[3][3];
    static char DEFAULT_VALUE = ' ';

    public void showField() {

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("[" + field[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void eraseField() {
        for (int i=0; i<field.length; i++) {
            for (int j=0; j<field.length; j++) {
                field[i][j] = DEFAULT_VALUE ;
            }
        }
    }


    public void userInput(char nextept) {

         char z = nextept;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Column number: ");
        int columnNumber = input.nextInt();
        System.out.println("Enter line number: ");
        int lineNumber =  input.nextInt();
          while (field[columnNumber][lineNumber] == 'O' || field[columnNumber][lineNumber] == 'X' || columnNumber>2 || lineNumber >2 || columnNumber <0 || lineNumber < 0) {
              System.out.println("CRITICAL ERROR!!!!!!");
              System.out.println("Enter Column number: ");
              columnNumber = input.nextInt();
              System.out.println("Enter line number: ");
              lineNumber =  input.nextInt();
          }

        field[columnNumber][lineNumber] = nextept;


    }



}
