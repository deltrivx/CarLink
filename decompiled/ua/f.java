package ua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xa.n;
import xa.q;
import xa.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xa.i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f13265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f13266d;

    @Override // xa.i
    public final xa.a a() {
        j jVarD = d();
        jVarD.isInitialized();
        return jVarD;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        j jVar = null;
        try {
            try {
                j.f13293h.getClass();
                e(new j(eVar, gVar));
                return this;
            } catch (q e7) {
                j jVar2 = (j) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    jVar = jVar2;
                    if (jVar != null) {
                        e(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jVar != null) {
                e(jVar);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(n nVar) {
        e((j) nVar);
        return this;
    }

    public final Object clone() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f13265c = list;
        fVar.f13266d = list;
        fVar.e(d());
        return fVar;
    }

    public final j d() {
        j jVar = new j(this);
        if ((this.f13264b & 1) == 1) {
            this.f13265c = Collections.unmodifiableList(this.f13265c);
            this.f13264b &= -2;
        }
        jVar.f13295b = this.f13265c;
        if ((this.f13264b & 2) == 2) {
            this.f13266d = Collections.unmodifiableList(this.f13266d);
            this.f13264b &= -3;
        }
        jVar.f13296c = this.f13266d;
        return jVar;
    }

    public final void e(j jVar) {
        if (jVar == j.f13292g) {
            return;
        }
        if (!jVar.f13295b.isEmpty()) {
            if (this.f13265c.isEmpty()) {
                this.f13265c = jVar.f13295b;
                this.f13264b &= -2;
            } else {
                if ((this.f13264b & 1) != 1) {
                    this.f13265c = new ArrayList(this.f13265c);
                    this.f13264b |= 1;
                }
                this.f13265c.addAll(jVar.f13295b);
            }
        }
        if (!jVar.f13296c.isEmpty()) {
            if (this.f13266d.isEmpty()) {
                this.f13266d = jVar.f13296c;
                this.f13264b &= -3;
            } else {
                if ((this.f13264b & 2) != 2) {
                    this.f13266d = new ArrayList(this.f13266d);
                    this.f13264b |= 2;
                }
                this.f13266d.addAll(jVar.f13296c);
            }
        }
        this.f14792a = this.f14792a.d(jVar.f13294a);
    }
}
