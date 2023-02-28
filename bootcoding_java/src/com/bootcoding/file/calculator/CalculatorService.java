package com.bootcoding.file.calculator;

import java.util.List;

public class CalculatorService {
    public void process(List<Number> numbers){
        numbers.forEach(number -> {
            add(number);
            sub(number);
            mul(number);
        });

        FileService fs = new FileService();
        fs.writeToFile(numbers);
    }

    private void add(Number number){
        //TODO logic to add
        List<Integer> numbers = number.getNumbers();
        int sum=0;
        for (int i=0;i<numbers.size();i++){
        sum = sum +numbers.get(1);
    }
    number.setAddition(sum);
    }
    private void sub(Number number) {
        //TODO logic to sub
        List<Integer> numbers = number.getNumbers();
        int sub = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sub = sub - numbers.get(1);
        }
        number.setSubtraction(sub);
    }

    private void mul(Number number) {
        //TODO logic to mul
        List<Integer> numbers = number.getNumbers();
        int mul = 0;
        for (int i = 0; i < numbers.size(); i++) {
            mul = mul * numbers.get(1);
        }
        number.setMultiplication(mul);
    }
}
