package utility;

import java.util.Scanner;

public class InputHandler {

    Scanner input=
    new Scanner(System.in);

    public String inputString(
    String pesan){

        System.out.print(
        pesan);

        return input.nextLine();

    }

    public int inputInt(
    String pesan){

        System.out.print(
        pesan);

        return input.nextInt();

    }

    public void clear(){

        input.nextLine();

    }

}