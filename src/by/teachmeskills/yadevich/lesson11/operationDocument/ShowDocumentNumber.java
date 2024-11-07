package by.teachmeskills.yadevich.lesson11.operationDocument;

/**- Вывести на экран номер документа,
 *  но блоки из трех букв заменить на *** (каждая буква заменятся на *).
 */

public class ShowDocumentNumber {

    public static void showDocumentNumber(String documentNumber) {
        if (IsCorrectFormat.isCorrectFormat(documentNumber)) {
            String result = documentNumber.substring(0,4);
            String result1 = documentNumber.substring(9,13);
            String result2 = documentNumber.substring(18,22);
            System.out.println(result + "-***-"+ result1 + "-***-" + result2);
        }
    }
}
