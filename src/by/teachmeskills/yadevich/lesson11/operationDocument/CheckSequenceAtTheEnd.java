package by.teachmeskills.yadevich.lesson11.operationDocument;

/** Проверить заканчивается ли номер документа на последовательность 1a2b.*/

public class CheckSequenceAtTheEnd {

    public static void checkSequenceAtTheEnd(String documentNumber){
        if(IsCorrectFormat.isCorrectFormat(documentNumber)){
            if(documentNumber.endsWith("1a2b")){
                System.out.println(documentNumber + ": ends with 1a2b.");
            }else {
                System.out.println(documentNumber + ":  doesn't ends with 1a2b.");
            }
        }
    }
}
