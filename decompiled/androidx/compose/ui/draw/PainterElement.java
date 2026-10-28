package androidx.compose.ui.draw;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d2.b;
import i9.l;
import kotlin.Metadata;
import o2.i;
import q2.f;
import q2.z0;
import r1.d;
import r1.o;
import v1.g;
import x1.e;
import y1.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lq2/z0;", "Lv1/g;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final /* data */ class PainterElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f932e;

    public PainterElement(b bVar, d dVar, i iVar, float f10, k kVar) {
        this.f928a = bVar;
        this.f929b = dVar;
        this.f930c = iVar;
        this.f931d = f10;
        this.f932e = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return l.a(this.f928a, painterElement.f928a) && l.a(this.f929b, painterElement.f929b) && l.a(this.f930c, painterElement.f930c) && Float.compare(this.f931d, painterElement.f931d) == 0 && l.a(this.f932e, painterElement.f932e);
    }

    public final int hashCode() {
        int iJ = ob.a.j(this.f931d, (this.f930c.hashCode() + ((this.f929b.hashCode() + (((this.f928a.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        k kVar = this.f932e;
        return iJ + (kVar == null ? 0 : kVar.hashCode());
    }

    @Override // q2.z0
    public final o i() {
        g gVar = new g();
        gVar.f13599o = this.f928a;
        gVar.f13600p = true;
        gVar.f13601q = this.f929b;
        gVar.f13602r = this.f930c;
        gVar.f13603s = this.f931d;
        gVar.f13604t = this.f932e;
        return gVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        g gVar = (g) oVar;
        boolean z10 = gVar.f13600p;
        b bVar = this.f928a;
        boolean z11 = (z10 && e.a(gVar.f13599o.d(), bVar.d())) ? false : true;
        gVar.f13599o = bVar;
        gVar.f13600p = true;
        gVar.f13601q = this.f929b;
        gVar.f13602r = this.f930c;
        gVar.f13603s = this.f931d;
        gVar.f13604t = this.f932e;
        if (z11) {
            f.m(gVar);
        }
        f.l(gVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f928a + ", sizeToIntrinsics=true, alignment=" + this.f929b + ", contentScale=" + this.f930c + ", alpha=" + this.f931d + ", colorFilter=" + this.f932e + ')';
    }
}
