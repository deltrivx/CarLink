package f3;

import android.graphics.Typeface;
import android.support.v4.media.session.r;
import cc.b0;
import cc.q1;
import n3.u;
import s.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb.d f5248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f5250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f5251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2.d f5252e;

    public e(kb.d dVar, a aVar) {
        r rVar = f.f5253a;
        r rVar2 = f.f5253a;
        h hVar = new h();
        g gVar = h.f5254a;
        dc.d dVar2 = j3.i.f6948a;
        gVar.getClass();
        b0.a(u.G(gVar, dVar2).s(y8.i.f15108a).s(new q1(null)));
        a2.d dVar3 = new a2.d(13);
        this.f5248a = dVar;
        this.f5249b = aVar;
        this.f5250c = rVar;
        this.f5251d = hVar;
        this.f5252e = dVar3;
        new c8.k(8, this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086 A[Catch: Exception -> 0x008e, TRY_ENTER, TryCatch #1 {Exception -> 0x008e, blocks: (B:15:0x0028, B:17:0x003b, B:20:0x0040, B:22:0x0044, B:28:0x005d, B:45:0x0086, B:46:0x008d, B:24:0x004d, B:25:0x004f, B:26:0x0052, B:27:0x0058), top: B:54:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final p a(o oVar) {
        Typeface typefaceD;
        p pVar;
        r rVar = this.f5250c;
        synchronized (((kb.d) rVar.f604b)) {
            p pVar2 = (p) ((s) rVar.f605c).a(oVar);
            if (pVar2 != null) {
                if (pVar2.f5271b) {
                    return pVar2;
                }
            }
            try {
                this.f5251d.getClass();
                n nVar = oVar.f5265a;
                kb.d dVar = (kb.d) this.f5252e.f20b;
                int i7 = oVar.f5267c;
                k kVar = oVar.f5266b;
                if (nVar != null && !(nVar instanceof b)) {
                    if (nVar instanceof m) {
                        typefaceD = dVar.g((m) nVar, kVar, i7);
                    } else {
                        pVar = null;
                    }
                    if (pVar != null) {
                        throw new IllegalStateException("Could not load font");
                    }
                    synchronized (((kb.d) rVar.f604b)) {
                        if (((s) rVar.f605c).a(oVar) == null && pVar.f5271b) {
                            ((s) rVar.f605c).b(oVar, pVar);
                        }
                    }
                    return pVar;
                }
                switch (dVar.f7504a) {
                    case 17:
                        typefaceD = kb.d.d(null, kVar, i7);
                        break;
                    default:
                        typefaceD = kb.d.e(null, kVar, i7);
                        break;
                }
                pVar = new p(typefaceD);
                if (pVar != null) {
                    throw new IllegalStateException("Could not load font");
                }
                synchronized (((kb.d) rVar.f604b)) {
                    if (((s) rVar.f605c).a(oVar) == null) {
                        ((s) rVar.f605c).b(oVar, pVar);
                    }
                    return pVar;
                }
            } catch (Exception e7) {
                throw new IllegalStateException("Could not load font", e7);
            }
        }
    }

    public final p b(n nVar, k kVar, int i7, int i10) {
        a aVar = this.f5249b;
        aVar.getClass();
        int i11 = aVar.f5247a;
        k kVar2 = (i11 == 0 || i11 == Integer.MAX_VALUE) ? kVar : new k(n3.r.m(kVar.f5261a + i11, 1, 1000));
        this.f5248a.getClass();
        return a(new o(nVar, kVar2, i7, i10, null));
    }
}
