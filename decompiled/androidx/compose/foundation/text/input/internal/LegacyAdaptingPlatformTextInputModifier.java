package androidx.compose.foundation.text.input.internal;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import l0.u0;
import q2.z0;
import r1.o;
import u0.b;
import w0.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Lq2/z0;", "Lu0/l;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f886c;

    public LegacyAdaptingPlatformTextInputModifier(b bVar, u0 u0Var, t1 t1Var) {
        this.f884a = bVar;
        this.f885b = u0Var;
        this.f886c = t1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return l.a(this.f884a, legacyAdaptingPlatformTextInputModifier.f884a) && l.a(this.f885b, legacyAdaptingPlatformTextInputModifier.f885b) && l.a(this.f886c, legacyAdaptingPlatformTextInputModifier.f886c);
    }

    public final int hashCode() {
        return this.f886c.hashCode() + ((this.f885b.hashCode() + (this.f884a.hashCode() * 31)) * 31);
    }

    @Override // q2.z0
    public final o i() {
        return new u0.l(this.f884a, this.f885b, this.f886c);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        u0.l lVar = (u0.l) oVar;
        if (lVar.f11129n) {
            lVar.f12992o.c();
            lVar.f12992o.k(lVar);
        }
        b bVar = this.f884a;
        lVar.f12992o = bVar;
        if (lVar.f11129n) {
            if (bVar.f12967a != null) {
                c0.b.c("Expected textInputModifierNode to be null");
            }
            bVar.f12967a = lVar;
        }
        lVar.f12993p = this.f885b;
        lVar.f12994q = this.f886c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f884a + ", legacyTextFieldState=" + this.f885b + ", textFieldSelectionManager=" + this.f886c + ')';
    }
}
