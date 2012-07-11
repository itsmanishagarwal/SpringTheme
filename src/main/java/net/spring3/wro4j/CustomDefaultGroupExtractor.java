package net.spring3.wro4j;

import javax.servlet.http.HttpServletRequest;

import ro.isdc.wro.model.group.DefaultGroupExtractor;


public class CustomDefaultGroupExtractor extends DefaultGroupExtractor {

  @Override
  public boolean isMinimized(HttpServletRequest request) {
    return false;
  }
}
