package week6.singleton;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if(singleton == null)
		{
			singleton = new Singleton();
			System.out.println("New Singleton created");
		}
		else
		{
			System.out.println("Singleton already created, instance will be passed");
		}

		return singleton;

	}

}
