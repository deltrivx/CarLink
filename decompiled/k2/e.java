package k2;

import android.graphics.Matrix;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f7208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7209h;

    /* JADX WARN: Multi-variable type inference failed */
    public e(h9.n nVar) {
        this.f7206e = (i9.n) nVar;
        this.f7208g = y1.a0.a();
        this.f7209h = y1.a0.a();
        this.f7204c = true;
        this.f7205d = true;
    }

    public e(o2.w wVar) {
        this.f7206e = wVar;
        this.f7207f = new s.d0();
        this.f7208g = new m();
        this.f7209h = new s.a0(10);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    public void a(long j5, List list, boolean z10) {
        char c10;
        l lVar;
        Object objE;
        Object obj;
        m mVar = (m) this.f7208g;
        s.a0 a0Var = (s.a0) this.f7209h;
        a0Var.a();
        int size = list.size();
        m mVar2 = mVar;
        boolean z11 = true;
        for (int i7 = 0; i7 < size; i7++) {
            r1.o oVar = (r1.o) list.get(i7);
            if (oVar.f11129n) {
                oVar.f11128m = new d(0, this, oVar);
                if (z11) {
                    h1.e eVar = mVar2.f7252a;
                    Object[] objArr = eVar.f6421a;
                    int i10 = eVar.f6423c;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= i10) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i11];
                        if (i9.l.a(((l) obj).f7238c, oVar)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    lVar = (l) obj;
                    if (lVar != null) {
                        lVar.f7244i = true;
                        lVar.f7239d.b(j5);
                        Object objE2 = a0Var.e(j5);
                        if (objE2 == null) {
                            objE2 = new s.d0();
                            a0Var.h(j5, objE2);
                        }
                        ((s.d0) objE2).a(lVar);
                    } else {
                        z11 = false;
                        lVar = new l(oVar);
                        lVar.f7239d.b(j5);
                        objE = a0Var.e(j5);
                        if (objE == null) {
                            objE = new s.d0();
                            a0Var.h(j5, objE);
                        }
                        ((s.d0) objE).a(lVar);
                        mVar2.f7252a.b(lVar);
                    }
                } else {
                    lVar = new l(oVar);
                    lVar.f7239d.b(j5);
                    objE = a0Var.e(j5);
                    if (objE == null) {
                        objE = new s.d0();
                        a0Var.h(j5, objE);
                    }
                    ((s.d0) objE).a(lVar);
                    mVar2.f7252a.b(lVar);
                }
                mVar2 = lVar;
            }
        }
        if (!z10) {
            return;
        }
        long[] jArr = a0Var.f12381b;
        Object[] objArr2 = a0Var.f12382c;
        long[] jArr2 = a0Var.f12380a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr2[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        int i15 = (i12 << 3) + i14;
                        long j11 = jArr[i15];
                        s.d0 d0Var = (s.d0) objArr2[i15];
                        h1.e eVar2 = mVar.f7252a;
                        c10 = '\b';
                        Object[] objArr3 = eVar2.f6421a;
                        int i16 = eVar2.f6423c;
                        for (int i17 = 0; i17 < i16; i17++) {
                            ((l) objArr3[i17]).f(j11, d0Var);
                        }
                    } else {
                        c10 = '\b';
                    }
                    j10 >>= c10;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public float[] b(Object obj) {
        float[] fArr = (float[]) this.f7209h;
        if (this.f7203b) {
            this.f7204c = r2.j0.p(c(obj), fArr);
            this.f7203b = false;
        }
        if (this.f7204c) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h9.n, i9.n] */
    public float[] c(Object obj) {
        float[] fArr = (float[]) this.f7208g;
        if (!this.f7202a) {
            return fArr;
        }
        Matrix matrix = (Matrix) this.f7207f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f7207f = matrix;
        }
        ((i9.n) this.f7206e).invoke(obj, matrix);
        y1.h0.v(matrix, fArr);
        this.f7202a = false;
        this.f7205d = y1.h0.p(fArr);
        return fArr;
    }

    public boolean d(i iVar, boolean z10) {
        s.d0 d0Var = (s.d0) this.f7207f;
        m mVar = (m) this.f7208g;
        boolean zA = mVar.a((s.q) iVar.f7219b, (o2.w) this.f7206e, iVar, z10);
        h1.e eVar = mVar.f7252a;
        if (!zA) {
            return false;
        }
        boolean z11 = true;
        this.f7202a = true;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        boolean z12 = false;
        for (int i10 = 0; i10 < i7; i10++) {
            z12 = ((l) objArr[i10]).e(iVar, z10) || z12;
        }
        Object[] objArr2 = eVar.f6421a;
        int i11 = eVar.f6423c;
        boolean z13 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z13 = ((l) objArr2[i12]).d(iVar) || z13;
        }
        mVar.b(iVar);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f7202a = false;
        if (this.f7205d) {
            this.f7205d = false;
            int i13 = d0Var.f12408b;
            for (int i14 = 0; i14 < i13; i14++) {
                g((r1.o) d0Var.e(i14));
            }
            d0Var.c();
        }
        if (this.f7203b) {
            this.f7203b = false;
            f();
        }
        if (this.f7204c) {
            this.f7204c = false;
            mVar.f7252a.h();
        }
        return z11;
    }

    public void e() {
        this.f7202a = true;
        this.f7203b = true;
    }

    public void f() {
        m mVar = (m) this.f7208g;
        if (this.f7202a) {
            this.f7203b = true;
            return;
        }
        h1.e eVar = mVar.f7252a;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((l) objArr[i10]).c();
        }
        if (this.f7204c) {
            this.f7204c = true;
        } else {
            mVar.f7252a.h();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void g(r1.o oVar) {
        if (this.f7202a) {
            this.f7205d = true;
            ((s.d0) this.f7207f).a(oVar);
            return;
        }
        m mVar = (m) this.f7208g;
        s.d0 d0Var = mVar.f7253b;
        d0Var.c();
        d0Var.a(mVar);
        while (d0Var.h()) {
            m mVar2 = (m) d0Var.j(d0Var.f12408b - 1);
            int i7 = 0;
            while (true) {
                h1.e eVar = mVar2.f7252a;
                if (i7 < eVar.f6423c) {
                    l lVar = (l) eVar.f6421a[i7];
                    if (i9.l.a(lVar.f7238c, oVar)) {
                        mVar2.f7252a.k(lVar);
                        lVar.c();
                    } else {
                        d0Var.a(lVar);
                        i7++;
                    }
                }
            }
        }
    }
}
