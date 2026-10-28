package n;

import e4.s0;
import p.e3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8693i;

    public i(j jVar) {
        this.f8690f = 0;
        this.f8693i = jVar;
        this.f8691g = false;
        this.f8692h = 0;
    }

    public i(e3 e3Var, int i7) {
        this.f8690f = 1;
        this.f8693i = e3Var;
        this.f8692h = i7;
        this.f8691g = false;
    }

    @Override // a.a, e4.s0
    public void a() {
        switch (this.f8690f) {
            case 1:
                this.f8691g = true;
                break;
        }
    }

    @Override // a.a, e4.s0
    public final void b() {
        switch (this.f8690f) {
            case 0:
                if (!this.f8691g) {
                    this.f8691g = true;
                    s0 s0Var = ((j) this.f8693i).f8697d;
                    if (s0Var != null) {
                        s0Var.b();
                    }
                    break;
                }
                break;
            default:
                ((e3) this.f8693i).f9704a.setVisibility(0);
                break;
        }
    }

    @Override // e4.s0
    public final void c() {
        switch (this.f8690f) {
            case 0:
                int i7 = this.f8692h + 1;
                this.f8692h = i7;
                j jVar = (j) this.f8693i;
                if (i7 == jVar.f8694a.size()) {
                    s0 s0Var = jVar.f8697d;
                    if (s0Var != null) {
                        s0Var.c();
                    }
                    this.f8692h = 0;
                    this.f8691g = false;
                    jVar.f8698e = false;
                }
                break;
            default:
                if (!this.f8691g) {
                    ((e3) this.f8693i).f9704a.setVisibility(this.f8692h);
                }
                break;
        }
    }
}
