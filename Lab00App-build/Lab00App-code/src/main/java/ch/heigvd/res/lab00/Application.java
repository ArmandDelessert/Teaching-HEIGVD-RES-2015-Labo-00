package ch.heigvd.res.lab00;

/**
 * This is a very simple class used to demonstrate the specify-implement-validate
 * cycle. All methods used in the JUnit test are defined, so the test class will
 * compile. There is a bug in the add method, so one of the tests is expected
 * to fail.
 * 
 * If you look at the class named ch.heigvd.res.lab01.ApplicationTest, you will
 * find an executable specification for this class. The test methods specify
 * the expected behavior for this class.
 * 
 * @author Olivier Liechti
 */
public class Application
{
	private String message;

	public Application() {
		this("HEIG-VD rocks!");
	}

	public Application(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int add(int a, int b) {
		return a + b;
	}
}

interface IInstrument
{
	String play();
	int getSoundVolume();
	String getColor();
}

class Trumpet implements IInstrument
{
	private String sound;
	private int soundVolume;
	private String color;

	public Trumpet() {
		this.sound = "pouet";
		this.soundVolume = 3;
		this.color = "golden";
	}

	public String play() {
		return this.sound;
	}

	public int getSoundVolume() {
		return soundVolume;
	}

	public String getColor() {
		return this.color;
	}
}

class Flute implements IInstrument
{
	private String sound;
	private int soundVolume;
	private String color;

	public Flute() {
		this.sound = "tuuut";
		this.soundVolume = 1;
		this.color = "wooden";
	}

	public String play() {
		return this.sound;
	}

	public int getSoundVolume() {
		return soundVolume;
	}

	public String getColor() {
		return this.color;
	}
}
