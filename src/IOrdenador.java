import java.util.ArrayList;


public interface IOrdenador {
	
	public void inserirColecao(ArrayList<String> pColecao);
	public void informarValor(String pValor); 
	public double getMaiorValor(); 
	public double getMenorValor();
	public double getValorMedio(); 
	public double getValorMediana(); 
}
