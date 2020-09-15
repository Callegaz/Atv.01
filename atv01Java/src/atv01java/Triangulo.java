/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01java;

/**
 *
 * @author gabri
 */
public class Triangulo {
    int a;
    int b;
    int c;
    
    public Triangulo(){
        
    }
    
    public Triangulo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }   
    
    public boolean eTriangulo(){
        if(this.a < (this.b+this.c) || this.b < (this.a+this.c) || this.c < (this.a+this.b)){
            return true;
        }else{
           return false;
        }
    }
    
    public String tipoTriangulo(){
        
        if(this.a == this.b && this.b == this.c && this.a == this.c){
            return "Triangulo Equilátero";
        }else if(this.a != b && this.b != c && this.a != this.c) {
            return "Triangulo Escaleno";
        }else if((a == b && a != c) || (b == c && b != a) || (c == a && c != b)){
            return "Triângulo Isósceles";
        }else{
            return "Triângulo não identificado";
        }
    }
}
