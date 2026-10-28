package ob;

import nb.j0;
import nb.w;
import nb.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f9656c = f.f9638a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final za.j f9657d = new za.j(za.j.f15800d);

    public final boolean a(w wVar, w wVar2) {
        i9.l.e(wVar, "a");
        i9.l.e(wVar2, "b");
        return nb.d.h(h.l(false, null, this.f9656c, 6), wVar.G0(), wVar2.G0());
    }

    public final boolean b(w wVar, w wVar2) {
        i9.l.e(wVar, "subtype");
        i9.l.e(wVar2, "supertype");
        j0 j0VarL = h.l(true, null, this.f9656c, 6);
        w0 w0VarG0 = wVar.G0();
        w0 w0VarG1 = wVar2.G0();
        if (w0VarG0 == w0VarG1) {
            return true;
        }
        return nb.d.f(j0VarL, w0VarG0, w0VarG1);
    }
}
