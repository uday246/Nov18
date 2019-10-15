package Nov9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class AutoParts
{
        public static void main( String[] args ) throws Exception
        {
                BufferedReader num2quantFile = new BufferedReader( new FileReader( "num2quant.txt" ) );
                BufferedReader num2nameFile = new BufferedReader( new FileReader( "num2name.txt" ) );
                
                //  STEP #1: read num2name.txt into a map named num2name and print that map part#<TAB>partName sorted vertically by part#
                
                String line=num2nameFile.readLine();
                HashMap<Integer,String> names=new HashMap<Integer,String>();
                while(line!=null){
                	
                	names.put(Integer.parseInt(line.split(" ")[0].trim()), line.split(" ")[1].trim());
                	line=num2nameFile.readLine();
                }
                HashMap<Integer,Integer> quant=new HashMap<Integer,Integer>();
                line=num2quantFile.readLine();
                while(line!=null){
                	if(line.trim().length()==0)
                		continue;
                	quant.put(Integer.parseInt(line.split(" ")[0].trim()), Integer.parseInt(line.split(" ")[1].trim()));
                	line=num2quantFile.readLine();
                }
                System.out.println("Map of part # => name:"); // LEAVE THIS IN HERE

                                
                //  STEP #2: read num2quant.txt into map of same name. DON'T PRINT map#2
                //  Use both 1st & 2nd map to print a joint of the two tables: part#<TAB>name<TAB>quantity sorted vertically again by part#
                System.out.println("Join of part# => name => quantity:"); // LEAVE THIS HERE
                
                for(Map.Entry<Integer,String> en:names.entrySet()){
                	System.out.println(en.getKey()+"\t"+en.getValue());
                }
                

        } // END MAIN

} // END CLASS
