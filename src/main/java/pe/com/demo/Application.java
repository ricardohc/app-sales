package pe.com.demo;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        OperacionesRicardo oRic=new OperacionesRicardo();
        oRic.sumar(10, 20);

        oRic.resta(10, 30);


        ContacMarcos oMarc= new ContacMarcos();
        System.out.println(oMarc.concatenarMarcos("Mar", "cos"));
    }



}

