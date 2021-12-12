package pack;

/*

  Created by: Eric F Vara
  Data: 12/12/2021

  program that determines whether there is a protein in a strand of DNA.
     -. .-.   .-. .-.   .-. .-.   .-. .-.   .-. .-.   .-. .-.   .
        \   \ /   \   \ /   \   \ /   \   \ /   \   \ /   \   \ /
       / \   \   / \   \   / \   \   / \   \   / \   \   / \   \
      ~   `-~ `-`   `-~ `-~   `-~ `-`   `-~ `-~   `-~ `-`   `-~ `-

  A protein has the following qualities:
    - It begins with a “start codon”: ATG.
    - It ends with a “stop codon”: TGA.
    - In between, each additional codon is a sequence of three
      nucleotides.

  So for example:
    ATGCGATACTGA is a protein because it has the start codon ATG, the
    stop codon TGA, and the length is divisible by 3.
    ATGCGATAGA is not a protein because the sequence length is not
    divisible by 3, so the third condition is not satisfied.

*/

public class DNASequencing {
    public static void main(String[] args) {

        // DNA strand test subjects
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // Controls DNA tests
        String dna = dna1;

        // Tracker variables
        int length = dna.length();
        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");

        // Test dna strands
        if(start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Condition 1, 2 and 3 are satisfied.");
        } else {
            System.out.println("No protein");
        }

        // Prints dna strands results
        System.out.println("Strand Length: " + length);
        System.out.println("Condition 1: Start " + start);
        System.out.println("Condition 2: Stop " + stop);
        System.out.println("Condition 3: remainder " + (start - stop) % 3);

    }
}