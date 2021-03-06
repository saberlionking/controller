/*
 * Copyright (c) 2014, 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.config.yang.config.distributed_datastore_provider;

import org.opendaylight.controller.config.api.DependencyResolver;
import org.opendaylight.controller.config.api.DynamicMBeanWithInstance;
import org.opendaylight.controller.config.spi.Module;
import org.osgi.framework.BundleContext;

public class DistributedConfigDataStoreProviderModuleFactory
        extends AbstractDistributedConfigDataStoreProviderModuleFactory {

    @Override
    public Module createModule(String instanceName, DependencyResolver dependencyResolver,
            BundleContext bundleContext) {
        DistributedConfigDataStoreProviderModule module = (DistributedConfigDataStoreProviderModule)super.createModule(
                instanceName,dependencyResolver,bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }

    @Override
    public Module createModule(String instanceName, DependencyResolver dependencyResolver,
        DynamicMBeanWithInstance old, BundleContext bundleContext) throws Exception {
        DistributedConfigDataStoreProviderModule module = (DistributedConfigDataStoreProviderModule)super.createModule(
                instanceName, dependencyResolver, old, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }


}
