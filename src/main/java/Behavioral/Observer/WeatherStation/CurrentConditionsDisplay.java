package Behavioral.Observer.WeatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private float pressure;
  WeatherStation weatherStation;

  public CurrentConditionsDisplay(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
    weatherStation.attach(this);
  }

  public void update() {
    this.temperature = weatherStation.getTemperature();
    this.humidity = weatherStation.getHumidity();
    this.pressure = weatherStation.getPressure();
    display();
  }

  public void display(){
    System.out.println("The Current Conditions display here:");
    System.out.println("Temperature: " + temperature + " C");
    System.out.println("Humidity: " + humidity);
    System.out.println("Pressure: " + pressure);
  }
}