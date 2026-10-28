package n1;

import android.os.Trace;
import f1.d2;
import f1.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import s.h0;
import s.i0;
import s.p0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f8715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q1.c f8716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1.e f8717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f8718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h1.e f8719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1.e f8720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.e f8721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0 f8722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0 f8723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f8724j;
    public i0 k;

    public i() {
        h1.e eVar = new h1.e(new e2[16]);
        this.f8717c = eVar;
        i0 i0Var = p0.f12478a;
        this.f8718d = new i0();
        this.f8719e = eVar;
        this.f8720f = new h1.e(new Object[16]);
        this.f8721g = new h1.e(new h9.a[16]);
    }

    public static final boolean f(e2 e2Var, h1.e eVar) {
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            d2 d2Var = ((e2) objArr[i10]).f4944a;
            if (d2Var instanceof e) {
                h1.e eVar2 = ((e) d2Var).f8710b;
                if (eVar2.k(e2Var) || f(e2Var, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f8715a = null;
        this.f8716b = null;
        h1.e eVar = this.f8717c;
        eVar.h();
        this.f8718d.b();
        this.f8719e = eVar;
        this.f8720f.h();
        this.f8721g.h();
        this.f8722h = null;
        this.f8723i = null;
        this.f8724j = null;
    }

    public final void b() {
        Set set = this.f8715a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                d2 d2Var = (d2) it.next();
                it.remove();
                d2Var.c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            java.util.Set r0 = r6.f8715a
            if (r0 != 0) goto L6
            goto La7
        L6:
            r1 = 0
            r6.k = r1
            h1.e r1 = r6.f8720f
            int r2 = r1.f6423c
            if (r2 == 0) goto L68
            java.lang.String r2 = "Compose:onForgotten"
            android.os.Trace.beginSection(r2)
            s.i0 r2 = r6.f8722h     // Catch: java.lang.Throwable -> L5e
            int r3 = r1.f6423c     // Catch: java.lang.Throwable -> L5e
            int r3 = r3 + (-1)
        L1a:
            r4 = -1
            if (r4 >= r3) goto L60
            java.lang.Object[] r4 = r1.f6421a     // Catch: java.lang.Throwable -> L5e
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L5e
            boolean r5 = r4 instanceof f1.e2     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L33
            r5 = r4
            f1.e2 r5 = (f1.e2) r5     // Catch: java.lang.Throwable -> L31
            f1.d2 r5 = r5.f4944a     // Catch: java.lang.Throwable -> L31
            r0.remove(r5)     // Catch: java.lang.Throwable -> L31
            r5.e()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r0 = move-exception
            goto L4f
        L33:
            boolean r5 = r4 instanceof f1.j     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L4c
            if (r2 == 0) goto L46
            boolean r5 = r2.c(r4)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L46
            r5 = r4
            f1.j r5 = (f1.j) r5     // Catch: java.lang.Throwable -> L31
            r5.b()     // Catch: java.lang.Throwable -> L31
            goto L4c
        L46:
            r5 = r4
            f1.j r5 = (f1.j) r5     // Catch: java.lang.Throwable -> L31
            r5.c()     // Catch: java.lang.Throwable -> L31
        L4c:
            int r3 = r3 + (-1)
            goto L1a
        L4f:
            q1.c r1 = r6.f8716b     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L5d
            a8.f1 r2 = new a8.f1     // Catch: java.lang.Throwable -> L5e
            r3 = 16
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L5e
            n3.r.b0(r0, r2)     // Catch: java.lang.Throwable -> L5e
        L5d:
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            goto L64
        L60:
            android.os.Trace.endSection()
            goto L68
        L64:
            android.os.Trace.endSection()
            throw r0
        L68:
            h1.e r0 = r6.f8717c
            int r1 = r0.f6423c
            if (r1 == 0) goto La7
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.util.Set r1 = r6.f8715a     // Catch: java.lang.Throwable -> La2
            if (r1 != 0) goto L78
            goto L9e
        L78:
            java.lang.Object[] r2 = r0.f6421a     // Catch: java.lang.Throwable -> La2
            int r0 = r0.f6423c     // Catch: java.lang.Throwable -> La2
            r3 = 0
        L7d:
            if (r3 >= r0) goto L9e
            r4 = r2[r3]     // Catch: java.lang.Throwable -> La2
            f1.e2 r4 = (f1.e2) r4     // Catch: java.lang.Throwable -> La2
            f1.d2 r5 = r4.f4944a     // Catch: java.lang.Throwable -> La2
            r1.remove(r5)     // Catch: java.lang.Throwable -> La2
            r5.f()     // Catch: java.lang.Throwable -> L8e
            int r3 = r3 + 1
            goto L7d
        L8e:
            r0 = move-exception
            q1.c r1 = r6.f8716b     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L9d
            a8.f1 r2 = new a8.f1     // Catch: java.lang.Throwable -> La2
            r3 = 16
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> La2
            n3.r.b0(r0, r2)     // Catch: java.lang.Throwable -> La2
        L9d:
            throw r0     // Catch: java.lang.Throwable -> La2
        L9e:
            android.os.Trace.endSection()
            return
        La2:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i.c():void");
    }

    public final void d() {
        h1.e eVar = this.f8721g;
        if (eVar.f6423c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.f6421a;
                int i7 = eVar.f6423c;
                for (int i10 = 0; i10 < i7; i10++) {
                    ((h9.a) objArr[i10]).invoke();
                }
                eVar.h();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(e2 e2Var) {
        if (this.f8718d.c(e2Var)) {
            this.f8718d.l(e2Var);
            if (!this.f8719e.k(e2Var)) {
                h1.e eVar = this.f8717c;
                if (!eVar.k(e2Var)) {
                    f(e2Var, eVar);
                }
            }
            Set set = this.f8715a;
            if (set == null) {
                return;
            } else {
                set.add(e2Var.f4944a);
            }
        }
        i0 i0Var = this.k;
        if (i0Var == null || !i0Var.c(e2Var)) {
            this.f8720f.b(e2Var);
        }
    }

    public final void g(Set set, q1.c cVar) {
        a();
        this.f8715a = set;
        this.f8716b = cVar;
    }
}
