package by.teachmeskills.yadevich.lesson11.operationDocument;

/** Вывести на экран буквы из номера документа в формате
 * "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
 */

public class OutputOfLettersStringBuilder {

    public static void outputOfLettersStringBuilder(String documentNumber){
        if(IsCorrectFormat.isCorrectFormat(documentNumber)){
            String[] documentNumberArray = documentNumber.split("-");
            StringBuilder stringBuilder = new StringBuilder("Letters: ");
            stringBuilder.append(documentNumberArray[1].toUpperCase());
            stringBuilder.append("/");
            stringBuilder.append(documentNumberArray[3].toUpperCase());
            stringBuilder.append("/");
            stringBuilder.append(documentNumberArray[4].toUpperCase().charAt(1));
            stringBuilder.append("/");
            stringBuilder.append(documentNumberArray[4].toUpperCase().charAt(3));

            System.out.println(stringBuilder);
        }
    }
}
