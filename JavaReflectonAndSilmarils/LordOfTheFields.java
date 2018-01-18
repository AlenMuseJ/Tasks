import java.lang.reflect.Field;

public class LordOfTheFields {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException
	{
		Silmarils fakeSilmaril = new Silmarils(); 
		
		System.out.println("The owner of the Silmarils once was " + fakeSilmaril.getOwner() + ".");
        
        Field f = fakeSilmaril.getClass().getDeclaredField("owner");
        f.setAccessible(true); 
        f.set(fakeSilmaril, "Melkor"); 
        System.out.println("But now they belong to " + fakeSilmaril.getOwner() + "!");
        
	}
}
