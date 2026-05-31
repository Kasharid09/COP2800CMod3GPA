
//PalmerPenguinsM3.java
//Kashari Denson
// 05/31/2026
// analysis of penguin species

public class PalmerPenguinsM3 {
    
        //  STATIC FINAL VARIABLES 
        static final String SP_CHINSTRAP = "Chinstrap";
        static final String SP_GENTOO = "Gentoo";
        static final String SP_ADELIE = "Adelie";
        static final int TOTAL_SPECIES = 3;
        static final int NUM_CHINSTRAP = 68;
        static final int NUM_GENTOO = 123;
        static final int NUM_ADELIE = 151;
        
        
    public static void main(String[] args) {
        
        // output the species names with intro text
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO  + "!");
        System.out.println("and last but not least...");
        System.out.println("\t" + SP_ADELIE + "!");
        System.out.println("There are a total of " + TOTAL_SPECIES + 
                            " penguin species in this dataset.");
        
        // cal. penguin percentage
        int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
        
        // percentage of each penguin 
        double percentageOfChinstrap = (NUM_CHINSTRAP / (double)totalPenguins) * 100;
        double percentageOfGentoo = (NUM_GENTOO / (double)totalPenguins) * 100;
        double percentageOfAdelie = (NUM_ADELIE / (double)totalPenguins) * 100;
        
        // output of the total amount of penguins and the percentage
        
        
        System.out.println("There are a total of " + totalPenguins + 
                              " in the dataset");
        
        System.out.printf("%s: %d (%.2f%%) \n", "Chinstrap", NUM_CHINSTRAP, 
                            percentageOfChinstrap);
        
        System.out.printf("%s: %d (%.2f%%) \n", "Gentoo", NUM_GENTOO, 
                            percentageOfGentoo);
        
        System.out.printf("%s: %d (%.2f%%)\n", "Chinstrap", NUM_ADELIE, 
                            percentageOfAdelie);
        
        System.out.println(" ");
        // branch analysis on who's popular 
        
        if ((NUM_CHINSTRAP > NUM_GENTOO) && (NUM_CHINSTRAP > NUM_ADELIE)) {
            
               System.out.println("Branching Analysis:");
               System.out.println(SP_CHINSTRAP + 
                " penguins are the most populous");   }
        
        else if((NUM_GENTOO > NUM_CHINSTRAP) && (NUM_GENTOO > NUM_ADELIE))  {
               System.out.println("Branching Analysis:");
               System.out.println(SP_GENTOO + 
                       " penguins are the most populous");}
        
        else if((NUM_ADELIE > NUM_CHINSTRAP) && (NUM_ADELIE > NUM_GENTOO)) {
            System.out.println("Branching Analysis:");
            System.out.println(SP_ADELIE + 
                    " penguins are the most populous");}
       
        else  {  System.out.println("Brancing Analysis");  
                 System.out.println("There is a tie "
                 + "between species for the most populous");  }
        
        System.out.println(" ");
        
        // creation of the switch case 
        String chosenSpecies = SP_ADELIE ;
        
        switch (chosenSpecies) {
          
            case SP_ADELIE:
                System.out.println("Individual Species Switch Statement"
                + "Analysis:");
                System.out.printf("%s: %d (%.2f%%)\n" ,SP_ADELIE, NUM_ADELIE,
                percentageOfAdelie);
                break;
            case  SP_GENTOO:
                System.out.println("Individual Species Switch Statement"
                + "Analysis:");
                System.out.printf("%s: %d (%.2f%%) \n", "Gentoo",
                        NUM_GENTOO, percentageOfGentoo);
                break;
            case SP_CHINSTRAP:
                System.out.println("Individual Species Switch Statement"
                + "Analysis:");
                System.out.printf("%s: %d (%.2f%%) \n", "Chinstrap",
                        NUM_CHINSTRAP, percentageOfChinstrap);
                break;
            default:
                System.out.println("Switch Statement Analysis:");
                System.out.println("Species not recognized.");
                break;
        }
        System.out.println(" ");
    }
}
