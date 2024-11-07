package by.teachmeskills.yadevich.lesson11;

import by.teachmeskills.yadevich.lesson11.operationDocument.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the document number(format - xxxx-yyy-xxxx-yyy-xyxy): \n");
        String documentNumber = sc.nextLine();
        sc.close();

        //IsCorrectFormat.isCorrectFormat(documentNumber);
        //OutputTwoBlocks.outputTwoBlocks(documentNumber);
        //ShowDocumentNumber.showDocumentNumber(documentNumber);
        //ShowOnlyLetters.showOnlyLetters(documentNumber);
        //OutputOfLettersStringBuilder.outputOfLettersStringBuilder(documentNumber);
        //FindSequence.findSequence(documentNumber);
        //CheckSequenceBeginning.checkSequenceBeginning(documentNumber);
        CheckSequenceAtTheEnd.checkSequenceAtTheEnd(documentNumber);

    }
}
