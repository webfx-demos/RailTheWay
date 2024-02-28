// File managed by WebFX (DO NOT EDIT MANUALLY)
package dev.webfx.platform.resource.j2cl.embed;

import org.treblereel.j2cl.processors.annotations.GWT3Resource;
import org.treblereel.j2cl.processors.common.resources.ClientBundle;
import org.treblereel.j2cl.processors.common.resources.TextResource;
import dev.webfx.platform.resource.spi.impl.j2cl.J2clResourceBundleBase;

@GWT3Resource
public interface J2clEmbedResourcesBundle extends ClientBundle {

    J2clEmbedResourcesBundle R = J2clEmbedResourcesBundleImpl.INSTANCE;

    @Source("/dev/webfx/platform/meta/exe/exe.properties")
    TextResource r1();

    @Source("/worlds/world1.wld")
    TextResource r2();

    @Source("/worlds/world2.wld")
    TextResource r3();

    @Source("/worlds/world3.wld")
    TextResource r4();

    final class ProvidedJ2clResourceBundle extends J2clResourceBundleBase {
        public ProvidedJ2clResourceBundle() {
            registerResource("dev/webfx/platform/meta/exe/exe.properties", () -> R.r1().getText());
            registerResource("worlds/world1.wld", () -> R.r2().getText());
            registerResource("worlds/world2.wld", () -> R.r3().getText());
            registerResource("worlds/world3.wld", () -> R.r4().getText());
        }
    }
}