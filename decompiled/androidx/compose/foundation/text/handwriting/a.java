package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import q2.n;
import r1.m;
import r1.p;
import t0.b;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f875a;

    static {
        float f10 = 40;
        float f11 = 10;
        f875a = new n(f11, f10, f11, f10);
    }

    public static final p a(boolean z10, boolean z11, h9.a aVar) {
        p stylusHoverIconModifierElement = m.f11116a;
        if (!z10 || !b.f12725a) {
            return stylusHoverIconModifierElement;
        }
        if (z11) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(f875a);
        }
        return stylusHoverIconModifierElement.a(new StylusHandwritingElement(aVar));
    }
}
