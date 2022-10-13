public class NumeroCase {
  public static void main(String[] args) {
    var estacion = "Verano";

    switch (estacion) {
      case "Otoño":
        System.out.println("Estamos en Otoño");
        break;
      case "Primavera":
        System.out.println("Estamos en Primavera");
        break;
      case "Verano":
        System.out.println("Estamos en Verano");
        break;
      case "Invierno":
        System.out.println("Estamos en Invierno");
        break;
      default:
        System.out.println("No es una Estación");
    }

  }
}
