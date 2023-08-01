package projects.srp.fraud;

class FraudRule2 extends FraudRule {

    FraudRule2(String ruleName) {
        super(ruleName);
    }
    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
