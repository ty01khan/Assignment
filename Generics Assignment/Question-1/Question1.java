/**
 * @author Talha Yaseen
 */
public class Question1 {
    <T> void printArray(T[] array) {
        for(T ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Question1 genObj = new Question1();

        Integer[] intArr = {12, 14, 76, 89, 98};
        Double[] dblArr = {1.1, 2.2, 5.6};
        Character[] charArr = {'t', 'a', 'l', 'h', 'a'};

        genObj.printArray(intArr);
        genObj.printArray(dblArr);
        genObj.printArray(charArr);
    }
}
