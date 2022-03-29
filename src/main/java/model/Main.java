package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Main {
     private double temp;
     @JsonProperty("feels_like")
     private double feelsLike;
     @JsonProperty("temp_min")
     private double tempMin;
     @JsonProperty("temp_max")
     private double tempMax;
     private int pressure;
     private int humidity;
     @JsonProperty("sea_level")
     private int seaLevel;
     @JsonProperty("grnd_level")
     private int groundLevel;
}
