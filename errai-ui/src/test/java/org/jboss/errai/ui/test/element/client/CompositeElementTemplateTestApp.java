package org.jboss.errai.ui.test.element.client;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.ui.test.element.client.res.CompositeElementFormComponent;
import org.jboss.errai.ui.test.element.client.res.ElementFormComponent;

import com.google.gwt.user.client.ui.RootPanel;

@Dependent
public class CompositeElementTemplateTestApp implements ElementTemplateTestApp {

  @Inject
  private RootPanel root;

  @Inject
  private CompositeElementFormComponent form;

  @PostConstruct
  public void setup() {
    root.add(form);
    System.out.println(root.getElement().getInnerHTML());
  }

  @Override
  public ElementFormComponent getForm() {
    return form;
  }
}