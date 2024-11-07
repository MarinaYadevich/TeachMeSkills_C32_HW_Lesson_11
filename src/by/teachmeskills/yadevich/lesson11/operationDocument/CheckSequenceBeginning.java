package by.teachmeskills.yadevich.lesson11.operationDocument;

/** Проверить начинается ли номер документа с последовательности 555.*/

public class CheckSequenceBeginning {

    public static void checkSequenceBeginning(String documentNumber){
        if(IsCorrectFormat.isCorrectFormat(documentNumber)){
            if(documentNumber.startsWith("555")){
                System.out.println(documentNumber + ": starts with sequence 555.");
            }else {
                System.out.println(documentNumber + ": does not start with sequence 555.");
            }
        }
    }
}
