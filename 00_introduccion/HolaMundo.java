class HolaMundo
{
public static void main (String [] args)
{
	System.out.println("Hola mundo");
	String nombre = "vicente";
	System.out.println("hola mundo " + nombre);
	byte unbyte =127;
	System.out.println("hola mundo " + unbyte);
	int unint= 1000;
	float myfloat = 1.2345678901f;
	double mydouble = 1.23456789123456789;
	long mylong = 1234567890123456789L;
	char mychar = 'z';{
    char [] texto = {'a','b','c'};
	System.out.println("hola mundo " + unint + " f " + myfloat + " esto es doble " 
	+ mydouble + " el long " + mylong + " el char " + mychar);
	System.out.println("caracter "  + texto[1]);
	for (int i =0;i < texto.length;i + 1);
	System.out.println ("caracter:" + texto[i]);
	}
}
}