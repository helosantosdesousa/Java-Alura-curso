package exericios.exericioTemperatura;
//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
//        Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de
//        conversão e exibe os resultados.
public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celciusParaFaren(double temperatura){
        //F= (9/5)*celcius+32
        return (9/5)*temperatura+32;
    }

    @Override
    public double farenParaCelcius(double temperatura){
        //C = (5/9)*(F-32)
        return (5/9)*(temperatura-32);
    }

}
