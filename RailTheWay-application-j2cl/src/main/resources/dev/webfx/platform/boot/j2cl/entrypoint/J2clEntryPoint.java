package dev.webfx.platform.boot.j2cl.entrypoint;

import dev.webfx.platform.boot.spi.impl.j2cl.J2clApplicationBooterProvider;

import org.treblereel.j2cl.processors.annotations.GWT3EntryPoint;

import static dev.webfx.platform.javabase.emul.j2cl.ServiceRegistry.*;

public final class J2clEntryPoint {

    @GWT3EntryPoint
    public void entryPoint() {
        registerServiceProviders();
        new J2clApplicationBooterProvider().onModuleLoad();
    }

    public static void registerServiceProviders() {
        register(dev.webfx.kit.launcher.spi.WebFxKitLauncherProvider.class, dev.webfx.kit.launcher.spi.impl.gwt.GwtWebFxKitLauncherProvider::new);
        register(dev.webfx.kit.mapper.peers.javafxmedia.spi.WebFxKitMediaMapperProvider.class, dev.webfx.kit.mapper.peers.javafxmedia.spi.gwt.GwtWebFxKitMediaMapperProvider::new);
        register(dev.webfx.kit.mapper.spi.WebFxKitMapperProvider.class, dev.webfx.kit.mapper.spi.impl.gwt.GwtWebFxKitHtmlMapperProvider::new);
        register(dev.webfx.platform.boot.spi.ApplicationBooterProvider.class, dev.webfx.platform.boot.spi.impl.j2cl.J2clApplicationBooterProvider::new);
        register(dev.webfx.platform.boot.spi.ApplicationJob.class);
        register(dev.webfx.platform.boot.spi.ApplicationModuleBooter.class, dev.webfx.kit.launcher.WebFxKitLauncherModuleBooter::new, dev.webfx.platform.boot.spi.impl.ApplicationJobsBooter::new, dev.webfx.platform.resource.spi.impl.j2cl.J2clResourceModuleBooter::new);
        register(dev.webfx.platform.console.spi.ConsoleProvider.class, dev.webfx.platform.console.spi.impl.gwt.GwtConsoleProvider::new);
        register(dev.webfx.platform.resource.spi.ResourceProvider.class, dev.webfx.platform.resource.spi.impl.j2cl.J2clResourceProvider::new);
        register(dev.webfx.platform.resource.spi.impl.j2cl.J2clResourceBundle.class, dev.webfx.platform.resource.j2cl.embed.J2clEmbedResourcesBundle.ProvidedJ2clResourceBundle::new);
        register(dev.webfx.platform.scheduler.spi.SchedulerProvider.class, dev.webfx.platform.uischeduler.spi.impl.gwt.GwtUiSchedulerProvider::new);
        register(dev.webfx.platform.shutdown.spi.ShutdownProvider.class, dev.webfx.platform.shutdown.spi.impl.gwt.GwtShutdownProvider::new);
        register(dev.webfx.platform.uischeduler.spi.UiSchedulerProvider.class, dev.webfx.platform.uischeduler.spi.impl.gwt.GwtUiSchedulerProvider::new);
        register(dev.webfx.platform.useragent.spi.UserAgentProvider.class, dev.webfx.platform.useragent.spi.impl.gwt.GwtUserAgentProvider::new);
        register(javafx.application.Application.class, com.orangomango.railway.MainApplication::new);
    }
}