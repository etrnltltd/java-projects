package projects.abstraction.math;

class Multiply extends TwoArgumentMathOperation {

	public Multiply(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() * calculateRightSide();
	}
}

