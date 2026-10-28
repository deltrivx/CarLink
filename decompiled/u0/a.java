package u0;

import o2.w;
import t8.z;
import y1.a0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a extends i9.j implements h9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f12966i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar) {
        super(1, i9.k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f12966i = lVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        float[] fArr = ((a0) obj).f14874a;
        w wVar = (w) this.f12966i.f12995r.getValue();
        if (wVar != null) {
            if (!wVar.isAttached()) {
                wVar = null;
            }
            if (wVar != null) {
                wVar.k(fArr);
            }
        }
        return z.f12851a;
    }
}
