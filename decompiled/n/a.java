package n;

import android.view.MenuInflater;
import android.view.View;
import x9.e1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8639a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8641c;

    public /* synthetic */ a() {
    }

    public a(String str, boolean z10) {
        this.f8641c = str;
        this.f8640b = z10;
    }

    public Integer a(a aVar) {
        i9.l.e(aVar, "visibility");
        v8.e eVar = e1.f14700a;
        if (this == aVar) {
            return 0;
        }
        v8.e eVar2 = e1.f14700a;
        Integer num = (Integer) eVar2.get(this);
        Integer num2 = (Integer) eVar2.get(aVar);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View c();

    public String d() {
        return (String) this.f8641c;
    }

    public abstract o.m e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public a k() {
        return this;
    }

    public abstract void l(View view);

    public abstract void m(int i7);

    public abstract void n(CharSequence charSequence);

    public abstract void o(int i7);

    public abstract void p(CharSequence charSequence);

    public abstract void r(boolean z10);

    public String toString() {
        switch (this.f8639a) {
            case 1:
                return d();
            default:
                return super.toString();
        }
    }
}
