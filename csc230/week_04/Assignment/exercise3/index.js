let temperature = prompt("Please enter a temperature: ");
let scale = prompt("Is this Fahrenheit or Celsius? ");

function toFahrenheit(temperature) {
    let fahrenheit = (temperature * 9 / 5) + 32;
    console.log(fahrenheit);
}

function toCelsius(temperature) {
    let celsius = (temperature - 32) * 5 / 9;
    console.log(celsius);
}

if (scale == "Fahrenheit") {
    toCelsius(temperature);
} else if (scale == "Celsius") {
    toFahrenheit(temperature);
}