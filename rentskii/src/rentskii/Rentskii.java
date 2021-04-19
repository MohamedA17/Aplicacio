/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentskii;
import java.util.Scanner;


/**
 *
 * @author DAM
 */
public class Rentskii {
    private final int TAMANYARRAY=200;
    
    static Scanner teclat = new Scanner (System.in);
    Bota[] botes = new Bota[TAMANYARRAY];
    Pal[] pals = new Pal[TAMANYARRAY];
    Esqui[] esquis = new Esqui[TAMANYARRAY];
    Kit[] kits = new Kit[TAMANYARRAY];
    
    int numKits=0;
    //static Scanner teclat = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        boolean sortir = false;
        int opcio;
                
        while(!sortir){
        	
            System.out.println("\n\n");
            //System.out.println("");
            System.out.println("Llogar kit d'Esqui");
            System.out.println("1. Llogar kit d'Esqui");
            System.out.println("2. Consultar kits llogats");          
            System.out.println("3. Consultar el kit més econòmic");
            System.out.println("4. Consultar numero de kits en que ha estat llogat un material determinat");
            System.out.println("5. Sortir");
            if (!teclat.hasNextInt()) {
            	System.out.println("Has d'introduir un numero com a opcio");
            	teclat.next();
            } else {            
                opcio=teclat.nextInt();
              
                switch (opcio) {
                    case 1:
                        System.out.println("Has seleccionat llogar Kits");
                        String idBota = teclat.next();
                       
                            
                        
                        
                        
                    	break;
                    	 
                    case 2:

                        break;
                         
                    case 3:
 
                        break;
                        
                    case 4:
                        
                        break;
                        
                    case 5:
                        System.out.println("Has seleccionat sortir");
                        sortir=true;
                    
                    default:
                        System.out.println("Sol nomeros entre 1 i 4");                             
                }
            }  
        }
    }
        
        private Bota obtenirBota(String idBota){       
            
            for (int i = 0; i < botes.length && botes[i]!= null; i++){
                if (botes[i].getIdBotes()==idBota)
                return botes[i];
            }
        return null;
        }
        
        private Pal obtenirPal (String idPal){
            
            for (int i = 0; i < pals.length && pals[i]!=null;i++){
                if (pals[i] .getIdPals()==idPal)
                    return pals[i];
            }
        return null;            
        }
    }    

