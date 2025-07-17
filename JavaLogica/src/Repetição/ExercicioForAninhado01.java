package Repetição;

public class ExercicioForAninhado01 {

	public static void main(String[] args) {
		int i,j;
		for(j=9;j>=2;j--)
		{
			System.out.println("Tabuado do "+j);
			for(i=1;i<=10;i++)
				System.out.println(j+" x "+i+" = "+j*i);
		}

	}

}
