package com.dodo.patterns.behavioral.Interpreter;

class Mul implements Expression {
    private Expression left, right;

    public Mul(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}
