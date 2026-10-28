package androidx.compose.ui.semantics;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import kotlin.Metadata;
import q2.z0;
import r1.n;
import r1.o;
import y2.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Lq2/z0;", "Ly2/c;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class AppendedSemanticsElement extends z0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f966b;

    public AppendedSemanticsElement(k kVar, boolean z10) {
        this.f965a = z10;
        this.f966b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f965a == appendedSemanticsElement.f965a && this.f966b == appendedSemanticsElement.f966b;
    }

    public final int hashCode() {
        return this.f966b.hashCode() + ((this.f965a ? 1231 : 1237) * 31);
    }

    @Override // q2.z0
    public final o i() {
        c cVar = new c();
        cVar.f14973o = this.f965a;
        cVar.f14974p = this.f966b;
        return cVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        c cVar = (c) oVar;
        cVar.f14973o = this.f965a;
        cVar.f14974p = this.f966b;
    }
}
