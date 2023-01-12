public class Feriados {
  private String date;
  private String name;
    
  public Feriados() {
  }

  public Feriados(String date, String name) {
    this.date = date;
    this.name = name;
  }


  public String getDate() {
    return date;
  }
  public String getName() {
    return name;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public void setName(String name) {
    this.name = name;
  }
  
}
