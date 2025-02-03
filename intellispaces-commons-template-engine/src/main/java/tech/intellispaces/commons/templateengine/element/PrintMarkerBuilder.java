package tech.intellispaces.commons.templateengine.element;

import tech.intellispaces.commons.templateengine.expression.Expression;

import java.util.Objects;

public final class PrintMarkerBuilder {
  private TemplateElementContext context;
  private Expression outputExpression;

  PrintMarkerBuilder() {}

  public PrintMarkerBuilder context(TemplateElementContext context) {
    this.context = context;
    return this;
  }

  public PrintMarkerBuilder outputExpression(Expression outputExpression) {
    this.outputExpression = outputExpression;
    return this;
  }

  public MarkerPrint get() {
    validate();
    return new PrintMarkerImpl(context, outputExpression);
  }

  private void validate() {
    Objects.requireNonNull(context);
    Objects.requireNonNull(outputExpression);
  }
}
