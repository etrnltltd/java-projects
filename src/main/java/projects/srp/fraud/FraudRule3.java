package projects.srp.fraud;

class FraudRule3 extends FraudRule {

    FraudRule3(String ruleName) {
        super(ruleName);
    }
    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }
}
