package tech.intellispaces.commons.templateengine.element;

import tech.intellispaces.commons.templateengine.expression.Expression;

import java.util.List;

class WhenStatementBranchImpl implements StatementWhenBranch {
  private final Expression condition;
  private final List<TemplateElement> subElements;

  WhenStatementBranchImpl(Expression condition, List<TemplateElement> subElements) {
    this.condition = condition;
    this.subElements = subElements;
  }

  @Override
  public Expression condition() {
    return condition;
  }

  @Override
  public List<TemplateElement> subElements() {
    return subElements;
  }
}
