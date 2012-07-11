package net.spring3.wro4j;

import ro.isdc.wro.manager.factory.BaseWroManagerFactory;
import ro.isdc.wro.model.group.GroupExtractor;


public class CustomWroManagerFactory extends BaseWroManagerFactory {

  @Override
  protected GroupExtractor newGroupExtractor() {
    // TODO Auto-generated method stub
    return new CustomDefaultGroupExtractor();
  }
}
