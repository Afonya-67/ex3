class Men {
	private String name;
	private String surname;
	private int yob;

	public Men(String name, String surname, int yob) {
		this.name = name;
		this.surname = surname;
		this.yob = yob;
	}

	public void pa() {
		System.out.println("Человек: " + name + " " + surname + ", год рождения: " + yob);
	}

	public void mrb(Book book, Car car) {
		System.out.println(name + " читает книгу \"" + book.getTitle() + "\" про машину \"" + car.getSt() + "\".");
	}

}

class Car {
	private String st;
	private int yor;
	private double vol;

	public Car(String st, int yor, double vol) {
		this.st = st;
		this.yor = yor;
		this.vol = vol;
	}

	public void pa() {
		System.out.println("Автомобиль: марка " + st + ", год выпуска: " + yor + ", объём двигателя: " + vol + " л");
	}

	public String getSt() {
		return st;
	}

	public int getYor() {
		return yor;
	}

	public double getVol() {
		return vol;
	}
}

class Book {
	private String title;
	private String author;
	private int year;

	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public void pa() {
		System.out.println("Книга: \"" + title + "\", автор: " + author + ", год выпуска: " + year);
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}
}

public class ex3 {
	public static void main(String[] args) {

		Men men = new Men("Иван", "Петров", 1990);
		Car car = new Car("Черный бумер", 2020, 2.5);
		Book book = new Book("Книжка про машинку", "Автор", 2018);

		men.pa();
		car.pa();
		book.pa();

		System.out.println();

		men.mrb(book, car);
	}
}
