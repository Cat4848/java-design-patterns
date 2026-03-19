package Behavioral.Observer.WeatherStation;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  WeatherStation weatherStation;

  public StatisticsDisplay(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
    weatherStation.attach(this);
  }

  public void update() {
    this.temperature = weatherStation.getTemperature();
    this.humidity = weatherStation.getHumidity();
    display();
  }

  public void display() {
    System.out.println("The Statistics Display here:");
    System.out.println("Temperature: " + temperature + " C");
    System.out.println("Humidity: " + humidity);
  }
}