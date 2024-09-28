package com.shima.openapitools.codegen;

import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.JavaClientCodegen;

public class CustomCodegen extends JavaClientCodegen implements CodegenConfig {

  protected String customPackage = "com.shima.custom.codegen.openapitools";

  public CustomCodegen() {
    this.setOutputDir("src/main/java");
    this.setLibrary("resteasy");
    this.setModelPackage(customPackage + ".model");
    this.setApiPackage(customPackage + ".api");
  }

  @Override
  public String getName() {
    return "customCodegen";
  }

  @Override
  public void processOpts() {
    super.processOpts();
    apiTemplateFiles.clear();
    modelTemplateFiles.clear();
    apiDocTemplateFiles.clear();
    apiTestTemplateFiles.clear();
    modelTestTemplateFiles.clear();
    supportingFiles.clear();
    modelDocTemplateFiles.clear();

    // Register Mustache templates for API generation
    apiTemplateFiles.put("api.mustache", ".java");

    // Add any additional template files (like models if needed)
    modelTemplateFiles.put("model.mustache", ".java");
  }
}
