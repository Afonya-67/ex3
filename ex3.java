class Men {
    private String name;  // Имя
    private String surname;   // Фамилия
    private int yob;     // Год рождения

    // Конструктор
    public Men(String name, String surname, int yob) {
        this.name = name;
        this.surname = surname;
        this.yob = yob;
    }

    // Метод, выводящий значения всех полей
    public void pa() {
        System.out.println("Человек: " + name + " " + surname +
                ", год рождения: " + yob);
    }

    // Метод, принимающий два других объекта и выводящий строку
    public void mrb(Book book, Car car) {
        System.out.println(name + " читает книгу " + book.getTitle() +
                " про машину " + car.getBrand() + ".");
    }

}

class Car {
    private String st;         
    private int yor;  
    private double vol;  

 
    public Car(String brand, int manufactureYear, double engineVolume) {
        this.st = brand;
        this.yor = manufactureYear;
        this.vol = engineVolume;
    }


    public void pa() {
        System.out.println("Автомобиль: марка " + st +
                ", год выпуска: " + yor +
                ", объём двигателя: " + vol + " л");
    }

   
    public String getBrand()          { return st; }
    public int getManufactureYear()   { return yor; }
    public double getEngineVolume()   { return vol; }
}

 class Book {
    private String title;    // Название
    private String author;   // Автор
    private int year;        // Год выпуска

    // Конструктор
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Метод, выводящий значения всех полей
    public void pa() {
        System.out.println("Книга: \"" + title + "\", автор: " + author +
                ", год выпуска: " + year);
    }

    // Геттеры
    public String getTitle()  { return title; }
    public String getAuthor() { return author; }
    public int getYear()      { return year; }
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