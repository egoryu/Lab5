import java.util.Scanner;

public class Coordinates {
    private Float x; //Поле не может быть null
    private Integer y; //Поле не может быть null

    public Coordinates(Float x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinates insert() {
        Scanner in = new Scanner(System.in);
        String input = "";
        Float x;
        Integer y;

        System.out.println("Введите координаты: ");

        do {
            System.out.print("x: ");
            if (in.hasNextLine())
                input = in.nextLine();
            else {
                System.out.println("Плохой символ");
                System.exit(0);
            }
        } while(!Menu.isFloat(input));
        x = Float.parseFloat(input);

        do {
            System.out.print("y: ");
            if (in.hasNextLine())
                input = in.nextLine();
            else {
                System.out.println("Плохой символ");
                System.exit(0);
            }
        } while(!Menu.isInteger(input));
        y = Integer.parseInt(input);

        return new Coordinates(x, y);
    }

    public String parse(char del) {
        return Float.toString(x) + del + y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
