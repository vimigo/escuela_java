class EstructurasControl{
	
	public static void main (String[] argumentos ){
		for (int i =0; i < argumentos.length ; i ++ )
		{
			System.out.println( "arg " + i );
			System.out.println( "arg " + argumentos[i] );
			
		}
		int i =0;
		while (i < argumentos.length){
			
			System.out.println( "arg " + i );
			System.out.println( "arg " + argumentos[i] );
			i=i + 1;
		}
		do {
			System.out.println ("Siempre se muestra");
		while}
		( false );
			if(true)
				
			System.out.println "Es cierto");
			else
				System.out.println ("Es falsa");
			}
			int valor = 1;
		switch (valor){
			case 0:
			System.out.println ("valor cero");
			break;
			case 1 :
			System.out.println "Valor uno");
			break
			case 2:
			System.out.println("Valor dos");
			break;
			default: System.out.println(" valor defecto");
			break;
			
		}
	}
	
	
}