/**
 * generated by Xtext 2.16.0
 */
package org.example.domainmodel;

import org.example.domainmodel.DomainmodelStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DomainmodelStandaloneSetup extends DomainmodelStandaloneSetupGenerated {
  public static void doSetup() {
    new DomainmodelStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
