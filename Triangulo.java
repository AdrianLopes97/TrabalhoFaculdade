
/**
 * Escreva uma descrição da classe Triangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Triangulo
{
    private double LadoA;
    private double LadoB; //x
    private double LadoC; //y

    /**
     * Construtor para objetos da classe Triangulo
     */
    public Triangulo(double ladoA,double ladoB,double ladoC)
    {
        // inicializa variáveis de instância
        LadoA = ladoA;
        LadoB = ladoB;
        LadoC = ladoC;
    }

     /**
     * Método que retorna o ladoA do triangulo
     * 
     * @param  
     * @return     LadoA 
     */
    public double GetLadoA ()
    {
      return LadoA;  
    };
     /**
     * Método que retorna o ladoB do triangulo
     * 
     * @param  
     * @return     LadoB 
     */
    public double GetLadoB ()
    {
      return LadoB;  
    };
     /**
     * Método que retorna o ladoC do triangulo
     * 
     * @param  
     * @return     LadoC
     */
    public double GetLadoC ()
    {
      return LadoC;  
    };
     /**
     * Método para setar um novo valor para a ladoA de um triangulo
     * 
     * @param  x
     * @return   
     */
    public void SetLadoA (double x)
    {
      LadoA = x;  
    };
     /**
     * Método para setar um novo valor para a ladoB de um triangulo
     * 
     * @param  x
     * @return   
     */
    public void SetLadoB (double x)
    {
      LadoB = x;  
    };
     /**
     * Método para setar um novo valor para a ladoC de um triangulo
     * 
     * @param  x
     * @return  
     */
    public void SetLadoC (double y)
    {
      LadoC = y;  
    };
     /**
     * Verificar e retornar o tipo do triângulo (escaleno, equilátero ou isósceles)
     * 
     * @param  x
     * @return  
     */
    public String GetTipoTrianguloEArea ()
    {   
        double h = LadoA * LadoB - Math.pow((LadoC/2),2);
        h = Math.sqrt(h);
        double a = (LadoC * h) / 2;
        return LadoA == LadoB && LadoA == LadoC ?
            "Equilátero sua area é " + a : (LadoA == LadoB || LadoA == LadoC || LadoB == LadoC  ?
            "Isósceles sua area é " + a : "Escaleno sua area é " + a);
    };
     /**
     * Calcular e retornar o perímetro do triângulo.
     * 
     * @param  x
     * @return  
     */
    public double GetPerimetro ()
    {   
        return LadoA + LadoB + LadoC;
    };
}
