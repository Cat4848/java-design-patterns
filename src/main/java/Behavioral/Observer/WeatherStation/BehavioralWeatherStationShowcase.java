package Behavioral.Observer.WeatherStation;

import Main.Showcase;

public class BehavioralWeatherStationShowcase  implements Showcase{
  public void show() {
    WeatherStation weatherStation = new WeatherStation();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);

    weatherStation.setState(33.1f, 70, 1000);
    weatherStation.setState(43.1f, 88, 1777);
  }
}