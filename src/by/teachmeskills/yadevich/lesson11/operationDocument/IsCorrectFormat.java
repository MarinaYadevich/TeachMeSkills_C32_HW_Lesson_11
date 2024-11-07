package by.teachmeskills.yadevich.lesson11.operationDocument;

/** Проверка корректности номера документа.*/

public class IsCorrectFormat {

    public static boolean isCorrectFormat(String documentNumber) {
        if (documentNumber.length() == 22) {
            //System.out.println("The format document number is correct.");
            return true;
        } else {
            throw new IllegalArgumentException("Некорректный формат документа: " + documentNumber);
        }
    }

}
