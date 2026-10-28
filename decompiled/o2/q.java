package o2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import e4.s1;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends e4.t0 implements Runnable, e4.o, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s1 f9410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s.h0 f9411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.h1 f9412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s.d0 f9413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1.p f9414i;

    public q() {
        super(1);
        s.h0 h0Var = new s.h0(9);
        m1.f9381a.getClass();
        h0Var.m(l1.f9371b, new o1("caption bar"));
        h0Var.m(l1.f9372c, new o1("display cutout"));
        h0Var.m(l1.f9373d, new o1("ime"));
        h0Var.m(l1.f9374e, new o1("mandatory system gestures"));
        h0Var.m(l1.f9375f, new o1("navigation bars"));
        h0Var.m(l1.f9376g, new o1("status bars"));
        h0Var.m(l1.f9377h, new o1("system gestures"));
        h0Var.m(l1.f9378i, new o1("tappable element"));
        h0Var.m(l1.f9379j, new o1("waterfall"));
        this.f9411f = h0Var;
        this.f9412g = new f1.h1(0);
        this.f9413h = new s.d0(4);
        this.f9414i = new p1.p();
    }

    @Override // e4.t0
    public final void a(e4.b1 b1Var) {
        boolean z10 = false;
        this.f9408c = false;
        int iD = b1Var.f4321a.d();
        this.f9409d &= ~iD;
        this.f9410e = null;
        m1 m1Var = (m1) androidx.compose.ui.layout.b.f963c.b(iD);
        if (m1Var != null) {
            Object objG = this.f9411f.g(m1Var);
            i9.l.b(objG);
            o1 o1Var = (o1) objG;
            o1Var.f9391c.g(0.0f);
            o1Var.f9393e.g(1.0f);
            o1Var.f9392d.f(0L);
            o1Var.f9391c.g(0.0f);
            o1Var.f9390b.setValue(Boolean.FALSE);
            o1Var.f9398j = -1L;
            o1Var.k = -1L;
            f1.h1 h1Var = this.f9412g;
            h1Var.g(h1Var.f() + 1);
            synchronized (p1.l.f10057c) {
                s.i0 i0Var = p1.l.f10064j.f10004h;
                if (i0Var != null && i0Var.h()) {
                    z10 = true;
                }
            }
            if (z10) {
                p1.l.a();
            }
        }
    }

    @Override // e4.t0
    public final void b() {
        this.f9408c = true;
    }

    @Override // e4.t0
    public final s1 c(s1 s1Var, List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            e4.b1 b1Var = (e4.b1) list.get(i7);
            m1 m1Var = (m1) androidx.compose.ui.layout.b.f963c.b(b1Var.f4321a.d());
            if (m1Var != null) {
                Object objG = this.f9411f.g(m1Var);
                i9.l.b(objG);
                o1 o1Var = (o1) objG;
                if (((Boolean) o1Var.f9390b.getValue()).booleanValue()) {
                    e4.a1 a1Var = b1Var.f4321a;
                    o1Var.f9391c.g(a1Var.c());
                    o1Var.f9393e.g(a1Var.a());
                    o1Var.f9392d.f(a1Var.b());
                }
            }
        }
        f(s1Var);
        return s1Var;
    }

    @Override // e4.o
    public final s1 d(View view, s1 s1Var) {
        if (this.f9408c) {
            this.f9410e = s1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return s1Var;
            }
        } else if (this.f9409d == 0) {
            f(s1Var);
        }
        return s1Var;
    }

    @Override // e4.t0
    public final android.support.v4.media.session.r e(e4.b1 b1Var, android.support.v4.media.session.r rVar) {
        s1 s1Var = this.f9410e;
        boolean z10 = false;
        this.f9408c = false;
        this.f9410e = null;
        if (b1Var.f4321a.b() > 0 && s1Var != null) {
            int iD = b1Var.f4321a.d();
            this.f9409d |= iD;
            m1 m1Var = (m1) androidx.compose.ui.layout.b.f963c.b(iD);
            if (m1Var != null) {
                Object objG = this.f9411f.g(m1Var);
                i9.l.b(objG);
                o1 o1Var = (o1) objG;
                x3.b bVarG = s1Var.f4398a.g(iD);
                long j5 = (((long) bVarG.f14563a) << 48) | (((long) bVarG.f14564b) << 32) | (((long) bVarG.f14565c) << 16) | ((long) bVarG.f14566d);
                long j10 = o1Var.f9396h;
                if (!d1.f(j5, j10)) {
                    o1Var.f9398j = j10;
                    o1Var.k = j5;
                    o1Var.f9390b.setValue(Boolean.TRUE);
                    e4.a1 a1Var = b1Var.f4321a;
                    o1Var.f9391c.g(a1Var.c());
                    o1Var.f9393e.g(a1Var.a());
                    o1Var.f9392d.f(a1Var.b());
                    f1.h1 h1Var = this.f9412g;
                    h1Var.g(h1Var.f() + 1);
                    synchronized (p1.l.f10057c) {
                        s.i0 i0Var = p1.l.f10064j.f10004h;
                        if (i0Var != null && i0Var.h()) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        p1.l.a();
                        return rVar;
                    }
                }
            }
        }
        return rVar;
    }

    public final void f(s1 s1Var) {
        char c10;
        char c11;
        char c12;
        char c13;
        long j5;
        boolean z10;
        boolean z11;
        long j10;
        long jE;
        boolean z12;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        char c14;
        s.w wVar = androidx.compose.ui.layout.b.f961a;
        int[] iArr5 = wVar.f12462b;
        Object[] objArr = wVar.f12463c;
        long[] jArr5 = wVar.f12461a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i7 = 0;
            c10 = 7;
            z10 = false;
            z11 = false;
            c11 = 16;
            c12 = ' ';
            while (true) {
                long j11 = jArr5[i7];
                c13 = '0';
                j5 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j11 & 255) < 128) {
                            int i12 = (i7 << 3) + i11;
                            int i13 = iArr5[i12];
                            m1 m1Var = (m1) objArr[i12];
                            c14 = '\b';
                            x3.b bVarG = s1Var.f4398a.g(i13);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j12 = (((long) bVarG.f14564b) << 32) | (((long) bVarG.f14563a) << 48) | (((long) bVarG.f14565c) << 16) | ((long) bVarG.f14566d);
                            Object objG = this.f9411f.g(m1Var);
                            i9.l.b(objG);
                            o1 o1Var = (o1) objG;
                            if (!d1.f(j12, o1Var.f9396h)) {
                                o1Var.f9396h = j12;
                                z10 = true;
                                if (!d1.f(j12, 0L)) {
                                    z11 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            c14 = '\b';
                        }
                        j11 >>= c14;
                        i11++;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                iArr5 = iArr3;
                jArr5 = jArr3;
            }
        } else {
            c10 = 7;
            c11 = 16;
            c12 = ' ';
            c13 = '0';
            j5 = -9187201950435737472L;
            z10 = false;
            z11 = false;
        }
        s.w wVar2 = androidx.compose.ui.layout.b.f963c;
        int[] iArr6 = wVar2.f12462b;
        Object[] objArr2 = wVar2.f12463c;
        long[] jArr6 = wVar2.f12461a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j13 = jArr6[i14];
                if ((((~j13) << c10) & j13 & j5) != j5) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j13 & 255) < 128) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr6[i17];
                            Object objG2 = this.f9411f.g((m1) objArr2[i17]);
                            i9.l.b(objG2);
                            o1 o1Var2 = (o1) objG2;
                            if (i18 != 8) {
                                x3.b bVarH = s1Var.f4398a.h(i18);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j14 = (((long) bVarH.f14564b) << c12) | (((long) bVarH.f14563a) << c13) | (((long) bVarH.f14565c) << c11) | ((long) bVarH.f14566d);
                                if (!d1.f(o1Var2.f9397i, j14)) {
                                    o1Var2.f9397i = j14;
                                    z10 = true;
                                    if (!d1.f(j14, 0L)) {
                                        z11 = true;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            o1Var2.f9389a.setValue(Boolean.valueOf(s1Var.f4398a.q(i18)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j13 >>= 8;
                        i16++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        e4.i iVarF = s1Var.f4398a.f();
        if (iVarF == null) {
            j10 = 0;
        } else {
            x3.b bVarA = iVarF.a();
            j10 = (((long) bVarA.f14563a) << c13) | (((long) bVarA.f14564b) << c12) | (((long) bVarA.f14565c) << c11) | ((long) bVarA.f14566d);
        }
        s.h0 h0Var = this.f9411f;
        m1.f9381a.getClass();
        Object objG3 = h0Var.g(l1.f9379j);
        i9.l.b(objG3);
        o1 o1Var3 = (o1) objG3;
        if (!d1.f(o1Var3.f9396h, j10)) {
            o1Var3.f9396h = j10;
            o1Var3.f9397i = j10;
            z10 = true;
            if (!d1.f(j10, 0L)) {
                z11 = true;
            }
        }
        if (iVarF == null) {
            jE = 0;
        } else {
            int i19 = Build.VERSION.SDK_INT;
            jE = ((long) (i19 >= 28 ? a4.b.e(iVarF.f4353a) : 0)) | (((long) (i19 >= 28 ? a4.b.h(iVarF.f4353a) : 0)) << c12) | (((long) (i19 >= 28 ? a4.b.f(iVarF.f4353a) : 0)) << c13) | (((long) (i19 >= 28 ? a4.b.g(iVarF.f4353a) : 0)) << c11);
        }
        Object objG4 = this.f9411f.g(l1.f9372c);
        i9.l.b(objG4);
        o1 o1Var4 = (o1) objG4;
        if (!d1.f(jE, o1Var4.f9396h)) {
            o1Var4.f9396h = jE;
            o1Var4.f9397i = jE;
            z10 = true;
            if (!d1.f(jE, 0L)) {
                z11 = true;
            }
        }
        if (iVarF == null) {
            s.d0 d0Var = this.f9413h;
            if (d0Var.f12408b > 0) {
                d0Var.c();
                this.f9414i.clear();
                z10 = true;
            }
        } else {
            List listB = Build.VERSION.SDK_INT >= 28 ? a4.b.b(iVarF.f4353a) : Collections.EMPTY_LIST;
            int size = listB.size();
            s.d0 d0Var2 = this.f9413h;
            if (size < d0Var2.f12408b) {
                d0Var2.k(listB.size(), this.f9413h.f12408b);
                this.f9414i.m(listB.size(), this.f9414i.size());
                z10 = true;
            } else {
                int size2 = listB.size() - this.f9413h.f12408b;
                int i20 = 0;
                while (i20 < size2) {
                    s.d0 d0Var3 = this.f9413h;
                    d0Var3.a(f1.b.s(listB.get(d0Var3.f12408b)));
                    this.f9414i.add(new p("display cutout rect " + this.f9413h.f12408b));
                    i20++;
                    z10 = true;
                }
            }
            int size3 = listB.size();
            for (int i21 = 0; i21 < size3; i21++) {
                Rect rect = (Rect) listB.get(i21);
                f1.b1 b1Var = (f1.b1) this.f9413h.e(i21);
                if (!i9.l.a(b1Var.getValue(), rect)) {
                    b1Var.setValue(rect);
                    z10 = true;
                }
            }
            if (!listB.isEmpty()) {
                z11 = true;
            }
        }
        if ((z11 || this.f9412g.f() != 0) && z10) {
            f1.h1 h1Var = this.f9412g;
            h1Var.g(h1Var.f() + 1);
            synchronized (p1.l.f10057c) {
                s.i0 i0Var = p1.l.f10064j.f10004h;
                z12 = i0Var != null && i0Var.h();
            }
            if (z12) {
                p1.l.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = e4.l0.f4369a;
        e4.e0.i(view, this);
        e4.l0.l(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = e4.l0.f4369a;
        e4.e0.i(view, null);
        e4.l0.l(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9408c) {
            this.f9409d = 0;
            this.f9408c = false;
            s1 s1Var = this.f9410e;
            if (s1Var != null) {
                f(s1Var);
                this.f9410e = null;
            }
        }
    }
}
