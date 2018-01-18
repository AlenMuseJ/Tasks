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
        
        System.out.println("They were " + fakeSilmaril.getDescription() + ".");
        
        f = fakeSilmaril.getClass().getDeclaredField("description");
        f.setAccessible(true);
        String MelkorWords = "They are on the dark side now!";
        System.out.println("Melkor said " + MelkorWords + "");
        f.set(fakeSilmaril, MelkorWords);
        System.out.println("But they are still " + fakeSilmaril.getDescription() + ". Because you can't change final fields.");
	}
}
