package j3;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import cc.s;
import f1.f0;
import f7.q;
import y1.h0;
import y1.j0;
import y1.k0;
import y1.m;
import y1.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f6936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m3.l f6937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f6939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.q f6940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f6941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f6942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x1.e f6943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a2.h f6944i;

    public final q a() {
        q qVar = this.f6936a;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this.f6936a = qVar2;
        return qVar2;
    }

    public final void b(int i7) {
        if (i7 == this.f6938c) {
            return;
        }
        a().j(i7);
        this.f6938c = i7;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public final void c(final m mVar, final long j5, float f10) {
        if (mVar == null) {
            this.f6942g = null;
            this.f6941f = null;
            this.f6943h = null;
            setShader(null);
            return;
        }
        if (mVar instanceof n0) {
            d(g5.a.T(f10, ((n0) mVar).f14942a));
            return;
        }
        if (!(mVar instanceof j0)) {
            throw new s();
        }
        if (i9.l.a(this.f6941f, mVar)) {
            x1.e eVar = this.f6943h;
            if (!(eVar == null ? false : x1.e.a(eVar.f14535a, j5))) {
                if (j5 != 9205357640488583168L) {
                    this.f6941f = mVar;
                    this.f6943h = new x1.e(j5);
                    this.f6942g = f1.b.o(new h9.a() { // from class: j3.e
                        @Override // h9.a
                        public final Object invoke() {
                            return ((j0) mVar).b(j5);
                        }
                    });
                }
            }
        } else {
            if (j5 != 9205357640488583168L) {
                this.f6941f = mVar;
                this.f6943h = new x1.e(j5);
                this.f6942g = f1.b.o(new h9.a() { // from class: j3.e
                    @Override // h9.a
                    public final Object invoke() {
                        return ((j0) mVar).b(j5);
                    }
                });
            }
        }
        q qVarA = a();
        f0 f0Var = this.f6942g;
        qVarA.n(f0Var != null ? (Shader) f0Var.getValue() : null);
        this.f6940e = null;
        k.b(this, f10);
    }

    public final void d(long j5) {
        y1.q qVar = this.f6940e;
        if (qVar == null ? false : y1.q.c(qVar.f14960a, j5)) {
            return;
        }
        if (j5 != 16) {
            this.f6940e = new y1.q(j5);
            setColor(h0.C(j5));
            this.f6942g = null;
            this.f6941f = null;
            this.f6943h = null;
            setShader(null);
        }
    }

    public final void e(a2.h hVar) {
        if (hVar == null || i9.l.a(this.f6944i, hVar)) {
            return;
        }
        this.f6944i = hVar;
        if (hVar.equals(a2.j.f23a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(hVar instanceof a2.k)) {
            throw new s();
        }
        a().r(1);
        a2.k kVar = (a2.k) hVar;
        a().q(kVar.f24a);
        q qVarA = a();
        ((Paint) qVarA.f5447c).setStrokeMiter(kVar.f25b);
        a().p(kVar.f27d);
        a().o(kVar.f26c);
        ((Paint) a().f5447c).setPathEffect(null);
    }

    public final void f(k0 k0Var) {
        if (k0Var == null || i9.l.a(this.f6939d, k0Var)) {
            return;
        }
        this.f6939d = k0Var;
        if (k0Var.equals(k0.f14924d)) {
            clearShadowLayer();
            return;
        }
        k0 k0Var2 = this.f6939d;
        float f10 = k0Var2.f14927c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, Float.intBitsToFloat((int) (k0Var2.f14926b >> 32)), Float.intBitsToFloat((int) (this.f6939d.f14926b & 4294967295L)), h0.C(this.f6939d.f14925a));
    }

    public final void g(m3.l lVar) {
        if (lVar == null || i9.l.a(this.f6937b, lVar)) {
            return;
        }
        this.f6937b = lVar;
        int i7 = lVar.f8423a;
        setUnderlineText((i7 | 1) == i7);
        int i10 = this.f6937b.f8423a;
        setStrikeThruText((i10 | 2) == i10);
    }
}
