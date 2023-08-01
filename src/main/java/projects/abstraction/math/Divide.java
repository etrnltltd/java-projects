package projects.abstraction.math;

class Divide extends TwoArgumentMathOperation {

	public Divide(MathOperation leftArgument,
                  MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() / calculateRightSide();
	}
}

