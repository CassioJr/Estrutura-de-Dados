package exerciciosPilhaFilhaFila;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class AmigosHabay {
 
    public static void main(String[] args) throws IOException {
    	int i = 0;
    	String nome,tam = null,ganhador = null;
    	String amigo = null;
    	String vet1[] = new String[1000];
    	String vet2[] = new String[1000];
    	ArrayList<String> participantes = new ArrayList<>();
    	ArrayList<String> votos = new ArrayList<>();
    	Set<String> semRepeticao = new LinkedHashSet<String>();
    	
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		nome = sc.nextLine();
    		String info[] = nome.split(" ");
    		if(!nome.equals("FIM")) {
    		vet1[i] = info[0];
    		vet2[i]= info[1];    	
    		i++;
    		}else {
    			break;
    		}
    		
    	}
    	
    	for(i=0;i<vet2.length;i++) {
    		if(vet2[i]!= null) {
    		if(vet2[i].equals("NO")) {
    			votos.add(vet1[i]);
    			vet2[i] = null;
    			vet1[i]= null;
    		}else {
    			participantes.add(vet1[i]);
    		}
    		}
    		}
 
    	for(int x=0;x<vet1.length;x++) {
    		if(vet1[x]!=null) {
    			tam = vet1[x];  
    			System.out.println(tam);
    				break;
    		}
    	}

        	for(i=1;i<vet1.length;i++) {
        		if(vet1[i]!=null) {
        			amigo = vet1[i];
        			if(tam != null && amigo != null) {
        			if(amigo.length()> tam.length()) {
        				ganhador = amigo;
        				break;
        			}else {
        				ganhador= tam;
        			}
        			}
        		}
    			
    		}
        	Collections.sort(participantes);
        	Collections.sort(votos);
        	for (String valor: participantes) {
    	    semRepeticao.add(valor);
    	}
        	String dados[] = semRepeticao.toString().replace("[", "").replace("]", "").replace(",", "").split(" ");
    	for(i=0;i<dados.length;i++) {
    		  vet1[i]= dados[i];
    		  System.out.println(vet1[i]);
  
    	}
  		 
  		  String dados2[] = votos.toString().replace("[", "").replace("]", "").replace(",", "").split(" ");
  		  for(i=0;i<dados2.length;i++) {
  		  vet2[i]= dados2[i];
  		  System.out.println(vet2[i]);
  	}
    	System.out.println("\nAmigo do Habay:\n"+ganhador);	 
	}
    	
    
    }

