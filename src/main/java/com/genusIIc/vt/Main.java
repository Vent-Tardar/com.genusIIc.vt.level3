package com.genusIIc.vt;

public class Main {
    public static void main(String[] args) throws Exception {
        if ((args.length == 1) || (args.length == 0)){
            System.err.println("You didn't enter the parameters completely. Check them out.");
        } else {
            ComparisonDoc cd = new ComparisonDoc();
            cd.compare(args[0], args[1]);
        }
    }
}
