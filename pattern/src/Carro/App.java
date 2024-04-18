package Carro;
public class App {
    public static void main(String[] args) throws Exception {
            Motor motor1 = new Motor(4, 150);
            Motor motor2 = new Motor(6, 200);
    
            Passeio passeio1 = new Passeio("NAB1637", "Hyundai", "Terracan 2.5 8V 100cv TB Diesel Aut.", 
                                        "Verde", 100, 4, motor1, 5);
            Passeio passeio2 = new Passeio("JNG0977", "Citroen", "C4 VTR 2.0 16V 143cv", 
                                        "Azul", 120, 4, motor2, 4);
    
            Carga carga1 = new Carga("GHI9012", "Porsche", "Panamera Turbo S 4.8",
                                        "Preto", 200, 4, motor1, 5000, 2000);
            Carga carga2 = new Carga("JKL3456", "Saturn", "SL-2 1.9",
                                         "Branco", 100, 4, motor2, 10000, 3000);
    
            System.out.println(passeio1.getPlaca() + " - " + passeio1.getModelo() + " - " + passeio1.calcVel(passeio1.getVelocMax()));
            System.out.println(passeio2.getPlaca() + " - " + passeio2.getModelo() + " - " + passeio2.calcVel(passeio2.getVelocMax()));
            System.out.println(carga1.getPlaca() + " - " + carga1.getModelo() + " - " + carga1.calcVel(carga1.getVelocMax()));
            System.out.println(carga2.getPlaca() + " - " + carga2.getModelo() + " - " + carga2.calcVel(carga2.getVelocMax()));
        }
}