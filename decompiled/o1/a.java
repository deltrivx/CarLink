package o1;

import android.app.PendingIntent;
import f1.d2;
import f1.w0;
import p1.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f9263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f9264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f9267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f9268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a5.e f9269g = new a5.e(17, this);

    public a(j jVar, f fVar, String str, Object obj, Object[] objArr) {
        this.f9263a = jVar;
        this.f9264b = fVar;
        this.f9265c = str;
        this.f9266d = obj;
        this.f9267e = objArr;
    }

    public final void a() throws PendingIntent.CanceledException {
        String strA;
        f fVar = this.f9264b;
        if (this.f9268f != null) {
            throw new IllegalArgumentException(("entry(" + this.f9268f + ") is not null").toString());
        }
        if (fVar != null) {
            a5.e eVar = this.f9269g;
            Object objInvoke = eVar.invoke();
            if (objInvoke == null || fVar.a(objInvoke)) {
                this.f9268f = fVar.e(this.f9265c, eVar);
                return;
            }
            if (objInvoke instanceof n) {
                n nVar = (n) objInvoke;
                if (nVar.a() == w0.f5184c || nVar.a() == w0.f5187f || nVar.a() == w0.f5185d) {
                    strA = "MutableState containing " + nVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = k.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // f1.d2
    public final void c() {
        e eVar = this.f9268f;
        if (eVar != null) {
            ((a2.b) eVar).e0();
        }
    }

    @Override // f1.d2
    public final void e() {
        e eVar = this.f9268f;
        if (eVar != null) {
            ((a2.b) eVar).e0();
        }
    }

    @Override // f1.d2
    public final void f() throws PendingIntent.CanceledException {
        a();
    }
}
