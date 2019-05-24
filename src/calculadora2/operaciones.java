/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

/**
 *
 * @author Usuario
 */
public class operaciones {
    
    private String digito;
    private int resultado;
    private boolean suma;
    private boolean multiplicacion;
    private boolean division;
    private boolean resta;
    private boolean borrar;
    private String clear;
    private boolean binario;
    private boolean octagonal;
    private boolean hexagonal;
    private int conversion;
    
    public operaciones(){
        
        digito="";
        suma = false;
        multiplicacion= false;
        division= false;
        resta= false;
        borrar = false;
        binario = false;
        octagonal = false;
        hexagonal = false;
        conversion = 10;
    }

    public String getClear() {
        return clear;
    }

    public void setClear(String clear) {
        this.clear = clear;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getDigito() {
        return digito;
    }

    public void setConversion(int conversion) {
        this.conversion = conversion;
    }

    public int getConversion() {
        return conversion;
    }
 
    public void agregarNumero(int numero){
    setDigito(digito+numero);
}
    public void binario (String numero){
        //numero = Integer.valueOfBinary();
        binario= true;
    }
    public void octagonal(String numero){
        octagonal= true;
    }
    public void hexagonal(String numero){
        hexagonal= true;
    }
    public int conversion(){
        if (binario == true){
           conversion = 2;
           digito= "";
        }
        if (octagonal == true){
            conversion = 8;
            digito = "";
        }
        if (hexagonal == true){
            conversion = 16;
            digito = "";
        }
        binario = false;
        octagonal = false;
        hexagonal = false;
        return conversion;
    } 
    public void suma (String numero,int conversion){
        this.resultado = Integer.parseInt(numero,conversion);
        suma=true;
        setDigito("");
    }
    
    public void resta (String numero,int conversion){
        this.resultado = Integer.parseInt(numero,conversion);
        resta=true;
        setDigito(""); 
    }
    
    public void multiplicacion (String numero,int conversion){
        this.resultado = Integer.parseInt(numero,conversion);
        multiplicacion=true;
        setDigito("");
        
    }
    
    public void dividir (String numero,int conversion){
        this.resultado = Integer.parseInt(numero,conversion);
        division=true;
        setDigito("");
        
    }
    public void borrar (String numero){
        this.resultado = Integer.parseInt(numero);
        borrar = true;
        setDigito("");
    }
    
    public int resultadoOperacion (String numero){
        
        if (suma == true){
            resultado = resultado + Integer.parseInt(numero);
            digito="";
        }
        
        if (multiplicacion == true){
            resultado = resultado * Integer.parseInt(numero);
            digito="";
        }
        
        if (division == true){
            resultado = resultado / Integer.parseInt(numero);
            digito="";
        }
        if (resta == true){
            resultado = resultado - Integer.parseInt(numero);
            digito="";
        }
        if (borrar == true){
            setClear("");
            digito="";
        }
        
        suma=false;
        resta=false;
        division=false;
        resta=false;
        
        
        return resultado;
    }
    
}
