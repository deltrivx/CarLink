package androidx.compose.foundation.text.contextmenu.modifier;

import a9.i;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import kotlin.Metadata;
import q2.z0;
import r0.e;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;", "Lq2/z0;", "Lr0/e;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class TextContextMenuGestureElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f869a;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuGestureElement(k kVar) {
        this.f869a = (i) kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextContextMenuGestureElement) {
            return this.f869a == ((TextContextMenuGestureElement) obj).f869a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f869a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [a9.i, h9.k] */
    @Override // q2.z0
    public final o i() {
        return new e(this.f869a);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((e) oVar).f11080q = this.f869a;
    }
}
