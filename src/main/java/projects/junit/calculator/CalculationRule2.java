package projects.junit.calculator;

import java.math.BigDecimal;

class CalculationRule2 extends CalculationRule {

    @Override
    BigDecimal calculate(BigDecimal income) {
        var incomeAbove20000 = income.subtract(new BigDecimal("20000"));
        return incomeAbove20000.multiply(new BigDecimal("0.40")).add(new BigDecimal("5000"));
    }

}
