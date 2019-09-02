package negocio;
import java.util.ArrayList;


public class Ordenador implements IOrdenador{
	
	ArrayList<Double> listaNumero;
	double maiorValor; 
	double menorValor; 
	
	

	public Ordenador() {
		
		this.listaNumero = new ArrayList<Double>();
		maiorValor = 0; 
		menorValor = 0; 
	}
	
	private void alteraMaiorValor(String Valor) {
		if(maiorValor < Double.parseDouble(Valor)) {
			maiorValor = Double.parseDouble(Valor); 
		}
	}

	@Override
	public void inserirColecao(ArrayList<String> pColecao) {
		// TODO Auto-generated method stub
		for (String string : pColecao) {
			this.listaNumero.add(Double.parseDouble(string));
			alteraMaiorValor(string);
		}
		
	}

	@Override
	public void informarValor(String pValor) {
		// TODO Auto-generated method stub
		this.listaNumero.add(Double.parseDouble(pValor));
		alteraMaiorValor(pValor);
		
	}

	@Override
	public Double getMaiorValor() {
		// TODO Auto-generated method stub
		return maiorValor;
	}

	@Override
	public Double getMenorValor() {
		// TODO Auto-generated method stub
		for (Double double1 : listaNumero) {
			if(menorValor < double1) {
				menorValor = double1.doubleValue();
			}
		}
		return menorValor;
	}

	@Override
	public Double getValorMedio() {
		// TODO Auto-generated method stub
		double medio = 0; 
		for (Double double1 : listaNumero) {
			medio += double1.doubleValue();		
					
		}
		
		return (medio/listaNumero.size());
	}

	@Override
	public Double getValorMediana() {
		// TODO Auto-generated method stub
		
		if(listaNumero.size()%2 != 0) {
			return listaNumero.get(((listaNumero.size()/2)));
			
		}else {
			return (listaNumero.get(((listaNumero.size()/2))) + listaNumero.get(((listaNumero.size()/2)+1)))/2;
		}
		
		
	}

	

}
