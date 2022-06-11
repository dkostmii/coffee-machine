package coffeefactory;

/**
 * Hello, Coffee!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Coffee[] coffeefactory = new Coffee[10];

        for (int i = 0; i < coffeefactory.length; i++)
            coffeefactory[i] = new Coffee();

        System.out.println(
            String.format("Preparing %d coffees", coffeefactory.length)
        );

        for (Coffee c : coffeefactory) {
            System.out.println(
                String.format("Got a coffee. %s", c.toString())
            );
        }
    }
}
