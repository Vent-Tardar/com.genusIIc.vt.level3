package com.genusIIc.vt;

import java.io.*;

public class ComparisonDoc {
    private void checkingFiles(String org, String mdf) throws Exception {
        if(!(new File(org).exists() && new File(mdf).exists())) {
            throw new Exception("No files found");
        }

        if (org.equals(mdf)) throw new Exception("The same file was specified");
    }

    public void compare(String org, String mdf) throws Exception {
        checkingFiles(org, mdf);
        try(BufferedReader br_1 = new BufferedReader(new FileReader(org));
            BufferedReader br_2 = new BufferedReader(new FileReader(mdf))){

            int i = 1;
            String orgFile, mdfFile;

            while (((orgFile = br_1.readLine()) != null)
                    && ((mdfFile = br_2.readLine()) != null)) {
                if (!orgFile.equals(mdfFile)) {
                    System.out.printf("%d: <modified line value for line %d>\n", i, i);
                }
                i++;
            }
        }
        catch (Exception e){
            System.out.println();
            System.err.println("Somewhere in the loop is an error: " + e.getMessage());
        }
    }
}
