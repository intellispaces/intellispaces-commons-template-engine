package tech.intellispaces.commons.templateengine.expression;

public interface Expressions {

  static ExpressionBuilder build() {
    return new ExpressionBuilder();
  }
}
