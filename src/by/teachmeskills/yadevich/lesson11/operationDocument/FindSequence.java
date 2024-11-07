package by.teachmeskills.yadevich.lesson11.operationDocument;

/**- Проверить содержит ли номер документа последовательность "abc" и
 * вывеcти сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 */

public class FindSequence {

    public static void findSequence(String documentNumber){
        if(IsCorrectFormat.isCorrectFormat(documentNumber)){
            String str = "abc";
            if(documentNumber.toLowerCase().contains(str.toLowerCase())){
                System.out.println(documentNumber + ": contains a sequence - 'abc'.");
            }else {
                System.out.println(documentNumber + ": does not contain a sequence - 'abc'.");
            }
        }
    }
}
