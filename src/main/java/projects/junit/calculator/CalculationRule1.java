package projects.junit.calculator;

import java.math.BigDecimal;

class CalculationRule1 extends CalculationRule {

    @Override
    BigDecimal calculate(BigDecimal income) {
        return income.multiply(new BigDecimal("0.25"));
    }

}
