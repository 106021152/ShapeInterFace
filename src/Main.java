public class Main {
        public static void main(String[] args) {
            Circle C1 = new Circle(8);
            Circle C2 = new Circle(7);
            Circle C3 = new Circle(6);
            C1.Show();
            System.out.println("==============");
            C2.Show();
            System.out.println("==============");
            C3.Show();
            System.out.println("==============");

            Triangle T1 = new Triangle(8,8,80);
            Triangle T2 = new Triangle(7,7,70);
            Triangle T3 = new Triangle(6,6,60);
            T1.Show();
            System.out.println("==============");
            T2.Show();
            System.out.println("==============");
            T3.Show();
            System.out.println("==============");

            Rectangle R1 = new Rectangle(8,7);
            Rectangle R2 = new Rectangle(7,8);
            Rectangle R3 = new Rectangle(6,5);

            R1.Show();
            System.out.println("==============");
            R2.Show();
            System.out.println("==============");
            R3.Show();
            System.out.println("==============");
        }
    }