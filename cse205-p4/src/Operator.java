//**************************************************************************************************************
// CLASS: Operator
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************

/**
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token {
	
    public Operator() {
    }

    /**
     * Will return true if the Operator is a BinaryOperator.
     */
    public abstract boolean isBinaryOperator();
    
    /**
     * Will return precedence of an operator.
     */
    public abstract int precedence();
    
    /**
     * Will return stack precedence of an operator.
     */
    public abstract int stackPrecedence();
    
}