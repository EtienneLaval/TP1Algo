
public class Main {

	public static void main(String[] args) {
		
		int n=0;

//		Calcul du minimum
//		for (int i=1; i<50000002;i=i+1000000){
		
		for (int i=1; i<25502;i=i+500){
			++n;
			System.out.println("Num�ro : " + n);
			int tableau[] = RandomData.generate1d(i,0,500);
			
//			Calcul du minimum
//			MinArray.minArray(tableau);
			
//			Tri s�lectif
//			TriSelect.sort(tableau);
		
//			Tri � bulles
			BubbleSort.sort(tableau);
			
			
			System.out.println("Nombre d'�l�ments : " + i);
			
//			afficher le tableau
//			RandomData.printTab(tableau);
			
			System.out.println("");
		}

	}

}
