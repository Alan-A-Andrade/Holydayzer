import java.util.List;

public class Holydayzer{

  private static List<Feriados> fList = List.of(
    new Feriados("01/01/2023" ,"Confraternização mundial"),
    new Feriados("21/02/2023" ,"Carnaval"),
    new Feriados("17/04/2023" ,"Páscoa"),
    new Feriados("21/04/2023" ,"Tiradentes"),
    new Feriados("01/05/2023" ,"Dia do trabalho"),
    new Feriados("08/06/2023" ,"Corpus Christi"),
    new Feriados("07/09/2023" ,"Independência do Brasil"),
    new Feriados("12/10/2023" ,"Nossa Senhora Aparecida"),
    new Feriados("02/11/2023" ,"Finados"),
    new Feriados("15/11/2023" ,"Proclamação da República"),
    new Feriados("25/12/2023" ,"Natal")
  );


 public static void findOne(String date) {
  
  for(Feriados feriado: fList){

    if(feriado.getDate().equals(date)){
      System.out.println("dia " + date + "é feriado de " + feriado.getName());
      return;
    }

  }
  System.out.println("Não existe feriado nesse dia");
  
 } 

 public static List<Feriados> getAllFeriados() {

  return fList;
 } 

 public static void printFeriados() {

  for(Feriados feriado: fList){

      System.out.println(feriado.getDate() + " - " + feriado.getName());

  }
 } 

}