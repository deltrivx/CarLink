package e4;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f4351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x3.b[] f4352b;

    public h1() {
        this(new s1((s1) null));
    }

    public h1(s1 s1Var) {
        this.f4351a = s1Var;
    }

    public final void a() {
        x3.b[] bVarArr = this.f4352b;
        if (bVarArr != null) {
            x3.b bVarG = bVarArr[0];
            x3.b bVarG2 = bVarArr[1];
            s1 s1Var = this.f4351a;
            if (bVarG2 == null) {
                bVarG2 = s1Var.f4398a.g(2);
            }
            if (bVarG == null) {
                bVarG = s1Var.f4398a.g(1);
            }
            g(x3.b.a(bVarG, bVarG2));
            x3.b bVar = this.f4352b[i2.c.M(16)];
            if (bVar != null) {
                f(bVar);
            }
            x3.b bVar2 = this.f4352b[i2.c.M(32)];
            if (bVar2 != null) {
                d(bVar2);
            }
            x3.b bVar3 = this.f4352b[i2.c.M(64)];
            if (bVar3 != null) {
                h(bVar3);
            }
        }
    }

    public abstract s1 b();

    public void c(int i7, x3.b bVar) {
        if (this.f4352b == null) {
            this.f4352b = new x3.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.f4352b[i2.c.M(i10)] = bVar;
            }
        }
    }

    public void d(x3.b bVar) {
    }

    public abstract void e(x3.b bVar);

    public void f(x3.b bVar) {
    }

    public abstract void g(x3.b bVar);

    public void h(x3.b bVar) {
    }
}
