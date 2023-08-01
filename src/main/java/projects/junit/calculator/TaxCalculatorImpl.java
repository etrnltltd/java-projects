package projects.junit.calculator;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {


    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.intValue() <= 20000) {
            return new CalculationRule1().calculate(income);
        } else {
            return new CalculationRule2().calculate(income);
        }
    }

}
