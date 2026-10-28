package r2;

import android.view.RenderNode;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k2 {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i7) {
        renderNode.setAmbientShadowColor(i7);
    }

    public static void d(RenderNode renderNode, int i7) {
        renderNode.setSpotShadowColor(i7);
    }
}
