package hb;

import aa.r;
import h0.a0;
import nb.w;
import x9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a0 implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6490b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa.e f6491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f6492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(x9.b bVar, w wVar, wa.e eVar) {
        super(wVar);
        i9.l.e(wVar, "receiverType");
        this.f6492d = (r) bVar;
        this.f6491c = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x9.e eVar, w wVar, wa.e eVar2) {
        super(wVar);
        i9.l.e(wVar, "receiverType");
        this.f6492d = eVar;
        this.f6491c = eVar2;
    }

    public final String toString() {
        switch (this.f6490b) {
            case 0:
                return getType() + ": Ctx { " + ((x9.e) this.f6492d) + " }";
            default:
                return "Cxt { " + ((r) this.f6492d) + " }";
        }
    }

    public final wa.e w0() {
        switch (this.f6490b) {
            case 0:
                break;
        }
        return this.f6491c;
    }
}
