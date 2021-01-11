package helloworld;
import java.util.*;
import java.Scanner.*;

public class abc123 
    {
	String csvUrl="C:\\Users\\busis\\Desktop\\LTI\\Java Projects\\HelloWorld\\src\\com\\lti\\CaseStudy\\ComplaintManagement\\data.csv";
    String line="";
    String splitBy=",";
    int n=0;
    try {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(csvUrl));
        Set<String> productSet = new HashSet<String>();
        Set<String> responseSet = new HashSet<String>();
        Set<String> companySet = new HashSet<String>();
        Set<String> issueSet = new HashSet<String>();
        while ((line=bufferedReader.readLine())!=null){

            String[] entries = line.split(splitBy);
            int complaintId = Integer.parseInt(entries[8]);
            new FileToDataBase().insertIntoComplaints(entries[0],entries[1],
                    entries[2],entries[3],entries[4],entries[5],entries[6],complaintId);
           if(!productSet.contains(entries[1]))
                productSet.add(entries[1]);
            if(!responseSet.contains(entries[5]))
                responseSet.add(entries[5]);
            if(!companySet.contains(entries[3]))
                companySet.add(entries[3]);
            if(!issueSet.contains(entries[2]))
                issueSet.add(entries[2]);
            //This is used for making tables of issues, responses, products, companies

        }
        addIntoForeignTable(companySet,"companies");
        addIntoForeignTable(issueSet,"issues");
        addIntoForeignTable(productSet,"products");
        addIntoForeignTable(responseSet,"responses");
        //This is also used for creating foreign tables

    }

    catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}