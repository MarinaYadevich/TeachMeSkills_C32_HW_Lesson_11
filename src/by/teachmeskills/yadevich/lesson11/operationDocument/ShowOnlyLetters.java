package by.teachmeskills.yadevich.lesson11.operationDocument;

/** Вывести на экран только одни буквы из
 * номера документа в формате yyy/yyy/y/y в нижнем регистре.
 */

public class ShowOnlyLetters {

    public static void showOnlyLetters(String documentNumber){
        if(IsCorrectFormat.isCorrectFormat(documentNumber)) {
            String[] documentNumberArray = documentNumber.split("-");

            String result = documentNumberArray[1] + "/" + documentNumberArray[3] + "/"
                    + documentNumberArray[4].charAt(1) + "/" + documentNumberArray[4].charAt(3);
            System.out.println(result.toLowerCase());
        }
    }
}
