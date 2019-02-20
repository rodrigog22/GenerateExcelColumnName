/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generateexcelcolumns;

/**
 *
 * @author Rodrigo
 */
public class GenerateExcelColumns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] columnNames = generateExcelColumnName(100);
    
    for(char columnName : columnNames)
    {
    	System.out.print(columnName + " ");
    }
    }
    
    public static char[] generateExcelColumnName(int columnName)
  {
  	
   String[] letras = new String[columnName];
    char[] cadena = new char[columnName];
    char[] cadena2 = new char[columnName];
    int l=65;
    int contador=0;
    	for (int i=0; i<columnName;i++)
        {
        	//letras[i] = (String)('A'+i);
          	cadena[i] = (char)(l+contador);
          contador++;
          if(contador%27==0)
          {
            contador=0;
            cadena[i] = (char) ((char)(l+contador)+(char)(l+contador));
            
            
          }
          
        }
    
        
      return cadena;
    
  }
 
    
    
}
