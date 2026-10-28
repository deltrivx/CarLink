package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.support.v4.media.session.r f7837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.r f7838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f7840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7841e;

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    public final void a(g3.w wVar) {
        android.support.v4.media.session.r rVar;
        b3.h hVar = wVar.f5889a;
        this.f7841e = false;
        android.support.v4.media.session.r rVar2 = this.f7837a;
        if (wVar.equals(rVar2 != null ? (g3.w) rVar2.f605c : null)) {
            return;
        }
        String str = hVar.f1353b;
        android.support.v4.media.session.r rVar3 = this.f7837a;
        if (i9.l.a(str, rVar3 != null ? ((g3.w) rVar3.f605c).f5889a.f1353b : null)) {
            android.support.v4.media.session.r rVar4 = this.f7837a;
            if (rVar4 != null) {
                rVar4.f605c = wVar;
                return;
            }
            return;
        }
        this.f7837a = new android.support.v4.media.session.r(15, this.f7837a, wVar);
        this.f7838b = null;
        int length = hVar.f1353b.length() + this.f7839c;
        this.f7839c = length;
        if (length > 100000) {
            android.support.v4.media.session.r rVar5 = this.f7837a;
            if ((rVar5 != null ? (android.support.v4.media.session.r) rVar5.f604b : null) == null) {
                return;
            }
            while (true) {
                if (rVar5 == null) {
                    rVar = null;
                } else {
                    android.support.v4.media.session.r rVar6 = (android.support.v4.media.session.r) rVar5.f604b;
                    if (rVar6 != null) {
                        rVar = (android.support.v4.media.session.r) rVar6.f604b;
                    } else {
                        rVar = null;
                    }
                }
                if (rVar == null) {
                    break;
                } else {
                    rVar5 = (android.support.v4.media.session.r) rVar5.f604b;
                }
            }
            if (rVar5 != null) {
                rVar5.f604b = null;
            }
        }
    }
}
