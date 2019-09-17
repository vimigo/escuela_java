class Operadores{
	public static void main (String[] argumentos)
	{
	
		System.out.println( 5 != 5 ? "Pues si": "Pues no");
		if (argumentos[0].equals ("aa"))
				System.out.println("Quieres dos AA");
			else
				System.out.println("Quieres otra cosa");
			System.out.println( argumentos[0].equals("aa")? "Quieres dos AA":"Quieres otra cosa" );
	byte result = 113 & 199;
	System.out.println("And binario " + result);
	
	}
	
}