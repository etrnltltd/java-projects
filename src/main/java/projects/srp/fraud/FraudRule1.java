package projects.srp.fraud;

class FraudRule1 extends FraudRule{

    public FraudRule1(String ruleName){
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
