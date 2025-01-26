package Set1;

import java.text.DecimalFormat;

public class bmi_Calci {
    public static void main(String[] args) {
        double height = 5.3;
        double weight = 120.4;

        double height_in_meters = height * 0.4536;

        double bmi = weight / (height_in_meters * height_in_meters);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(bmi));

        if (bmi<18.5)
        {
            System.out.println("Your BMI is /'Underweight/'");
        } else if (bmi >= 18.5 && bmi<=24.9) {
            System.out.println("Your BMI is /'Healthy Range/'");
        } else if (bmi >=25 && bmi<=29.9) {
            System.out.println("Your BMI is /'Overweight/'");
        }else if (bmi>=30 && bmi<=39.9){
            System.out.println("Your BMI is /'Obesity/'");
        } else if (bmi>=40) {
            System.out.println("Your BMI is /'Sever Obesity/'");
        }
    }
}
