package tortoproversion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Alfabeto {
    private String alfabeto[];
    private int indice;
    private String caminho;
    public Alfabeto(){
        caminho = "C:/Alfabeto.txt";
        alfabeto = new String[99999];
        int indice = 0;
        
    }
    
    public void Inicializar(){
        try{
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        while(br.ready()){
            String linha = br.readLine();
            if(linha != null){
            alfabeto[indice] = linha;
            indice++;
            }
        }
        br.close();
        }catch(IOException ioe){
         ioe.printStackTrace();
        }
    }
    
    public void setCaminho(String caminho){
        this.caminho = caminho;
    }
    
    public String getAlfabeto(int a){
        return alfabeto[a];
    }
    
    public int getTamanhoAlfabeto(){
        return alfabeto.length;
    }
}
