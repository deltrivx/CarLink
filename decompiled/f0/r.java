package f0;

import com.baidu.carlife.sdk.Constants;
import f1.h1;
import h0.c0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f4839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f4840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f4843f;

    public r(int i7, int i10, int i11) {
        this.f4838a = i11;
        switch (i11) {
            case 1:
                this.f4839b = new h1(i7);
                this.f4840c = new h1(i10);
                this.f4843f = new c0(i7, 90, Constants.MSG_RESPONSE_SUCCESS);
                break;
            default:
                this.f4839b = new h1(i7);
                this.f4840c = new h1(i10);
                this.f4843f = new c0(i7, 30, 100);
                break;
        }
    }

    public final void a(int i7, int i10) {
        switch (this.f4838a) {
            case 0:
                if (i7 < 0.0f) {
                    c0.b.a("Index should be non-negative (" + i7 + ')');
                }
                this.f4839b.g(i7);
                this.f4843f.b(i7);
                this.f4840c.g(i10);
                break;
            default:
                if (i7 < 0.0f) {
                    c0.b.a("Index should be non-negative");
                }
                this.f4839b.g(i7);
                this.f4843f.b(i7);
                this.f4840c.g(i10);
                break;
        }
    }
}
