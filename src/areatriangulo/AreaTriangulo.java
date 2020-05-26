package areatriangulo;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double a, b, c, p, semiperimetro, area;
        
        //entrada de dados
        System.out.print("Digite o lado 'A' do triangulo: ");
        a = entrada.nextInt();
        
        System.out.print("Digite o lado 'B' do triangulo: ");
        b = entrada.nextInt();
        
        System.out.print("Digite o lado 'A' do triangulo: ");
        c = entrada.nextInt();
                
        //processamento
        if(a+b > c && a+c > b && b+c> a) {
        
        //calculo
        p = (a+b+c)/2;
        area = p*(p-a)*(p-b)*(p-c);
        area = Math.sqrt(area);
        
        //saida
        System.out.print("A area do triangulo é: " + area);
            
        }
    }
}
