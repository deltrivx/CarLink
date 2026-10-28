package a8;

import android.content.Context;
import android.graphics.RenderNode;
import android.media.session.MediaSession;
import android.net.wifi.WifiNetworkSpecifier;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v1 {
    public static /* synthetic */ RenderNode a() {
        return new RenderNode("graphicsLayer");
    }

    public static /* synthetic */ MediaSession b(Context context) {
        return new MediaSession(context, "MediaSession", null);
    }

    public static /* synthetic */ WifiNetworkSpecifier.Builder c() {
        return new WifiNetworkSpecifier.Builder();
    }
}
