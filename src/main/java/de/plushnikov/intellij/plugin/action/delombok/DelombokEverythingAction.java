package de.plushnikov.intellij.plugin.action.delombok;

import com.intellij.openapi.components.ServiceManager;
import de.plushnikov.intellij.plugin.processor.clazz.*;
import de.plushnikov.intellij.plugin.processor.clazz.builder.*;
import de.plushnikov.intellij.plugin.processor.clazz.constructor.AllArgsConstructorProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.constructor.NoArgsConstructorProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.constructor.RequiredArgsConstructorProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.enumcodeanddesc.WithCodeAndDescConstructorProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.enumcodeanddesc.WithCodeAndDescFieldProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.enumcodeanddesc.WithCodeAndDescMethodProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.fieldnameconstants.FieldNameConstantsOldProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.fieldnameconstants.FieldNameConstantsPredefinedInnerClassFieldProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.fieldnameconstants.FieldNameConstantsProcessor;
import de.plushnikov.intellij.plugin.processor.clazz.log.*;
import de.plushnikov.intellij.plugin.processor.field.*;
import de.plushnikov.intellij.plugin.processor.method.BuilderClassMethodProcessor;
import de.plushnikov.intellij.plugin.processor.method.BuilderMethodProcessor;
import de.plushnikov.intellij.plugin.processor.method.DelegateMethodProcessor;

public class DelombokEverythingAction extends AbstractDelombokAction {

  protected DelombokHandler createHandler() {
    return new DelombokHandler(true,
      ServiceManager.getService(RequiredArgsConstructorProcessor.class),
      ServiceManager.getService(AllArgsConstructorProcessor.class),
      ServiceManager.getService(NoArgsConstructorProcessor.class),

      ServiceManager.getService(DataProcessor.class),
      ServiceManager.getService(GetterProcessor.class),
      ServiceManager.getService(ValueProcessor.class),
      ServiceManager.getService(WitherProcessor.class),
      ServiceManager.getService(SetterProcessor.class),
      ServiceManager.getService(EqualsAndHashCodeProcessor.class),
      ServiceManager.getService(ToStringProcessor.class),

      ServiceManager.getService(CommonsLogProcessor.class), ServiceManager.getService(JBossLogProcessor.class), ServiceManager.getService(Log4jProcessor.class),
      ServiceManager.getService(Log4j2Processor.class), ServiceManager.getService(LogProcessor.class), ServiceManager.getService(Slf4jProcessor.class),
      ServiceManager.getService(XSlf4jProcessor.class), ServiceManager.getService(FloggerProcessor.class), ServiceManager.getService(CustomLogProcessor.class),

      ServiceManager.getService(GetterFieldProcessor.class),
      ServiceManager.getService(SetterFieldProcessor.class),
      ServiceManager.getService(WitherFieldProcessor.class),
      ServiceManager.getService(DelegateFieldProcessor.class),
      ServiceManager.getService(DelegateMethodProcessor.class),

      ServiceManager.getService(FieldNameConstantsOldProcessor.class),
      ServiceManager.getService(FieldNameConstantsFieldProcessor.class),
      ServiceManager.getService(FieldNameConstantsProcessor.class),
      ServiceManager.getService(FieldNameConstantsPredefinedInnerClassFieldProcessor.class),

      ServiceManager.getService(UtilityClassProcessor.class),

      ServiceManager.getService(BuilderPreDefinedInnerClassFieldProcessor.class),
      ServiceManager.getService(BuilderPreDefinedInnerClassMethodProcessor.class),
      ServiceManager.getService(BuilderClassProcessor.class),
      ServiceManager.getService(BuilderClassMethodProcessor.class),
      ServiceManager.getService(BuilderMethodProcessor.class),
      ServiceManager.getService(BuilderProcessor.class),

      ServiceManager.getService(SuperBuilderPreDefinedInnerClassFieldProcessor.class),
      ServiceManager.getService(SuperBuilderPreDefinedInnerClassMethodProcessor.class),
      ServiceManager.getService(SuperBuilderClassProcessor.class),
      ServiceManager.getService(SuperBuilderProcessor.class),
      ServiceManager.getService(CustomJsonSerializableProcessor.class),
      ServiceManager.getService(CustomFormatBeanProcessor.class),
      ServiceManager.getService(WithCodeAndDescFieldProcessor.class),
      ServiceManager.getService(WithCodeAndDescConstructorProcessor.class),
      ServiceManager.getService(WithCodeAndDescMethodProcessor.class)
      );

  }

}
