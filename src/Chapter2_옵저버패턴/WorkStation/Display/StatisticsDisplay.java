package Chapter2_옵저버패턴.WorkStation.Display;

import Chapter2_옵저버패턴.WorkStation.Observer.DisplayElement;
import Chapter2_옵저버패턴.WorkStation.Observer.Observer;
import Chapter2_옵저버패턴.WorkStation.Observer.Subject;
import Chapter2_옵저버패턴.WorkStation.WorkStation.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject wetherDate;

    public StatisticsDisplay(WeatherData weatherData) {
        this.wetherDate = wetherDate;
        wetherDate.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure  = pressure;
        display();
    }
}
