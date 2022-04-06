/**
 * Escreva a descrição da classe Program aqui.
 * 2.Defina a classe Triângulo, sabendo que todos os triângulos possuem 3 lados. 
 * Defina os atributos da sua classe e os métodos de instância básicos. Implemente também métodos para:
    a)Verificar e retornar o tipo do triângulo (escaleno, equilátero ou isósceles).
    b)Calcular e retornar a área do triângulo.
    c)Calcular e retornar o perímetro do triângulo.
    Implemente uma classe Principal, contendo um método main,  e instancie nela 2 objetos da classe Triângulo.
    Mostre os resultados dos métodos a, b, e c para cada Triângulo.
 * @author (Adrian Lopes) 
 * @version (abril/2022)
 */
public class Program
{
   public static void main(String args[])
   {
     System.out.println("Triangulo um");
     Triangulo p1 = new Triangulo(15,15,18);
     System.out.println(p1.GetTipoTrianguloEArea());
     System.out.println(p1.GetPerimetro());
     
     System.out.println("Triangulo dois");
     Triangulo p2 = new Triangulo(30,50,20);
     System.out.println(p2.GetTipoTrianguloEArea());
     System.out.println(p2.GetPerimetro());
   }
}