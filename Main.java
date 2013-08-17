public class Main {

    public static void main(String[] args) {
        Field test = new Field();

        char nextept='X';
        int  steps = 0;


        test.eraseField();

        while (steps< Field.field.length* Field.field.length) {

            nextept =(nextept == 'O'? 'X' : 'O');


            test.userInput(nextept);





            test.showField();
        }
    }
}
