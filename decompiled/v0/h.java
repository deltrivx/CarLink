package v0;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b3.o0;
import f1.d2;
import k2.h0;
import k2.s;
import l0.e0;
import s.a0;
import w0.d1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f13534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f13536d = k.f13548c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0.p f13537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r1.p f13538f;

    public h(long j5, d1 d1Var, long j10) {
        this.f13533a = j5;
        this.f13534b = d1Var;
        this.f13535c = j10;
        g gVar = new g(this, 2);
        i iVar = new i(gVar, d1Var, j5);
        j jVar = new j(gVar, d1Var, j5);
        e0 e0Var = new e0(jVar, iVar);
        k2.n nVar = h0.f7217a;
        SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(jVar, iVar, e0Var, 4);
        s.f7274a.getClass();
        this.f13538f = suspendPointerInputElement.a(new PointerHoverIconModifierElement());
    }

    public final void a(o0 o0Var) {
        w0.e0 e0Var;
        o0 o0Var2 = this.f13536d.f13550b;
        if (o0Var2 != null && !i9.l.a(o0Var2.f1408a.f1393a, o0Var.f1408a.f1393a) && (e0Var = this.f13534b.f13770i) != null) {
            e0Var.invoke(Long.valueOf(this.f13533a));
        }
        this.f13536d = k.a(this.f13536d, null, o0Var, 1);
    }

    @Override // f1.d2
    public final void c() {
        w0.p pVar = this.f13537e;
        if (pVar != null) {
            this.f13534b.d(pVar);
            this.f13537e = null;
        }
    }

    @Override // f1.d2
    public final void e() {
        w0.p pVar = this.f13537e;
        if (pVar != null) {
            this.f13534b.d(pVar);
            this.f13537e = null;
        }
    }

    @Override // f1.d2
    public final void f() {
        g gVar = new g(this, 0);
        g gVar2 = new g(this, 1);
        long j5 = this.f13533a;
        w0.p pVar = new w0.p(j5, gVar, gVar2);
        d1 d1Var = this.f13534b;
        a0 a0Var = d1Var.f13764c;
        if (j5 == 0) {
            c0.b.a("The selectable contains an invalid id: " + j5);
        }
        if (a0Var.b(j5)) {
            c0.b.a("Another selectable with the id: " + pVar + ".selectableId has already subscribed.");
        }
        a0Var.h(j5, pVar);
        d1Var.f13763b.add(pVar);
        d1Var.f13762a = false;
        this.f13537e = pVar;
    }
}
