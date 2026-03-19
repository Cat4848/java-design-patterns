package Behavioral.Observer.WeatherStation;

import java.util.*;

public class WeatherStation implements Subject {
  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherStation() {
    this.observers = new ArrayList<Observer>();
  }

  public void attach(Observer o) {
    observers.add(o);
  }

  public void detach(Observer o) {
    observers.remove(o);
  }

  public void notifyObservers() {
    for (Observer o : observers) {
      o.update();
    }
  }

  public void setState(float temperature, float humidity, float pressure) {
    System.out.println("in setState");
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObservers();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}