package enc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Encrypter {



    public Encrypter(){

        getFrequencyTable(readFile());

    }

    public String readFile() {
        File file = new File("test.txt");
        String input = null;
        try {
            Scanner s = new Scanner(file);
            input = s.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        System.out.println(input);
        return input;
    }

    public int[] getFrequencyTable(String input){
        int[]frequencyTable = new int[input.length()];
        char input1[] = input.toCharArray();
        for(int i = 0; i <input.length(); i++) {
            frequencyTable[i] = 1;
            for(int j = i+1; j <input.length(); j++)
            {
                if(input1[i] == input1[j])
                {
                    frequencyTable[i]++;
                    input1[j] = '0';
                }
            }
        }
        for(int k = 0; k <frequencyTable.length; k++)
        {
            if(input1[k] != ' ' && input1[k] != '0')
                System.out.println(input1[k] + "              " + frequencyTable[k]);
        }
        return frequencyTable;
    }

    public static void main(String[] args) {
        Encrypter E = new Encrypter();
    }
}
