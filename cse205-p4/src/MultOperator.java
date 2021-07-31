//**************************************************************************************************************
// CLASS: MultOperator
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************

/**
 * Represents the multiplication operator which is a specific type of binary operator.
 */
public class MultOperator extends BinaryOperator {

	public MultOperator() {
	}
	
	/**
	 * Returns the product of left and right operator.
	 */
	@Override
	public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
		return new Operand(pLhsOperand.getValue() * pRhsOperand.getValue());
	}
	/**
	 * Returns the precedence of multiply.
	 */
	@Override
	public int precedence() {
		return 3;
	}
	
	/**
	 * Returns the stack precedence of multiply.
	 */
	@Override
	public int stackPrecedence() {
		return 3;
	}
	
}