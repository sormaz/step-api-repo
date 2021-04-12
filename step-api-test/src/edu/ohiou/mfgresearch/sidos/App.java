package edu.ohiou.mfgresearch.sidos;

import java.io.File;

import SchemaTranslation.SchemaTranslator;
import SchemaTranslation.StepExtractor;
import SchemaTranslation.SchemaTranslator.EXPORT_OPTIONS;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try {
        	SchemaTranslator st = new SchemaTranslator(new StepExtractor());
            st.loadSchema("", new File("C:\\Users\\sormaz\\Documents\\GitHub\\sidos\\SimpleExample.stp"));
            String t = (String) st.getTranslatedSchema(EXPORT_OPTIONS.CSV);
            System.out.println(t);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
