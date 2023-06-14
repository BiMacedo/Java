package Nivel;

public class pessoa {
  private String sexo;
  private double altura;

  public pessoa (String sexo, double altura){
    this.sexo = sexo;
    this.altura = altura;
  }
  public void verificarAltura(){
    switch (sexo){
      case "Masculino":
        if (altura < 1.70){
          System.out.println("Baixa estatura para um homem ");

        }else if (altura >=1.70 && altura <= 1.80){
          System.out.println("Estatura média para um homem ");
        } else {
          System.out.println("Altura acima da média");
        }
        break;


        case "Feminino":
          if (altura < 1.60){
            System.out.println("Baixa estatura");
          } else if (altura >=1.60 && altura <= 1.70){
            System.out.println("Estatura na média");
          }else {
            System.out.println("Acima da média");
          }
          break;

        default:
        System.out.println("Sexo desconhecido");
        break;
    }
  }
}
