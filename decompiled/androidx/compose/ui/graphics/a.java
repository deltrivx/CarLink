package androidx.compose.ui.graphics;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import r1.p;
import y1.h0;
import y1.l0;
import y1.p0;
import y1.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final p a(p pVar, float f10, float f11, float f12, long j5, l0 l0Var, boolean z10, long j10, long j11) {
        return pVar.a(new GraphicsLayerElement(f10, f11, f12, j5, l0Var, z10, j10, j11));
    }

    public static p b(p pVar, float f10, float f11, l0 l0Var, int i7) {
        float f12 = (i7 & 4) != 0 ? 1.0f : f10;
        float f13 = (i7 & 256) != 0 ? 0.0f : f11;
        long j5 = p0.f14946a;
        l0 l0Var2 = (i7 & 2048) != 0 ? h0.f14898a : l0Var;
        boolean z10 = (i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 0;
        long j10 = w.f14964a;
        return a(pVar, f12, 0.0f, f13, j5, l0Var2, z10, j10, j10);
    }
}
