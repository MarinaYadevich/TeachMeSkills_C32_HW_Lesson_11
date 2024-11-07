package by.teachmeskills.yadevich.lesson11.operationDocument;

/** Вывести на экран в одну строку два первых блока по 4 цифры. */

public class OutputTwoBlocks {

    public static void outputTwoBlocks(String documentNumber) {
        if (IsCorrectFormat.isCorrectFormat(documentNumber)) {
            String result = documentNumber.substring(0, 4);
            String result1 = documentNumber.substring(9, 13);
            System.out.print("One blocks: " + result);
            System.out.println(" ,two blocks: " + result1);
        }
    }

}
