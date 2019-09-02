package negocio;
import java.util.ArrayList;


public interface IOrdenador {
	
	public void inserirColecao(ArrayList<String> pColecao);
	public void informarValor(String pValor); 
	public Double getMaiorValor(); 
	public Double getMenorValor();
	public Double getValorMedio(); 
	public Double getValorMediana(); 
}
