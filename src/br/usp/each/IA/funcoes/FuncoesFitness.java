package br.usp.each.IA.funcoes;

public class FuncoesFitness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcaoGold(1,0.5);
	}
	public static void funcaoGold(double x, double y){
		
		double a = (1 +(((Math.pow((x+y+1),2)))) * (19-(14*(Math.pow(x,2))) - 14*y + 6*(x*y) + 3*(Math.pow(y,2))));
		double b = (30 + (Math.pow((2*x - 3*y),2)) * (18-32*x + (12*(Math.pow(x,2))) + 48*y - 36*(x*y) + 27*(Math.pow(y,2))));
		double z = a*b;
		System.out.println(-z);
		
	}

}
